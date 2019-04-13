package com.cts.employee.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.junit.Test;
import org.springframework.stereotype.Service;
import com.cts.employee.entity.AssociateAllowance;
import com.cts.employee.entity.AssociateShiftAllowance;
import com.cts.employee.entity.AssociateTransportAllowance;
import com.cts.employee.exception.AllowanceException;

//@SuppressWarnings("unused")
@Service
public class AllowanceDataProcessor {

	//TODO cleanup
	//private static final String FILE_NAME = "D:\\CHUB\\Project docs\\Latest\\SPAllowance_New.xlsx";	
	//private static final String FILE_NAME = "D:\\CHUB\\Project docs\\TransportAllowance.xlsx";
	

	/**
	 * This method processes the XLS allowance information into 
	 * allowance entity objects.
	 * @param source
	 * @param process
	 * @return
	 */
	public Map<String,Set< ? extends AssociateAllowance>> uploadAssociatesDetails(InputStream source, 
			String process)	throws AllowanceException {
		
		Map<String,List<String>> associateInfo	=	new HashMap<String,List<String>>();
		try {
			//TODO cleanup
			//FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
			//Workbook workbook = new XSSFWorkbook(excelFile);
			
			Workbook workbook = new XSSFWorkbook(source);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = datatypeSheet.iterator();
			int i=1;
			while (rowIterator.hasNext()) {
				Row currentRow = rowIterator.next();
				List<String> record = new ArrayList<String>();				
				if(currentRow.getRowNum() == 0)continue;
				Iterator<Cell> cellIterator = currentRow.iterator();
				int noCells = 0;				
				int countEmpty =0;
				
				while (cellIterator.hasNext()) {
					Cell currentCell = cellIterator.next();
					
					//System.out.println(currentCell.
					
					if (currentCell.getCellType() == Cell.CELL_TYPE_STRING) {
						record.add(currentCell.getStringCellValue());
						//System.out.print( currentCell.getStringCellValue() +"nnn \t");
					} else if (currentCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
						currentCell.setCellType(Cell.CELL_TYPE_STRING);
						//System.out.print(currentCell.getNumericCellValue() + "oooo\t");
						record.add(""+currentCell.getStringCellValue());
					}else if (currentCell.getCellType() == Cell.CELL_TYPE_BLANK) {
						//System.out.print(currentCell.getNumericCellValue() + "oooo\t");
						record.add(""+currentCell.getStringCellValue());
						countEmpty++;
					}
					noCells++;
				}
				if(countEmpty>4){
					System.out.println("Record is empty :: "+countEmpty);
					continue;
				}
				//TODO noCells not required future enhancement
				//System.out.println("no of cells :: "+noCells);
				associateInfo.put(""+i, record);
				i++;
			}
			
			//TODO cleanup
			System.out.println("associateInfo"+buildAllowanceEntities(associateInfo,process));
			return buildAllowanceEntities(associateInfo,process);
			
		} catch (FileNotFoundException e) {	throw new AllowanceException("XLS file not found",e);}
		 catch (IOException e) { throw new AllowanceException("XLS file not found",e);}
		catch (Exception e) { throw new AllowanceException("XLS file not found",e);}
		finally {
		}
	}
	
	
	
	/**
	 * This method updates the entities with status and list of mismatched entities.
	 * @param allowanceInDb
	 * @param uploadSet
	 * @return
	 */
	public Map<String,Set< ? extends AssociateAllowance>> updateAllowanceEntities
	(List< ? extends AssociateAllowance> allowanceInDb,Set< ? extends AssociateAllowance> uploadSet){
		Set<AssociateAllowance> allowanceNotFound = new HashSet<AssociateAllowance>();
		Set<AssociateAllowance> allowanceUpdatedDB = new HashSet<AssociateAllowance>();
		for(AssociateAllowance allowance:uploadSet){
			int indexInDB = allowanceInDb.indexOf(allowance);
			if(indexInDB !=-1){
				//update the status 
				AssociateAllowance updateAllowance = allowanceInDb.get(indexInDB);
				updateAllowance.setPaymentStatus(allowance.getPaymentStatus());
				updateAllowance.setComments(allowance.getComments());
				allowanceUpdatedDB.add(updateAllowance);
			}else{
				allowanceNotFound.add(allowance);
			}
		}
		Map<String,Set< ? extends AssociateAllowance>> resultMap = new 
				HashMap<String,Set< ? extends AssociateAllowance>>();
		resultMap.put(AllowanceConstants.UPDATED_RECORDS, allowanceUpdatedDB);
		resultMap.put(AllowanceConstants.NOT_MATCHED, allowanceNotFound);
		return resultMap;
	}
	
	
	/**
	 * Build Entity Model
	 * @param associateInfo
	 * @param process
	 * @return
	 */
	private Map<String,Set< ? extends AssociateAllowance>> buildAllowanceEntities(Map<String,List<String>> associateInfo,String process){
		Map<String,Set< ? extends AssociateAllowance>> resultMap = new 
				HashMap<String,Set< ? extends AssociateAllowance>>();
		Set<AssociateAllowance> listAllowance = new HashSet<AssociateAllowance>();
		Set<AssociateAllowance> listAllowanceRepeated = new HashSet<AssociateAllowance>();
		Set<AssociateAllowance> listAllowanceInvalidRecords = new HashSet<AssociateAllowance>();
		
		for(String key:associateInfo.keySet()){
			System.out.println(associateInfo.get(key));
			List<String> shiftRecord = associateInfo.get(key);			
			if(AllowanceConstants.SHIFT.equals(process)){					
				AssociateAllowance shiftAllowance = createAllowance(new AssociateShiftAllowance(), shiftRecord);				
				buildAllowanceModel(listAllowance,listAllowanceRepeated,listAllowanceInvalidRecords,shiftAllowance);				
			}else if(AllowanceConstants.OUTPUT.equals(process)){					
				AssociateAllowance transportAllowance = createAllowance(new AssociateTransportAllowance(), shiftRecord);
				buildAllowanceModel(listAllowance,listAllowanceRepeated,listAllowanceInvalidRecords,transportAllowance);
			}
		}		
		resultMap.put(AllowanceConstants.ALLOWANCE_RECORDS, listAllowance);
		resultMap.put(AllowanceConstants.DUPLICATE_RECORDS, listAllowanceRepeated);
		resultMap.put(AllowanceConstants.INVALID_RECORDS, listAllowanceInvalidRecords);
		System.out.println("\n\n\nDuplicate Repeated\n\n"+listAllowanceRepeated);
		return resultMap;
	}
	
