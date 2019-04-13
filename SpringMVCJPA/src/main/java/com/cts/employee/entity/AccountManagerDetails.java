package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Account_Manager_Details")
public class AccountManagerDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="Account_Manager_Code")
	private String accountManagerCode;
	@Column (name="Account_Id")
	private Integer accountId;
	@Column (name="account_Manager_CTS_Id")
	private Integer accountManagerCTSId;
	private Integer account_Manager_GPIN;
	private String account_Manager_Name;
	private String effective_Date;
	private Integer updated_By;
	private String updated_Date;
	/**
	 * @return the accountManagerCode
	 */
	public String getAccountManagerCode() {
		return accountManagerCode;
	}
	/**
	 * @param accountManagerCode the accountManagerCode to set
	 */
	public void setAccountManagerCode(String accountManagerCode) {
		this.accountManagerCode = accountManagerCode;
	}
	/**
	 * @return the accountId
	 */
	public Integer getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
	/**
	 * @return the accountManagerCtsId
	 */
	public Integer getAccountManagerCTSId() {
		return accountManagerCTSId;
	}
	/**
	 * @param accountManagerCtsId the accountManagerCtsId to set
	 */
	public void setAccountManagerCTSId(Integer accountManagerCtsId) {
		this.accountManagerCTSId = accountManagerCtsId;
	}
	/**
	 * @return the account_Manager_GPIN
	 */
	public Integer getAccount_Manager_GPIN() {
		return account_Manager_GPIN;
	}
	/**
	 * @param account_Manager_GPIN the account_Manager_GPIN to set
	 */
	public void setAccount_Manager_GPIN(Integer account_Manager_GPIN) {
		this.account_Manager_GPIN = account_Manager_GPIN;
	}
	/**
	 * @return the account_Manager_Name
	 */
	public String getAccount_Manager_Name() {
		return account_Manager_Name;
	}
	/**
	 * @param account_Manager_Name the account_Manager_Name to set
	 */
	public void setAccount_Manager_Name(String account_Manager_Name) {
		this.account_Manager_Name = account_Manager_Name;
	}
	/**
	 * @return the effective_Date
	 */
	public String getEffective_Date() {
		return effective_Date;
	}
	/**
	 * @param effective_Date the effective_Date to set
	 */
	public void setEffective_Date(String effective_Date) {
		this.effective_Date = effective_Date;
	}
	/**
	 * @return the updated_By
	 */
	public Integer getUpdated_By() {
		return updated_By;
	}
	/**
	 * @param updated_By the updated_By to set
	 */
	public void setUpdated_By(Integer updated_By) {
		this.updated_By = updated_By;
	}
	/**
	 * @return the updated_Date
	 */
	public String getUpdated_Date() {
		return updated_Date;
	}
	/**
	 * @param updated_Date the updated_Date to set
	 */
	public void setUpdated_Date(String updated_Date) {
		this.updated_Date = updated_Date;
	}
	
}
