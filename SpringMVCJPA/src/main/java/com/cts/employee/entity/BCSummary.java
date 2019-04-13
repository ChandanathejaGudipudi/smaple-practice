package com.cts.employee.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "Tbl_BC_Details")
public class BCSummary {

	@Id 
	@Basic(optional = false)
	@Column (name="BC_Id")
	private int bCId;
	private int BC_Year;
	private int BC_Month;
	private int ProjectId;
	private String Project_Name;
	private String Process;
	private String Parent_TO;
	private String S2C_Number;
	private String Cost_center;
	private String Currency;
	private String UOM;
	private Double UOM_Value;
	private String Loc_FTE;
	private String L1_Role;
	private Double L1_Rate;
	private Double L1_FTE;
	private String L2_Role;
	private Double L2_Rate;
	private Double L2_FTE;
	private String L3_Role;
	private Double L3_Rate;
	private Double L3_FTE;
	private String BSS_L1_Role;
	private Double BSS_L1_Rate;
	private Double BSS_L1_FTE;
	private String BSS_L2_Role;
	private Double BSS_L2_Rate;
	private Double BSS_L2_FTE;
	private String BSS_L3_Role;
	private Double BSS_L3_Rate;
	private Double BSS_L3_FTE;
	private String STF_Aug_L1_Role;
	private Double STF_Aug_L1_Rate;
	private int SAL1_Working_Days;
	private Double STF_Aug_L1_FTE;
	private String STF_Aug_L2_Role;
	private Double STF_Aug_L2_Rate;
	private int SAL2_Working_Days;
	private Double STF_Aug_L2_FTE;
	private String STF_Aug_L3_Role;
	private Double STF_Aug_L3_Rate;
	private int SAL3_Working_Days;
	private Double STF_Aug_L3_FTE;
	private String STF_Aug_Oth_Role;
	private Double STF_Aug_Oth_Rate;
	private int SA_Working_Days;
	private Double STF_Aug_Oth_FTE;
	private Double Pex_Bnf_L1_FTE;
	private Double Pex_Bnf_L2_FTE;
	private Double Pex_Bnf_L3_FTE;
	private Double Robo_Bnf_L1_FTE;
	private Double Robo_Bnf_L2_FTE;
	private Double Robo_Bnf_L3_FTE;
	private Double L1_Dis_Rate;
	private Double L1_Dis_FTE;
	private Double L2_Dis_Rate;
	private Double L2_Dis_FTE;
	private Double L3_Dis_Rate;
	private Double L3_Dis_FTE;
	private Double Tot_L1_FTE;
	private Double Tot_L1_FTE_Val;
	private Double Tot_L2_FTE;
	private Double Tot_L2_FTE_Val;
	private Double Tot_L3_FTE;
	private Double Tot_L3_FTE_Val;
	private Double Tot_BSS_L1_FTE_Val;
	private Double Tot_BSS_L2_FTE_Val;
	private Double Tot_BSS_L3_FTE_Val;
	private Double Tot_STF_Aug_L1_FTE_Val;
	private Double Tot_STF_Aug_L2_FTE_Val;
	private Double Tot_STF_Aug_L3_FTE_Val;
	private Double Tot_STF_Aug_Oth_FTE_Val;
	private Double Grand_Total_FTE;
	private Double Grand_Total_FTE_Val;
	private Double USD_Eq_Val;
	private String Updated_By;
	private String Updated_On;
	
	
	