	/**
	 * This method builds the parsed data from XLS file
	 * @param listAllowance
	 * @param listAllowanceRepeated
	 * @param listAllowanceInvalidRecords
	 * @param associateAllowance
	 */
	private void buildAllowanceModel(Set<AssociateAllowance> listAllowance,
			Set<AssociateAllowance> listAllowanceRepeated,
			Set<AssociateAllowance> listAllowanceInvalidRecords,
			AssociateAllowance associateAllowance){
		//validate the data model of entity
		if(validateEntity(associateAllowance)){
			if(!listAllowance.add(associateAllowance)){
				listAllowanceRepeated.add(associateAllowance);
			}
		}else{
			listAllowanceInvalidRecords.add(associateAllowance);
		}
		
	}
	/**
	 * Basic entity validations
	 * @param associateAllowance
	 * @return
	 */
	private boolean validateEntity(AssociateAllowance associateAllowance){
		boolean flag = true;
		if(associateAllowance.getAssociateId()==0) flag = false;
		if(associateAllowance.getMonth()==0) flag = false;
		if(associateAllowance.getProjectId().isEmpty()) flag = false;
		if(associateAllowance.getInputType().isEmpty()) flag = false;
		return flag;
	}
	
	/**
	 * Create allowance entity object
	 * @param shiftAllowance
	 * @param shiftRecord
	 * @return
	 */
	private AssociateAllowance createAllowance(AssociateAllowance shiftAllowance,List<String> shiftRecord){
		shiftAllowance.setFunction(shiftRecord.get(0));
		shiftAllowance.setAssociateId(checkForDecimalValue(shiftRecord.get(1)));
		shiftAllowance.setAssociateName(shiftRecord.get(2));
		shiftAllowance.setProjectId(shiftRecord.get(3));
		shiftAllowance.setProjectName(shiftRecord.get(4));
		shiftAllowance.setCategory(shiftRecord.get(5));
		shiftAllowance.setType(shiftRecord.get(6));
		
		//TODO cleanup
		//shiftAllowance.setInputType(shiftRecord.get(7));
		
		shiftAllowance.setInputType(formatInputType(shiftRecord.get(7)));
		
		
		//TODO validate months
		shiftAllowance.setMonth(parseMonth(shiftRecord.get(8))); 
		//shiftAllowance.setMonth(Integer.parseInt("7"));
		
		//TODO remove
		shiftAllowance.setDays(checkForDecimalValue(shiftRecord.get(9))); //index 9
		
		shiftAllowance.setAmount(Float.parseFloat(shiftRecord.get(10)));					
		shiftAllowance.setRemarks(shiftRecord.get(11));
		shiftAllowance.setAdvisedBy(checkForDecimalValue(shiftRecord.get(12)));
		shiftAllowance.setApprovedBy(checkForDecimalValue(shiftRecord.get(13)));
		shiftAllowance.setPaymentStatus(shiftRecord.get(14));				
		shiftAllowance.setComments(shiftRecord.get(15));
		return shiftAllowance;
	}
	
	private String formatInputType(String inputTypeText){
		if(!(inputTypeText.trim()).isEmpty()){
			if(inputTypeText.equalsIgnoreCase(AllowanceConstants.REGULAR)){
				return AllowanceConstants.REGULAR;
			}else if(inputTypeText.equalsIgnoreCase(AllowanceConstants.ARREAR)){
				return AllowanceConstants.ARREAR;
			}
		}
	return "";
	}
	
	/**
	 * This method parses number details
	 * @param monthText
	 * @return
	 */
	private Integer checkForDecimalValue(String value){
		if(!value.isEmpty() && value.indexOf(".") !=-1){
			value = value.split("\\.")[0];
		}
		int numVal = 0;
		if(!(value.trim()).isEmpty()){
			try {
				numVal = Integer.parseInt(value);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}		
		return numVal;
	}
	
	/**
	 * This method parses month details
	 * @param monthText
	 * @return
	 */
	private Integer parseMonth(String monthText){
		String month = "";
		if(!"".equals(monthText) && (monthText.indexOf("/")!=-1)){
			monthText = monthText.trim();
			month = monthText.split("\\/")[0];
		}
		
		int monthVal = 0;
		if(!(month.trim()).isEmpty()){
			try {
				monthVal = Integer.parseInt(month);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}		
		return monthVal;
	}
		
	//@Test
	public void testDataprocessor(){
	 try {
		uploadAssociatesDetails(null, "optout");
	} catch (AllowanceException e) {
		e.printStackTrace();
	}	
	}
}