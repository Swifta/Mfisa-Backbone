package com.swifta.subsidiary.mats.operations.financial.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.operations.financial.model.AccountTransactionHistory;
import com.swifta.subsidiary.mats.operations.financial.model.ParameterExtension;

@XmlAccessorType(XmlAccessType.FIELD)
public class getaccounttransactionhistoryresponse {
	public int totalreturned;
	public List<AccountTransactionHistory> accounttransactionhistory;
	public ParameterExtension extension;

	// public getaccounttransactionhistoryresponse() {
	// super();
	// }
	//
	// public getaccounttransactionhistoryresponse(int totalreturned,
	// List<AccountTransactionHistory> accounttransactionhistory,
	// StatusCode statuscode) {
	// super();
	// this.totalreturned = totalreturned;
	// this.accounttransactionhistory = accounttransactionhistory;
	// this.statuscode = statuscode;
	// }

	// public int getTotalreturned() {
	// return totalreturned;
	// }
	//
	// public void setTotalreturned(int totalreturned) {
	// this.totalreturned = totalreturned;
	// }
	//
	// public List<AccountTransactionHistoryV1_0> getAccounttransactionhistory()
	// {
	// return accounttransactionhistory;
	// }
	//
	// public void setAccounttransactionhistory(
	// List<AccountTransactionHistoryV1_0> accounttransactionhistory) {
	// this.accounttransactionhistory = accounttransactionhistory;
	// }
	//
	// public StatusCodeV1_0 getStatuscode() {
	// return statuscode;
	// }
	//
	// public void setStatuscode(StatusCodeV1_0 statuscode) {
	// this.statuscode = statuscode;
	// }

}