	/**
	 * @return the bCId
	 */
	public int getbCId() {
		return bCId;
	}
	/**
	 * @param bCId the bCId to set
	 */
	public void setbCId(int bCId) {
		this.bCId = bCId;
	}
	/**
	 * @return the bC_Year
	 */
	public int getBC_Year() {
		return BC_Year;
	}
	/**
	 * @param bC_Year the bC_Year to set
	 */
	public void setBC_Year(int bC_Year) {
		BC_Year = bC_Year;
	}
	/**
	 * @return the bC_Month
	 */
	public int getBC_Month() {
		return BC_Month;
	}
	/**
	 * @param bC_Month the bC_Month to set
	 */
	public void setBC_Month(int bC_Month) {
		BC_Month = bC_Month;
	}
	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return ProjectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(int projectId) {
		ProjectId = projectId;
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
	 * @return the s2C_Number
	 */
	public String getS2C_Number() {
		return S2C_Number;
	}
	/**
	 * @param s2c_Number the s2C_Number to set
	 */
	public void setS2C_Number(String s2c_Number) {
		S2C_Number = s2c_Number;
	}
	/**
	 * @return the cost_center
	 */
	public String getCost_center() {
		return Cost_center;
	}
	/**
	 * @param cost_center the cost_center to set
	 */
	public void setCost_center(String cost_center) {
		Cost_center = cost_center;
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
	 * @return the uOM
	 */
	public String getUOM() {
		return UOM;
	}
	/**
	 * @param uOM the uOM to set
	 */
	public void setUOM(String uOM) {
		UOM = uOM;
	}
	/**
	 * @return the uOM_Value
	 */
	public Double getUOM_Value() {
		return UOM_Value;
	}
	/**
	 * @param uOM_Value the uOM_Value to set
	 */
	public void setUOM_Value(Double uOM_Value) {
		UOM_Value = uOM_Value;
	}
	/**
	 * @return the loc_FTE
	 */
	public String getLoc_FTE() {
		return Loc_FTE;
	}
	/**
	 * @param loc_FTE the loc_FTE to set
	 */
	public void setLoc_FTE(String loc_FTE) {
		Loc_FTE = loc_FTE;
	}
	/**
	 * @return the l1_Role
	 */
	public String getL1_Role() {
		return L1_Role;
	}
	/**
	 * @param l1_Role the l1_Role to set
	 */
	public void setL1_Role(String l1_Role) {
		L1_Role = l1_Role;
	}
	/**
	 * @return the l1_Rate
	 */
	public Double getL1_Rate() {
		return L1_Rate;
	}
	/**
	 * @param l1_Rate the l1_Rate to set
	 */
	public void setL1_Rate(Double l1_Rate) {
		L1_Rate = l1_Rate;
	}
	/**
	 * @return the l1_FTE
	 */
	public Double getL1_FTE() {
		return L1_FTE;
	}
	/**
	 * @param l1_FTE the l1_FTE to set
	 */
	public void setL1_FTE(Double l1_FTE) {
		L1_FTE = l1_FTE;
	}
	/**
	 * @return the l2_Role
	 */
	public String getL2_Role() {
		return L2_Role;
	}
	/**
	 * @param l2_Role the l2_Role to set
	 */
	public void setL2_Role(String l2_Role) {
		L2_Role = l2_Role;
	}
	/**
	 * @return the l2_Rate
	 */
	public Double getL2_Rate() {
		return L2_Rate;
	}
	/**
	 * @param l2_Rate the l2_Rate to set
	 */
	public void setL2_Rate(Double l2_Rate) {
		L2_Rate = l2_Rate;
	}
	/**
	 * @return the l2_FTE
	 */
	public Double getL2_FTE() {
		return L2_FTE;
	}
	/**
	 * @param l2_FTE the l2_FTE to set
	 */
	public void setL2_FTE(Double l2_FTE) {
		L2_FTE = l2_FTE;
	}
	/**
	 * @return the l3_Role
	 */
	public String getL3_Role() {
		return L3_Role;
	}
	/**
	 * @param l3_Role the l3_Role to set
	 */
	public void setL3_Role(String l3_Role) {
		L3_Role = l3_Role;
	}
	/**
	 * @return the l3_Rate
	 */
	public Double getL3_Rate() {
		return L3_Rate;
	}
	/**
	 * @param l3_Rate the l3_Rate to set
	 */
	public void setL3_Rate(Double l3_Rate) {
		L3_Rate = l3_Rate;
	}
	/**
	 * @return the l3_FTE
	 */
	public Double getL3_FTE() {
		return L3_FTE;
	}
	/**
	 * @param l3_FTE the l3_FTE to set
	 */
	public void setL3_FTE(Double l3_FTE) {
		L3_FTE = l3_FTE;
	}
	/**
	 * @return the bSS_L1_Role
	 */
	public String getBSS_L1_Role() {
		return BSS_L1_Role;
	}
	/**
	 * @param bSS_L1_Role the bSS_L1_Role to set
	 */
	public void setBSS_L1_Role(String bSS_L1_Role) {
		BSS_L1_Role = bSS_L1_Role;
	}
	/**
	 * @return the bSS_L1_Rate
	 */
	public Double getBSS_L1_Rate() {
		return BSS_L1_Rate;
	}
	/**
	 * @param bSS_L1_Rate the bSS_L1_Rate to set
	 */
	public void setBSS_L1_Rate(Double bSS_L1_Rate) {
		BSS_L1_Rate = bSS_L1_Rate;
	}
	/**
	 * @return the bSS_L1_FTE
	 */
	public Double getBSS_L1_FTE() {
		return BSS_L1_FTE;
	}
	/**
	 * @param bSS_L1_FTE the bSS_L1_FTE to set
	 */
	public void setBSS_L1_FTE(Double bSS_L1_FTE) {
		BSS_L1_FTE = bSS_L1_FTE;
	}
	/**
	 * @return the bSS_L2_Role
	 */
	public String getBSS_L2_Role() {
		return BSS_L2_Role;
	}
	/**
	 * @param bSS_L2_Role the bSS_L2_Role to set
	 */
	public void setBSS_L2_Role(String bSS_L2_Role) {
		BSS_L2_Role = bSS_L2_Role;
	}
	/**
	 * @return the bSS_L2_Rate
	 */
	public Double getBSS_L2_Rate() {
		return BSS_L2_Rate;
	}
	/**
	 * @param bSS_L2_Rate the bSS_L2_Rate to set
	 */
	public void setBSS_L2_Rate(Double bSS_L2_Rate) {
		BSS_L2_Rate = bSS_L2_Rate;
	}
	/**
	 * @return the bSS_L2_FTE
	 */
	public Double getBSS_L2_FTE() {
		return BSS_L2_FTE;
	}
	/**
	 * @param bSS_L2_FTE the bSS_L2_FTE to set
	 */
	public void setBSS_L2_FTE(Double bSS_L2_FTE) {
		BSS_L2_FTE = bSS_L2_FTE;
	}
	/**
	 * @return the bSS_L3_Role
	 */
	public String getBSS_L3_Role() {
		return BSS_L3_Role;
	}
	/**
	 * @param bSS_L3_Role the bSS_L3_Role to set
	 */
	public void setBSS_L3_Role(String bSS_L3_Role) {
		BSS_L3_Role = bSS_L3_Role;
	}
	/**
	 * @return the bSS_L3_Rate
	 */
	public Double getBSS_L3_Rate() {
		return BSS_L3_Rate;
	}
	/**
	 * @param bSS_L3_Rate the bSS_L3_Rate to set
	 */
	public void setBSS_L3_Rate(Double bSS_L3_Rate) {
		BSS_L3_Rate = bSS_L3_Rate;
	}
	/**
	 * @return the bSS_L3_FTE
	 */
	public Double getBSS_L3_FTE() {
		return BSS_L3_FTE;
	}
	/**
	 * @param bSS_L3_FTE the bSS_L3_FTE to set
	 */
	public void setBSS_L3_FTE(Double bSS_L3_FTE) {
		BSS_L3_FTE = bSS_L3_FTE;
	}
	/**
	 * @return the sTF_Aug_L1_Role
	 */
	public String getSTF_Aug_L1_Role() {
		return STF_Aug_L1_Role;
	}
	/**
	 * @param sTF_Aug_L1_Role the sTF_Aug_L1_Role to set
	 */
	public void setSTF_Aug_L1_Role(String sTF_Aug_L1_Role) {
		STF_Aug_L1_Role = sTF_Aug_L1_Role;
	}
	/**
	 * @return the sTF_Aug_L1_Rate
	 */
	public Double getSTF_Aug_L1_Rate() {
		return STF_Aug_L1_Rate;
	}
	/**
	 * @param sTF_Aug_L1_Rate the sTF_Aug_L1_Rate to set
	 */
	public void setSTF_Aug_L1_Rate(Double sTF_Aug_L1_Rate) {
		STF_Aug_L1_Rate = sTF_Aug_L1_Rate;
	}
	/**
	 * @return the sAL1_Working_Days
	 */
	public int getSAL1_Working_Days() {
		return SAL1_Working_Days;
	}
	/**
	 * @param sAL1_Working_Days the sAL1_Working_Days to set
	 */
	public void setSAL1_Working_Days(int sAL1_Working_Days) {
		SAL1_Working_Days = sAL1_Working_Days;
	}
	/**
	 * @return the sTF_Aug_L1_FTE
	 */
	public Double getSTF_Aug_L1_FTE() {
		return STF_Aug_L1_FTE;
	}
	/**
	 * @param sTF_Aug_L1_FTE the sTF_Aug_L1_FTE to set
	 */
	public void setSTF_Aug_L1_FTE(Double sTF_Aug_L1_FTE) {
		STF_Aug_L1_FTE = sTF_Aug_L1_FTE;
	}
	/**
	 * @return the sTF_Aug_L2_Role
	 */
	public String getSTF_Aug_L2_Role() {
		return STF_Aug_L2_Role;
	}
	/**
	 * @param sTF_Aug_L2_Role the sTF_Aug_L2_Role to set
	 */
	public void setSTF_Aug_L2_Role(String sTF_Aug_L2_Role) {
		STF_Aug_L2_Role = sTF_Aug_L2_Role;
	}
	/**
	 * @return the sTF_Aug_L2_Rate
	 */
	public Double getSTF_Aug_L2_Rate() {
		return STF_Aug_L2_Rate;
	}
	/**
	 * @param sTF_Aug_L2_Rate the sTF_Aug_L2_Rate to set
	 */
	public void setSTF_Aug_L2_Rate(Double sTF_Aug_L2_Rate) {
		STF_Aug_L2_Rate = sTF_Aug_L2_Rate;
	}
	/**
	 * @return the sAL2_Working_Days
	 */
	public int getSAL2_Working_Days() {
		return SAL2_Working_Days;
	}
	/**
	 * @param sAL2_Working_Days the sAL2_Working_Days to set
	 */
	public void setSAL2_Working_Days(int sAL2_Working_Days) {
		SAL2_Working_Days = sAL2_Working_Days;
	}
	/**
	 * @return the sTF_Aug_L2_FTE
	 */
	public Double getSTF_Aug_L2_FTE() {
		return STF_Aug_L2_FTE;
	}
	/**
	 * @param sTF_Aug_L2_FTE the sTF_Aug_L2_FTE to set
	 */
	public void setSTF_Aug_L2_FTE(Double sTF_Aug_L2_FTE) {
		STF_Aug_L2_FTE = sTF_Aug_L2_FTE;
	}
	/**
	 * @return the sTF_Aug_L3_Role
	 */
	public String getSTF_Aug_L3_Role() {
		return STF_Aug_L3_Role;
	}
	/**
	 * @param sTF_Aug_L3_Role the sTF_Aug_L3_Role to set
	 */
	public void setSTF_Aug_L3_Role(String sTF_Aug_L3_Role) {
		STF_Aug_L3_Role = sTF_Aug_L3_Role;
	}
	/**
	 * @return the sTF_Aug_L3_Rate
	 */
	public Double getSTF_Aug_L3_Rate() {
		return STF_Aug_L3_Rate;
	}
	/**
	 * @param sTF_Aug_L3_Rate the sTF_Aug_L3_Rate to set
	 */
	public void setSTF_Aug_L3_Rate(Double sTF_Aug_L3_Rate) {
		STF_Aug_L3_Rate = sTF_Aug_L3_Rate;
	}
	/**
	 * @return the sAL3_Working_Days
	 */
	public int getSAL3_Working_Days() {
		return SAL3_Working_Days;
	}
	/**
	 * @param sAL3_Working_Days the sAL3_Working_Days to set
	 */
	public void setSAL3_Working_Days(int sAL3_Working_Days) {
		SAL3_Working_Days = sAL3_Working_Days;
	}
	/**
	 * @return the sTF_Aug_L3_FTE
	 */
	public Double getSTF_Aug_L3_FTE() {
		return STF_Aug_L3_FTE;
	}
	/**
	 * @param sTF_Aug_L3_FTE the sTF_Aug_L3_FTE to set
	 */
	public void setSTF_Aug_L3_FTE(Double sTF_Aug_L3_FTE) {
		STF_Aug_L3_FTE = sTF_Aug_L3_FTE;
	}
	/**
	 * @return the sTF_Aug_Oth_Role
	 */
	public String getSTF_Aug_Oth_Role() {
		return STF_Aug_Oth_Role;
	}
	/**
	 * @param sTF_Aug_Oth_Role the sTF_Aug_Oth_Role to set
	 */
	public void setSTF_Aug_Oth_Role(String sTF_Aug_Oth_Role) {
		STF_Aug_Oth_Role = sTF_Aug_Oth_Role;
	}
	/**
	 * @return the sTF_Aug_Oth_Rate
	 */
	public Double getSTF_Aug_Oth_Rate() {
		return STF_Aug_Oth_Rate;
	}
	/**
	 * @param sTF_Aug_Oth_Rate the sTF_Aug_Oth_Rate to set
	 */
	public void setSTF_Aug_Oth_Rate(Double sTF_Aug_Oth_Rate) {
		STF_Aug_Oth_Rate = sTF_Aug_Oth_Rate;
	}
	/**
	 * @return the sA_Working_Days
	 */
	public int getSA_Working_Days() {
		return SA_Working_Days;
	}
	/**
	 * @param sA_Working_Days the sA_Working_Days to set
	 */
	public void setSA_Working_Days(int sA_Working_Days) {
		SA_Working_Days = sA_Working_Days;
	}
	/**
	 * @return the sTF_Aug_Oth_FTE
	 */
	public Double getSTF_Aug_Oth_FTE() {
		return STF_Aug_Oth_FTE;
	}
	/**
	 * @param sTF_Aug_Oth_FTE the sTF_Aug_Oth_FTE to set
	 */
	public void setSTF_Aug_Oth_FTE(Double sTF_Aug_Oth_FTE) {
		STF_Aug_Oth_FTE = sTF_Aug_Oth_FTE;
	}
	/**
	 * @return the pex_Bnf_L1_FTE
	 */
	public Double getPex_Bnf_L1_FTE() {
		return Pex_Bnf_L1_FTE;
	}
	/**
	 * @param pex_Bnf_L1_FTE the pex_Bnf_L1_FTE to set
	 */
	public void setPex_Bnf_L1_FTE(Double pex_Bnf_L1_FTE) {
		Pex_Bnf_L1_FTE = pex_Bnf_L1_FTE;
	}
	/**
	 * @return the pex_Bnf_L2_FTE
	 */
	public Double getPex_Bnf_L2_FTE() {
		return Pex_Bnf_L2_FTE;
	}
	/**
	 * @param pex_Bnf_L2_FTE the pex_Bnf_L2_FTE to set
	 */
	public void setPex_Bnf_L2_FTE(Double pex_Bnf_L2_FTE) {
		Pex_Bnf_L2_FTE = pex_Bnf_L2_FTE;
	}
	/**
	 * @return the pex_Bnf_L3_FTE
	 */
	public Double getPex_Bnf_L3_FTE() {
		return Pex_Bnf_L3_FTE;
	}
	/**
	 * @param pex_Bnf_L3_FTE the pex_Bnf_L3_FTE to set
	 */
	public void setPex_Bnf_L3_FTE(Double pex_Bnf_L3_FTE) {
		Pex_Bnf_L3_FTE = pex_Bnf_L3_FTE;
	}
	/**
	 * @return the robo_Bnf_L1_FTE
	 */
	public Double getRobo_Bnf_L1_FTE() {
		return Robo_Bnf_L1_FTE;
	}
	/**
	 * @param robo_Bnf_L1_FTE the robo_Bnf_L1_FTE to set
	 */
	public void setRobo_Bnf_L1_FTE(Double robo_Bnf_L1_FTE) {
		Robo_Bnf_L1_FTE = robo_Bnf_L1_FTE;
	}
	/**
	 * @return the robo_Bnf_L2_FTE
	 */
	public Double getRobo_Bnf_L2_FTE() {
		return Robo_Bnf_L2_FTE;
	}
	/**
	 * @param robo_Bnf_L2_FTE the robo_Bnf_L2_FTE to set
	 */
	public void setRobo_Bnf_L2_FTE(Double robo_Bnf_L2_FTE) {
		Robo_Bnf_L2_FTE = robo_Bnf_L2_FTE;
	}
	/**
	 * @return the robo_Bnf_L3_FTE
	 */
	public Double getRobo_Bnf_L3_FTE() {
		return Robo_Bnf_L3_FTE;
	}
	/**
	 * @param robo_Bnf_L3_FTE the robo_Bnf_L3_FTE to set
	 */
	public void setRobo_Bnf_L3_FTE(Double robo_Bnf_L3_FTE) {
		Robo_Bnf_L3_FTE = robo_Bnf_L3_FTE;
	}
	/**
	 * @return the l1_Dis_Rate
	 */
	public Double getL1_Dis_Rate() {
		return L1_Dis_Rate;
	}
	/**
	 * @param l1_Dis_Rate the l1_Dis_Rate to set
	 */
	public void setL1_Dis_Rate(Double l1_Dis_Rate) {
		L1_Dis_Rate = l1_Dis_Rate;
	}
	/**
	 * @return the l1_Dis_FTE
	 */
	public Double getL1_Dis_FTE() {
		return L1_Dis_FTE;
	}
	/**
	 * @param l1_Dis_FTE the l1_Dis_FTE to set
	 */
	public void setL1_Dis_FTE(Double l1_Dis_FTE) {
		L1_Dis_FTE = l1_Dis_FTE;
	}
	/**
	 * @return the l2_Dis_Rate
	 */
	public Double getL2_Dis_Rate() {
		return L2_Dis_Rate;
	}
	/**
	 * @param l2_Dis_Rate the l2_Dis_Rate to set
	 */
	public void setL2_Dis_Rate(Double l2_Dis_Rate) {
		L2_Dis_Rate = l2_Dis_Rate;
	}
	/**
	 * @return the l2_Dis_FTE
	 */
	public Double getL2_Dis_FTE() {
		return L2_Dis_FTE;
	}
	/**
	 * @param l2_Dis_FTE the l2_Dis_FTE to set
	 */
	public void setL2_Dis_FTE(Double l2_Dis_FTE) {
		L2_Dis_FTE = l2_Dis_FTE;
	}
	/**
	 * @return the l3_Dis_Rate
	 */
	public Double getL3_Dis_Rate() {
		return L3_Dis_Rate;
	}
	/**
	 * @param l3_Dis_Rate the l3_Dis_Rate to set
	 */
	public void setL3_Dis_Rate(Double l3_Dis_Rate) {
		L3_Dis_Rate = l3_Dis_Rate;
	}
	/**
	 * @return the l3_Dis_FTE
	 */
	public Double getL3_Dis_FTE() {
		return L3_Dis_FTE;
	}
	/**
	 * @param l3_Dis_FTE the l3_Dis_FTE to set
	 */
	public void setL3_Dis_FTE(Double l3_Dis_FTE) {
		L3_Dis_FTE = l3_Dis_FTE;
	}
	/**
	 * @return the tot_L1_FTE
	 */
	public Double getTot_L1_FTE() {
		return Tot_L1_FTE;
	}
	/**
	 * @param tot_L1_FTE the tot_L1_FTE to set
	 */
	public void setTot_L1_FTE(Double tot_L1_FTE) {
		Tot_L1_FTE = tot_L1_FTE;
	}
	/**
	 * @return the tot_L1_FTE_Val
	 */
	public Double getTot_L1_FTE_Val() {
		return Tot_L1_FTE_Val;
	}
	/**
	 * @param tot_L1_FTE_Val the tot_L1_FTE_Val to set
	 */
	public void setTot_L1_FTE_Val(Double tot_L1_FTE_Val) {
		Tot_L1_FTE_Val = tot_L1_FTE_Val;
	}
	/**
	 * @return the tot_L2_FTE
	 */
	public Double getTot_L2_FTE() {
		return Tot_L2_FTE;
	}
	/**
	 * @param tot_L2_FTE the tot_L2_FTE to set
	 */
	public void setTot_L2_FTE(Double tot_L2_FTE) {
		Tot_L2_FTE = tot_L2_FTE;
	}
	/**
	 * @return the tot_L2_FTE_Val
	 */
	public Double getTot_L2_FTE_Val() {
		return Tot_L2_FTE_Val;
	}
	/**
	 * @param tot_L2_FTE_Val the tot_L2_FTE_Val to set
	 */
	public void setTot_L2_FTE_Val(Double tot_L2_FTE_Val) {
		Tot_L2_FTE_Val = tot_L2_FTE_Val;
	}
	/**
	 * @return the tot_L3_FTE
	 */
	public Double getTot_L3_FTE() {
		return Tot_L3_FTE;
	}
	/**
	 * @param tot_L3_FTE the tot_L3_FTE to set
	 */
	public void setTot_L3_FTE(Double tot_L3_FTE) {
		Tot_L3_FTE = tot_L3_FTE;
	}
	/**
	 * @return the tot_L3_FTE_Val
	 */
	public Double getTot_L3_FTE_Val() {
		return Tot_L3_FTE_Val;
	}
	/**
	 * @param tot_L3_FTE_Val the tot_L3_FTE_Val to set
	 */
	public void setTot_L3_FTE_Val(Double tot_L3_FTE_Val) {
		Tot_L3_FTE_Val = tot_L3_FTE_Val;
	}
	/**
	 * @return the tot_BSS_L1_FTE_Val
	 */
	public Double getTot_BSS_L1_FTE_Val() {
		return Tot_BSS_L1_FTE_Val;
	}
	/**
	 * @param tot_BSS_L1_FTE_Val the tot_BSS_L1_FTE_Val to set
	 */
	public void setTot_BSS_L1_FTE_Val(Double tot_BSS_L1_FTE_Val) {
		Tot_BSS_L1_FTE_Val = tot_BSS_L1_FTE_Val;
	}
	/**
	 * @return the tot_BSS_L2_FTE_Val
	 */
	public Double getTot_BSS_L2_FTE_Val() {
		return Tot_BSS_L2_FTE_Val;
	}
	/**
	 * @param tot_BSS_L2_FTE_Val the tot_BSS_L2_FTE_Val to set
	 */
	public void setTot_BSS_L2_FTE_Val(Double tot_BSS_L2_FTE_Val) {
		Tot_BSS_L2_FTE_Val = tot_BSS_L2_FTE_Val;
	}
	/**
	 * @return the tot_BSS_L3_FTE_Val
	 */
	public Double getTot_BSS_L3_FTE_Val() {
		return Tot_BSS_L3_FTE_Val;
	}
	/**
	 * @param tot_BSS_L3_FTE_Val the tot_BSS_L3_FTE_Val to set
	 */
	public void setTot_BSS_L3_FTE_Val(Double tot_BSS_L3_FTE_Val) {
		Tot_BSS_L3_FTE_Val = tot_BSS_L3_FTE_Val;
	}
	/**
	 * @return the tot_STF_Aug_L1_FTE_Val
	 */
	public Double getTot_STF_Aug_L1_FTE_Val() {
		return Tot_STF_Aug_L1_FTE_Val;
	}
	/**
	 * @param tot_STF_Aug_L1_FTE_Val the tot_STF_Aug_L1_FTE_Val to set
	 */
	public void setTot_STF_Aug_L1_FTE_Val(Double tot_STF_Aug_L1_FTE_Val) {
		Tot_STF_Aug_L1_FTE_Val = tot_STF_Aug_L1_FTE_Val;
	}
	/**
	 * @return the tot_STF_Aug_L2_FTE_Val
	 */
	public Double getTot_STF_Aug_L2_FTE_Val() {
		return Tot_STF_Aug_L2_FTE_Val;
	}
	/**
	 * @param tot_STF_Aug_L2_FTE_Val the tot_STF_Aug_L2_FTE_Val to set
	 */
	public void setTot_STF_Aug_L2_FTE_Val(Double tot_STF_Aug_L2_FTE_Val) {
		Tot_STF_Aug_L2_FTE_Val = tot_STF_Aug_L2_FTE_Val;
	}
	/**
	 * @return the tot_STF_Aug_L3_FTE_Val
	 */
	public Double getTot_STF_Aug_L3_FTE_Val() {
		return Tot_STF_Aug_L3_FTE_Val;
	}
	/**
	 * @param tot_STF_Aug_L3_FTE_Val the tot_STF_Aug_L3_FTE_Val to set
	 */
	public void setTot_STF_Aug_L3_FTE_Val(Double tot_STF_Aug_L3_FTE_Val) {
		Tot_STF_Aug_L3_FTE_Val = tot_STF_Aug_L3_FTE_Val;
	}
	/**
	 * @return the tot_STF_Aug_Oth_FTE_Val
	 */
	public Double getTot_STF_Aug_Oth_FTE_Val() {
		return Tot_STF_Aug_Oth_FTE_Val;
	}
	/**
	 * @param tot_STF_Aug_Oth_FTE_Val the tot_STF_Aug_Oth_FTE_Val to set
	 */
	public void setTot_STF_Aug_Oth_FTE_Val(Double tot_STF_Aug_Oth_FTE_Val) {
		Tot_STF_Aug_Oth_FTE_Val = tot_STF_Aug_Oth_FTE_Val;
	}
	/**
	 * @return the grand_Total_FTE
	 */
	public Double getGrand_Total_FTE() {
		return Grand_Total_FTE;
	}
	/**
	 * @param grand_Total_FTE the grand_Total_FTE to set
	 */
	public void setGrand_Total_FTE(Double grand_Total_FTE) {
		Grand_Total_FTE = grand_Total_FTE;
	}
	/**
	 * @return the grand_Total_FTE_Val
	 */
	public Double getGrand_Total_FTE_Val() {
		return Grand_Total_FTE_Val;
	}
	/**
	 * @param grand_Total_FTE_Val the grand_Total_FTE_Val to set
	 */
	public void setGrand_Total_FTE_Val(Double grand_Total_FTE_Val) {
		Grand_Total_FTE_Val = grand_Total_FTE_Val;
	}
	
	
	/**
	 * @return the uSD_Eq_Val
	 */
	public Double getUSD_Eq_Val() {
		return USD_Eq_Val;
	}
	/**
	 * @param uSD_Eq_Val the uSD_Eq_Val to set
	 */
	public void setUSD_Eq_Val(Double uSD_Eq_Val) {
		USD_Eq_Val = uSD_Eq_Val;
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
	public String getUpdated_On() {
		return Updated_On;
	}
	/**
	 * @param updated_On the updated_On to set
	 */
	public void setUpdated_On(String updated_On) {
		Updated_On = updated_On;
	}
	
	
}
