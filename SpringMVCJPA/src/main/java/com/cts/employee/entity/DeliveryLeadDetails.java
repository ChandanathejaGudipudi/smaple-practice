package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Delivery_Lead_Details")
public class DeliveryLeadDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="Delivery_Lead_Code")
	private String deliveryLeadCode;
	@Column (name="Process_Code")
	private String processCode;
	@Column (name="Delivery_Lead_CTS_Id")
	private Integer deliveryLeadCTSId;
	private Integer delivery_Lead_GPIN;
	private String delivery_Lead_Name;
	private String effective_Date;
	private Integer updated_By;
	private String updated_Date;
	
	/**
	 * @return the deliveryLeadCTSId
	 */
	public Integer getDeliveryLeadCTSId() {
		return deliveryLeadCTSId;
	}
	/**
	 * @param deliveryLeadCTSId the deliveryLeadCTSId to set
	 */
	public void setDeliveryLeadCTSId(Integer deliveryLeadCTSId) {
		this.deliveryLeadCTSId = deliveryLeadCTSId;
	}
	/**
	 * @return the deliveryLeadCode
	 */
	public String getDeliveryLeadCode() {
		return deliveryLeadCode;
	}
	/**
	 * @param deliveryLeadCode the deliveryLeadCode to set
	 */
	public void setDeliveryLeadCode(String deliveryLeadCode) {
		this.deliveryLeadCode = deliveryLeadCode;
	}
	/**
	 * @return the processCode
	 */
	public String getProcessCode() {
		return processCode;
	}
	/**
	 * @param processCode the processCode to set
	 */
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}
	/**
	 * @return the delivery_Lead_GPIN
	 */
	public Integer getDelivery_Lead_GPIN() {
		return delivery_Lead_GPIN;
	}
	/**
	 * @param delivery_Lead_GPIN the delivery_Lead_GPIN to set
	 */
	public void setDelivery_Lead_GPIN(Integer delivery_Lead_GPIN) {
		this.delivery_Lead_GPIN = delivery_Lead_GPIN;
	}
	/**
	 * @return the delivery_Lead_Name
	 */
	public String getDelivery_Lead_Name() {
		return delivery_Lead_Name;
	}
	/**
	 * @param delivery_Lead_Name the delivery_Lead_Name to set
	 */
	public void setDelivery_Lead_Name(String delivery_Lead_Name) {
		this.delivery_Lead_Name = delivery_Lead_Name;
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
