package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AssociateAllowance {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Basic(optional = false)
	@Column (name="Allowance_Id")
	private Integer allowanceId;
	
	
	public Integer getAllowanceId() {
		return allowanceId;
	}

	public void setAllowanceId(Integer allowanceId) {
		this.allowanceId = allowanceId;
	}

	@Column(name = "Associate_Id")
	private Integer associateId;

	@Column(name = "Function_Type")
	private String function;

	@Column(name = "Associate_Name")
	private String associateName;

	@Column(name = "Project_ID")
	private String projectId;

	@Column(name = "Project_Name")
	private String projectName;

	@Column(name = "Category")
	private String category;

	@Column(name = "No_Days")
	private Integer days;

	@Column(name = "Amount")
	private Float amount;

	@Column(name = "Type")
	private String type;

	@Column(name = "Month")
	private Integer month;

	@Column(name = "Remarks")
	private String remarks;

	@Column(name = "Approved_By")
	private Integer approvedBy;

	@Column(name = "Advised_By")
	private Integer advisedBy;

	
	@Column(name = "Payment_Status")
	private String paymentStatus;

	@Column(name = "Comments")
	private String comments;

	@Column(name = "Input_Type")
	private String inputType;
	
	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public Integer getAssociateId() {
		return associateId;
	}

	public void setAssociateId(Integer associateId) {
		this.associateId = associateId;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(Integer approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getAdvisedBy() {
		return advisedBy;
	}

	public void setAdvisedBy(Integer advisedBy) {
		this.advisedBy = advisedBy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AssociateAllowance [allowanceId=");
		builder.append(allowanceId);
		builder.append(", associateId=");
		builder.append(associateId);
		builder.append(", function=");
		builder.append(function);
		builder.append(", associateName=");
		builder.append(associateName);
		builder.append(", projectId=");
		builder.append(projectId);
		builder.append(", projectName=");
		builder.append(projectName);
		builder.append(", category=");
		builder.append(category);
		builder.append(", days=");
		builder.append(days);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", type=");
		builder.append(type);
		builder.append(", month=");
		builder.append(month);
		builder.append(", remarks=");
		builder.append(remarks);
		builder.append(", approvedBy=");
		builder.append(approvedBy);
		builder.append(", advisedBy=");
		builder.append(advisedBy);
		builder.append(", paymentStatus=");
		builder.append(paymentStatus);
		builder.append(", comments=");
		builder.append(comments);
		builder.append(", inputType=");
		builder.append(inputType);
		builder.append("]");
		return builder.toString();
	}
	
	 @Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof AssociateAllowance)) {
			return false;
		}
		AssociateAllowance allowance = (AssociateAllowance) o;
		return allowance.associateId.equals(associateId) &&
				allowance.inputType.equals(inputType)
				&& allowance.month.equals(month);
	}

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + associateId.hashCode();
        result = 31 * result + month;
        result = 31 * result + inputType.hashCode();
        return result;
    }
}
