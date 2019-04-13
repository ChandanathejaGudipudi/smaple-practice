package com.cts.employee.domain;

public class Process {
	
	String processid;
	String processname;
	
	

	public String getProcessid() {
		return processid;
	}

	public void setProcessid(String processid) {
		this.processid = processid;
	}

	public String getProcessname() {
		return processname;
	}

	public void setProcessname(String processname) {
		this.processname = processname;
	}

	@Override
	public String toString() {
		return "ProcessList [processid=" + processid + ", processname=" + processname + "]";
	}
	
	
	
	

}
