package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_associate_contact_details")
public class AssociateContact {
	
	@Id
    @Basic(optional = false)
	private Integer Associate_CTS_Id;
	private int associate_Contact_Number;
	private int associate_Alternate_Number;
	private String associate_CTS_Mail_Address;
	private String associate_UBS_Mail_Address;
	private String associate_Address;
	private String updated_By;
	private String updated_Date;
	
	/**
	 * @return the associate_CTS_Id
	 */
	public Integer getAssociate_CTS_Id() {
		return Associate_CTS_Id;
	}
	/**
	 * @param associate_CTS_Id the associate_CTS_Id to set
	 */
	public void setAssociate_CTS_Id(Integer associate_CTS_Id) {
		Associate_CTS_Id = associate_CTS_Id;
	}
	/**
	 * @return the associate_Contact_Number
	 */
	public int getAssociate_Contact_Number() {
		return associate_Contact_Number;
	}
	/**
	 * @param associate_Contact_Number the associate_Contact_Number to set
	 */
	public void setAssociate_Contact_Number(int associate_Contact_Number) {
		this.associate_Contact_Number = associate_Contact_Number;
	}
	/**
	 * @return the associate_Alternate_Number
	 */
	public int getAssociate_Alternate_Number() {
		return associate_Alternate_Number;
	}
	/**
	 * @param associate_Alternate_Number the associate_Alternate_Number to set
	 */
	public void setAssociate_Alternate_Number(int associate_Alternate_Number) {
		this.associate_Alternate_Number = associate_Alternate_Number;
	}
	/**
	 * @return the associate_CTS_Mail_Address
	 */
	public String getAssociate_CTS_Mail_Address() {
		return associate_CTS_Mail_Address;
	}
	/**
	 * @param associate_CTS_Mail_Address the associate_CTS_Mail_Address to set
	 */
	public void setAssociate_CTS_Mail_Address(String associate_CTS_Mail_Address) {
		this.associate_CTS_Mail_Address = associate_CTS_Mail_Address;
	}
	/**
	 * @return the associate_UBS_Mail_Address
	 */
	public String getAssociate_UBS_Mail_Address() {
		return associate_UBS_Mail_Address;
	}
	/**
	 * @param associate_UBS_Mail_Address the associate_UBS_Mail_Address to set
	 */
	public void setAssociate_UBS_Mail_Address(String associate_UBS_Mail_Address) {
		this.associate_UBS_Mail_Address = associate_UBS_Mail_Address;
	}
	/**
	 * @return the associate_Address
	 */
	public String getAssociate_Address() {
		return associate_Address;
	}
	/**
	 * @param associate_Address the associate_Address to set
	 */
	public void setAssociate_Address(String associate_Address) {
		this.associate_Address = associate_Address;
	}
	/**
	 * @return the updated_By
	 */
	public String getUpdated_By() {
		return updated_By;
	}
	/**
	 * @param updated_By the updated_By to set
	 */
	public void setUpdated_By(String updated_By) {
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
