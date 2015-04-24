package com.swifta.subsidiary.mats.operations.financial.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.operations.financial.model.AccountTransactionHistory;
import com.swifta.subsidiary.mats.operations.financial.model.ParameterExtension;

@XmlAccessorType(XmlAccessType.FIELD)
public class gettransactionhistoryresponse {

	public List<AccountTransactionHistory> accounttransactionhistory;

	public ParameterExtension extension;

	// public gettransactionhistoryresponse(
	// List<AccountTransactionHistory> accounttransactionhistory,
	// StatusCode statuscode) {
	// super();
	// this.accounttransactionhistory = accounttransactionhistory;
	// this.statuscode = statuscode;
	// }
	//
	// public gettransactionhistoryresponse() {
	// super();
	// }

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
