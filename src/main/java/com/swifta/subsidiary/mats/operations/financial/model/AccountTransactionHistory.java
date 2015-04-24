package com.swifta.subsidiary.mats.operations.financial.model;

import java.util.Date;

public class AccountTransactionHistory {
	public long transactionid;
	public String orginatingresourceid;
	public String destinationresourceid;
	public String amount;
	public OperationType operationtype;
	public Date date;
	public EntryType entrytype;

	public AccountTransactionHistory() {
		super();
	}

	public AccountTransactionHistory(long transactionid,
			String orginatingresourceid, String destinationresourceid,
			String amount, OperationType operationtype, Date date,
			EntryType entrytype) {
		super();
		this.transactionid = transactionid;
		this.orginatingresourceid = orginatingresourceid;
		this.destinationresourceid = destinationresourceid;
		this.amount = amount;
		this.operationtype = operationtype;
		this.date = date;
		this.entrytype = entrytype;
	}

//	public long getTransactionid() {
//		return transactionid;
//	}
//
//	public void setTransactionid(long transactionid) {
//		this.transactionid = transactionid;
//	}
//
//	public String getSendingresource() {
//		return orginatingresourceid;
//	}
//
//	public void setSendingresource(String orginatingresourceid) {
//		this.orginatingresourceid = orginatingresourceid;
//	}
//
//	public String getReceivingresource() {
//		return destinationresourceid;
//	}
//
//	public void setReceivingresource(String destinationresourceid) {
//		this.destinationresourceid = destinationresourceid;
//	}
//
//	public String getAmount() {
//		return amount;
//	}
//
//	public void setAmount(String amount) {
//		this.amount = amount;
//	}
//
//	public OperationTypeV1_0 getOperationtype() {
//		return operationtype;
//	}
//
//	public void setOperationtype(OperationTypeV1_0 operationtype) {
//		this.operationtype = operationtype;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	public EntryTypeV1_0 getEntrytype() {
//		return entrytype;
//	}
//
//	public void setEntrytype(EntryTypeV1_0 entrytype) {
//		this.entrytype = entrytype;
//	}

}
