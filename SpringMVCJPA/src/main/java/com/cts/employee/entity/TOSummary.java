package com.cts.employee.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "Tbl_TO_Tracker_Details")
public class TOSummary {

	@Id 
	@Basic(optional = false)
	@Column (name="S2C_Number")
	private String s2cNumber;
	private String Parent_TO;
	@Column (name="Type")
	private String Task_Type;
	private String ODP_Number;
	private String CTS_Legal_Entity;
	private String UBS_Legal_Entity;
	private String UBS_Affiliates;
	private String Services_Coverage_Region;
	private String Project_Id;
	private String Project_Name;
	private String Process;
	private String CTS_Business_Manager;
	private String UBS_Business_Manager;
	private String Eff_Date;
	private String Exp_Date;
	private String Currency;
	private String FTE_Effort_Charges;
	private String Discount_Amount;
	private String Expense_Amount;
	private String Contract_Value;
	private String Type_Of_Contract;
	private String Task_Order_Status;
	private String Reason_For_CCN;
	private String Change_Contract_Value;
	private int updated_by;
	private String updated_on;
	
	
	/**
	 * @return the s2cNumber
	 */
	public String getS2cNumber() {
		return s2cNumber;
	}
	/**
	 * @param s2cNumber the s2cNumber to set
	 */
	public void setS2cNumber(String s2cNumber) {
		this.s2cNumber = s2cNumber;
	}
	
	
	/**
	 * @return the parent_TO
	 */
	public String getParent_TO() {
		return Parent_TO;
	}
	/**
	 * @param parent_TO the parent_TO to set
	 */
	public void setParent_TO(String parent_TO) {
		Parent_TO = parent_TO;
	}
	/**
	 * @return the task_Type
	 */
	public String getTask_Type() {
		return Task_Type;
	}
	/**
	 * @param task_Type the task_Type to set
	 */
	public void setTask_Type(String task_Type) {
		Task_Type = task_Type;
	}
	/**
	 * @return the oDP_Number
	 */
	public String getODP_Number() {
		return ODP_Number;
	}
	/**
	 * @param oDP_Number the oDP_Number to set
	 */
	public void setODP_Number(String oDP_Number) {
		ODP_Number = oDP_Number;
	}
	/**
	 * @return the cTS_Legal_Entity
	 */
	public String getCTS_Legal_Entity() {
		return CTS_Legal_Entity;
	}
	/**
	 * @param cTS_Legal_Entity the cTS_Legal_Entity to set
	 */
	public void setCTS_Legal_Entity(String cTS_Legal_Entity) {
		CTS_Legal_Entity = cTS_Legal_Entity;
	}
	/**
	 * @return the uBS_Legal_Entity
	 */
	public String getUBS_Legal_Entity() {
		return UBS_Legal_Entity;
	}
	/**
	 * @param uBS_Legal_Entity the uBS_Legal_Entity to set
	 */
	public void setUBS_Legal_Entity(String uBS_Legal_Entity) {
		UBS_Legal_Entity = uBS_Legal_Entity;
	}
	/**
	 * @return the uBS_Affiliates
	 */
	public String getUBS_Affiliates() {
		return UBS_Affiliates;
	}
	/**
	 * @param uBS_Affiliates the uBS_Affiliates to set
	 */
	public void setUBS_Affiliates(String uBS_Affiliates) {
		UBS_Affiliates = uBS_Affiliates;
	}
	/**
	 * @return the services_Coverage_Region
	 */
	public String getServices_Coverage_Region() {
		return Services_Coverage_Region;
	}
	/**
	 * @param services_Coverage_Region the services_Coverage_Region to set
	 */
	public void setServices_Coverage_Region(String services_Coverage_Region) {
		Services_Coverage_Region = services_Coverage_Region;
	}
	/**
	 * @return the project_Id
	 */
	public String getProject_Id() {
		return Project_Id;
	}
	/**
	 * @param project_Id the project_Id to set
	 */
	public void setProject_Id(String project_Id) {
		Project_Id = project_Id;
	}
	/**
	 * @return the project_Name
	 */
	public String getProject_Name() {
		return Project_Name;
	}
	/**
	 * @param project_Name the project_Name to set
	 */
	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
	}
	/**
	 * @return the process
	 */
	public String getProcess() {
		return Process;
	}
	/**
	 * @param process the process to set
	 */
	public void setProcess(String process) {
		Process = process;
	}
	/**
	 * @return the cTS_Business_Manager
	 */
	public String getCTS_Business_Manager() {
		return CTS_Business_Manager;
	}
	/**
	 * @param cTS_Business_Manager the cTS_Business_Manager to set
	 */
	public void setCTS_Business_Manager(String cTS_Business_Manager) {
		CTS_Business_Manager = cTS_Business_Manager;
	}
	/**
	 * @return the uBS_Business_Manager
	 */
	public String getUBS_Business_Manager() {
		return UBS_Business_Manager;
	}
	/**
	 * @param uBS_Business_Manager the uBS_Business_Manager to set
	 */
	public void setUBS_Business_Manager(String uBS_Business_Manager) {
		UBS_Business_Manager = uBS_Business_Manager;
	}
	/**
	 * @return the eff_Date
	 */
	public String getEff_Date() {
		return Eff_Date;
	}
	/**
	 * @param eff_Date the eff_Date to set
	 */
	public void setEff_Date(String eff_Date) {
		Eff_Date = eff_Date;
	}
	/**
	 * @return the exp_Date
	 */
	public String getExp_Date() {
		return Exp_Date;
	}
	/**
	 * @param exp_Date the exp_Date to set
	 */
	public void setExp_Date(String exp_Date) {
		Exp_Date = exp_Date;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return Currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		Currency = currency;
	}
	/**
	 * @return the fTE_Effort_Charges
	 */
	public String getFTE_Effort_Charges() {
		return FTE_Effort_Charges;
	}
	/**
	 * @param fTE_Effort_Charges the fTE_Effort_Charges to set
	 */
	public void setFTE_Effort_Charges(String fTE_Effort_Charges) {
		FTE_Effort_Charges = fTE_Effort_Charges;
	}
	/**
	 * @return the discount_Amount
	 */
	public String getDiscount_Amount() {
		return Discount_Amount;
	}
	/**
	 * @param discount_Amount the discount_Amount to set
	 */
	public void setDiscount_Amount(String discount_Amount) {
		Discount_Amount = discount_Amount;
	}
	/**
	 * @return the expense_Amount
	 */
	public String getExpense_Amount() {
		return Expense_Amount;
	}
	/**
	 * @param expense_Amount the expense_Amount to set
	 */
	public void setExpense_Amount(String expense_Amount) {
		Expense_Amount = expense_Amount;
	}
	/**
	 * @return the contract_Value
	 */
	public String getContract_Value() {
		return Contract_Value;
	}
	/**
	 * @param contract_Value the contract_Value to set
	 */
	public void setContract_Value(String contract_Value) {
		Contract_Value = contract_Value;
	}
	/**
	 * @return the type_Of_Contract
	 */
	public String getType_Of_Contract() {
		return Type_Of_Contract;
	}
	/**
	 * @param type_Of_Contract the type_Of_Contract to set
	 */
	public void setType_Of_Contract(String type_Of_Contract) {
		Type_Of_Contract = type_Of_Contract;
	}
	/**
	 * @return the task_Order_Status
	 */
	public String getTask_Order_Status() {
		return Task_Order_Status;
	}
	/**
	 * @param task_Order_Status the task_Order_Status to set
	 */
	public void setTask_Order_Status(String task_Order_Status) {
		Task_Order_Status = task_Order_Status;
	}
	/**
	 * @return the reason_For_CCN
	 */
	public String getReason_For_CCN() {
		return Reason_For_CCN;
	}
	/**
	 * @param reason_For_CCN the reason_For_CCN to set
	 */
	public void setReason_For_CCN(String reason_For_CCN) {
		Reason_For_CCN = reason_For_CCN;
	}
	/**
	 * @return the change_Contract_Value
	 */
	public String getChange_Contract_Value() {
		return Change_Contract_Value;
	}
	/**
	 * @param change_Contract_Value the change_Contract_Value to set
	 */
	public void setChange_Contract_Value(String change_Contract_Value) {
		Change_Contract_Value = change_Contract_Value;
	}
	
	/**
	 * @return the updated_by
	 */
	public int getUpdated_by() {
		return updated_by;
	}
	/**
	 * @param updated_by the updated_by to set
	 */
	public void setUpdated_by(int updated_by) {
		this.updated_by = updated_by;
	}
	/**
	 * @return the updated_on
	 */
	public String getUpdated_on() {
		return updated_on;
	}
	/**
	 * @param updated_on the updated_on to set
	 */
	public void setUpdated_on(String updated_on) {
		this.updated_on = updated_on;
	}
	
}
