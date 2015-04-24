package com.swifta.subsidiary.mats.operations;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import com.swifta.subsidiary.mats.operations.financial.model.Adjustaccounttransactionparameters;
import com.swifta.subsidiary.mats.operations.financial.model.EntryType;
import com.swifta.subsidiary.mats.operations.financial.model.Gettransactionhistoryparameter;
import com.swifta.subsidiary.mats.operations.financial.model.OperationType;
import com.swifta.subsidiary.mats.operations.financial.model.ParameterExtension;
import com.swifta.subsidiary.mats.operations.financial.response.Adjustaccountresponse;
import com.swifta.subsidiary.mats.operations.financial.response.Cashinresponse;
import com.swifta.subsidiary.mats.operations.financial.response.Cashoutresponse;
import com.swifta.subsidiary.mats.operations.financial.response.Depositfloatresponse;
import com.swifta.subsidiary.mats.operations.financial.response.Floattransferresponse;
import com.swifta.subsidiary.mats.operations.financial.response.Transfertobankrequestresponse;
import com.swifta.subsidiary.mats.operations.financial.response.getaccounttransactionhistoryresponse;
import com.swifta.subsidiary.mats.operations.financial.response.gettransactionhistoryresponse;

@WebService(serviceName = "financials", targetNamespace = "http://swifta.com/sub/mats/operation/financial/v1.0")
public interface Financial {
	@WebMethod(action = "cashinrequest")
	public Cashinresponse cashinrequest(
			@WebParam(name = "orginatingresourceid") String orginatingresourceid,
			@WebParam(name = "destinationresourceid") String destinationresourceid,
			@WebParam(name = "amount") String amount,
			@WebParam(name = "sendingdescription") String sendingdescription,
			@WebParam(name = "receivingdescription") String receivingdescription,
			@WebParam(name = "extensionparameters") ParameterExtension extensionparameters);

	@WebMethod(action = "cashoutrequest")
	@XmlElement(nillable = false)
	public Cashoutresponse cashoutrequest(
			@WebParam(name = "orginatingresourceid") String orginatingresourceid,
			@WebParam(name = "destinationresourceid") String destinationresourceid,
			@WebParam(name = "amount") String amount,
			@WebParam(name = "sendingdescription") String sendingdescription,
			@WebParam(name = "receivingdescription") String receivingdescription,
			@WebParam(name = "extensionparameters") ParameterExtension extensionparameters);

	@WebMethod(action = "adjustaccountrequest")
	public Adjustaccountresponse adjustaccountrequest(
			@WebParam(name = "description") String description,
			@WebParam(name = "adjustaccountinstruction") Adjustaccounttransactionparameters adjust);

	@WebMethod(action = "floattransferrequest")
	public Floattransferresponse floattransferrequest(
			@WebParam(name = "orginatingresourceid") String orginatingresourceid,
			@WebParam(name = "destinationresourceid") String destinationresourceid,
			@WebParam(name = "amount") String amount,
			@WebParam(name = "sendingdescription") String sendingdescription,
			@WebParam(name = "receivingdescription") String receivingdescription,
			@WebParam(name = "extension") ParameterExtension extension);

	@WebMethod(action = "getaccounttransactionhistoryrequest")
	public getaccounttransactionhistoryresponse getaccounttransactionhistoryrequest(
			@WebParam(name = "accountresource") String accountresource,
			@WebParam(name = "otheraccountresource") String otheraccountresource,
			@WebParam(name = "fromdate") Date fromdate,
			@WebParam(name = "todate") Date todate,
			@WebParam(name = "nooftransactionhistory") String nooftransactionhistory,
			@WebParam(name = "transactionid") String transactionid,
			@WebParam(name = "transactionentrytype") EntryType entrytype,
			@WebParam(name = "operationtype") OperationType operationtype);

	@WebMethod(action = "gettransactionhistoryrequest")
	public gettransactionhistoryresponse gettransactionhistoryrequest(
			@WebParam(name = "transactionhistoryparameter") Gettransactionhistoryparameter transactionhistoryparameter);

	@WebMethod(action = "transfertobankaccountrequest")
	public Transfertobankrequestresponse transfertobankaccountrequest(
			@WebParam(name = "userresourceid") String userresourceid,
			@WebParam(name = "accountresourceid") String accountresourceid,
			@WebParam(name = "amount") String amount,
			@WebParam(name = "description") String description,
			@WebParam(name = "bankcode") String bankcode,
			@WebParam(name = "bankaccountnumber") String bankaccountnumber,
			@WebParam(name = "extension") ParameterExtension extension);

	@WebMethod(action = "depositfloat")
	public Depositfloatresponse depositfloat(
			@WebParam(name = "orginatingresourceid") String orginatingresourceid,
			@WebParam(name = "destinationresourceid") String destinationresourceid,
			@WebParam(name = "amount") String amount,
			@WebParam(name = "sendingdescription") String sendingdescription,
			@WebParam(name = "receivingdescription") String receivingdescription,
			@WebParam(name = "extensionparameters") ParameterExtension extensionparameters);

}