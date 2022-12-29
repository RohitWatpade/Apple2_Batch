package com.dao;

import com.pojo.StudentL;

public class TransactionL {

	public StudentL s;
	String bName, issueDate, returnDate;

	public TransactionL() {

	}

	public TransactionL(StudentL s, String bName, String issueDate, String returnDate) 
	{
		this.s = s;
		this.bName = bName;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}

	public StudentL getS() {
		return s;
	}

	public void setS(StudentL s) {
		this.s = s;
	}

	public String getBName() {
		return bName;
	}

	public void setBName(String name) {
		this.bName = name;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "Transaction [s=" + s + ", name=" + bName + ", issueDate=" + issueDate + ", returnDate=" + returnDate
				+ "]";
	}

}

