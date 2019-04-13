package com.cts.employee.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "Tbl_Invoice_Tracker_Details")
public class InvoiceSummary {

	@Id 
	@Basic(optional = false)
	@Column (name="Invoice_Id")
	private String invoiceId;
	private int Inv_Year;
	private int Inv_Month;
	private String Trn_Type;
	private String Currency;
	private Double Inv_Amt_Pre_Tax;
	private Double USD_Equ_Pre_Tax;
	private Double Amt_Due_Post_Tax;
	private Double USD_Equ_Post_Tax;
	private String S2C_Id;
	private String Cost_Centre;
	private String Project_Id;
	private String Project_Desc;
	private String Process;
	private String PM_Id;
	private String PM_Name;
	private String Cust_Id;
	private String Cust_Name;
	private String AM_Id;
	private String AM_Name;
	private String Sector;
	private String Sub_Sect;
	private String Region;
	private String Inv_Status;
	private String Remarks;
	private Double Inv_Aging_As_Today;
	private Double AR_Interest;
	private Double Inv_Aging_Me;
	private Double Proj_AR_Interest;
	private String Updated_By;
	private Date Updated_On;
	private String Invoice_Sent_Date;
	private String Invoice_Date;
	/**
	 * @return the invoice_Sent_Date
	 */
	public String getInvoice_Sent_Date() {
		return Invoice_Sent_Date;
	}
	/**
	 * @param invoice_Sent_Date the invoice_Sent_Date to set
	 */
	public void setInvoice_Sent_Date(String invoice_Sent_Date) {
		Invoice_Sent_Date = invoice_Sent_Date;
	}
	/**
	 * @return the invoice_Date
	 */
	public String getInvoice_Date() {
		return Invoice_Date;
	}
	/**
	 * @param invoice_Date the invoice_Date to set
	 */
	public void setInvoice_Date(String invoice_Date) {
		Invoice_Date = invoice_Date;
	}
	/**
	 * @return the invoiceId
	 */
	public String getInvoiceId() {
		return invoiceId;
	}
	/**
	 * @param invoiceId the invoiceId to set
	 */
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	/**
	 * @return the inv_Year
	 */
	public int getInv_Year() {
		return Inv_Year;
	}
	/**
	 * @param inv_Year the inv_Year to set
	 */
	public void setInv_Year(int inv_Year) {
		Inv_Year = inv_Year;
	}
	/**
	 * @return the inv_Month
	 */
	public int getInv_Month() {
		return Inv_Month;
	}
	/**
	 * @param inv_Month the inv_Month to set
	 */
	public void setInv_Month(int inv_Month) {
		Inv_Month = inv_Month;
	}
	/**
	 * @return the trn_Type
	 */
	public String getTrn_Type() {
		return Trn_Type;
	}
	/**
	 * @param trn_Type the trn_Type to set
	 */
	public void setTrn_Type(String trn_Type) {
		Trn_Type = trn_Type;
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
	 * @return the inv_Amt_Pre_Tax
	 */
	public Double getInv_Amt_Pre_Tax() {
		return Inv_Amt_Pre_Tax;
	}
	/**
	 * @param inv_Amt_Pre_Tax the inv_Amt_Pre_Tax to set
	 */
	public void setInv_Amt_Pre_Tax(Double inv_Amt_Pre_Tax) {
		Inv_Amt_Pre_Tax = inv_Amt_Pre_Tax;
	}
	/**
	 * @return the uSD_Equ_Pre_Tax
	 */
	public Double getUSD_Equ_Pre_Tax() {
		return USD_Equ_Pre_Tax;
	}
	/**
	 * @param uSD_Equ_Pre_Tax the uSD_Equ_Pre_Tax to set
	 */
	public void setUSD_Equ_Pre_Tax(Double uSD_Equ_Pre_Tax) {
		USD_Equ_Pre_Tax = uSD_Equ_Pre_Tax;
	}
	/**
	 * @return the amt_Due_Post_Tax
	 */
	public Double getAmt_Due_Post_Tax() {
		return Amt_Due_Post_Tax;
	}
	/**
	 * @param amt_Due_Post_Tax the amt_Due_Post_Tax to set
	 */
	public void setAmt_Due_Post_Tax(Double amt_Due_Post_Tax) {
		Amt_Due_Post_Tax = amt_Due_Post_Tax;
	}
	/**
	 * @return the uSD_Equ_Post_Tax
	 */
	public Double getUSD_Equ_Post_Tax() {
		return USD_Equ_Post_Tax;
	}
	/**
	 * @param uSD_Equ_Post_Tax the uSD_Equ_Post_Tax to set
	 */
	public void setUSD_Equ_Post_Tax(Double uSD_Equ_Post_Tax) {
		USD_Equ_Post_Tax = uSD_Equ_Post_Tax;
	}
	/**
	 * @return the s2C_Id
	 */
	public String getS2C_Id() {
		return S2C_Id;
	}
	/**
	 * @param s2c_Id the s2C_Id to set
	 */
	public void setS2C_Id(String s2c_Id) {
		S2C_Id = s2c_Id;
	}
	/**
	 * @return the cost_Centre
	 */
	public String getCost_Centre() {
		return Cost_Centre;
	}
	/**
	 * @param cost_Centre the cost_Centre to set
	 */
	public void setCost_Centre(String cost_Centre) {
		Cost_Centre = cost_Centre;
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
	 * @return the project_Desc
	 */
	public String getProject_Desc() {
		return Project_Desc;
	}
	/**
	 * @param project_Desc the project_Desc to set
	 */
	public void setProject_Desc(String project_Desc) {
		Project_Desc = project_Desc;
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
	 * @return the pM_Id
	 */
	public String getPM_Id() {
		return PM_Id;
	}
	/**
	 * @param pM_Id the pM_Id to set
	 */
	public void setPM_Id(String pM_Id) {
		PM_Id = pM_Id;
	}
	/**
	 * @return the pM_Name
	 */
	public String getPM_Name() {
		return PM_Name;
	}
	/**
	 * @param pM_Name the pM_Name to set
	 */
	public void setPM_Name(String pM_Name) {
		PM_Name = pM_Name;
	}
	/**
	 * @return the cust_Id
	 */
	public String getCust_Id() {
		return Cust_Id;
	}
	/**
	 * @param cust_Id the cust_Id to set
	 */
	public void setCust_Id(String cust_Id) {
		Cust_Id = cust_Id;
	}
	/**
	 * @return the cust_Name
	 */
	public String getCust_Name() {
		return Cust_Name;
	}
	/**
	 * @param cust_Name the cust_Name to set
	 */
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	/**
	 * @return the aM_Id
	 */
	public String getAM_Id() {
		return AM_Id;
	}
	/**
	 * @param aM_Id the aM_Id to set
	 */
	public void setAM_Id(String aM_Id) {
		AM_Id = aM_Id;
	}
	/**
	 * @return the aM_Name
	 */
	public String getAM_Name() {
		return AM_Name;
	}
	/**
	 * @param aM_Name the aM_Name to set
	 */
	public void setAM_Name(String aM_Name) {
		AM_Name = aM_Name;
	}
	/**
	 * @return the sector
	 */
	public String getSector() {
		return Sector;
	}
	/**
	 * @param sector the sector to set
	 */
	public void setSector(String sector) {
		Sector = sector;
	}
	/**
	 * @return the sub_Sect
	 */
	public String getSub_Sect() {
		return Sub_Sect;
	}
	/**
	 * @param sub_Sect the sub_Sect to set
	 */
	public void setSub_Sect(String sub_Sect) {
		Sub_Sect = sub_Sect;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return Region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		Region = region;
	}
	/**
	 * @return the inv_Status
	 */
	public String getInv_Status() {
		return Inv_Status;
	}
	/**
	 * @param inv_Status the inv_Status to set
	 */
	public void setInv_Status(String inv_Status) {
		Inv_Status = inv_Status;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return Remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	/**
	 * @return the inv_Aging_As_Today
	 */
	public Double getInv_Aging_As_Today() {
		return Inv_Aging_As_Today;
	}
	/**
	 * @param inv_Aging_As_Today the inv_Aging_As_Today to set
	 */
	public void setInv_Aging_As_Today(Double inv_Aging_As_Today) {
		Inv_Aging_As_Today = inv_Aging_As_Today;
	}
	/**
	 * @return the aR_Interest
	 */
	public Double getAR_Interest() {
		return AR_Interest;
	}
	/**
	 * @param aR_Interest the aR_Interest to set
	 */
	public void setAR_Interest(Double aR_Interest) {
		AR_Interest = aR_Interest;
	}
	/**
	 * @return the inv_Aging_Me
	 */
	public Double getInv_Aging_Me() {
		return Inv_Aging_Me;
	}
	/**
	 * @param inv_Aging_Me the inv_Aging_Me to set
	 */
	public void setInv_Aging_Me(Double inv_Aging_Me) {
		Inv_Aging_Me = inv_Aging_Me;
	}
	/**
	 * @return the proj_AR_Interest
	 */
	public Double getProj_AR_Interest() {
		return Proj_AR_Interest;
	}
	/**
	 * @param proj_AR_Interest the proj_AR_Interest to set
	 */
	public void setProj_AR_Interest(Double proj_AR_Interest) {
		Proj_AR_Interest = proj_AR_Interest;
	}
	/**
	 * @return the updated_By
	 */
	public String getUpdated_By() {
		return Updated_By;
	}
	/**
	 * @param updated_By the updated_By to set
	 */
	public void setUpdated_By(String updated_By) {
		Updated_By = updated_By;
	}
	/**
	 * @return the updated_On
	 */
	public Date getUpdated_On() {
		return Updated_On;
	}
	/**
	 * @param updated_On the updated_On to set
	 */
	public void setUpdated_On(Date updated_On) {
		Updated_On = updated_On;
	}
	
	
}
