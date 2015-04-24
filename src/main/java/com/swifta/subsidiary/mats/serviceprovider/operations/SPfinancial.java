package com.swifta.subsidiary.mats.serviceprovider.operations;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import com.swifta.subsidiary.mats.serviceprovider.operations.financial.model.ParameterExtension;
import com.swifta.subsidiary.mats.serviceprovider.operations.financial.response.Cashinresponse;
import com.swifta.subsidiary.mats.serviceprovider.operations.financial.response.Cashoutresponse;

@WebService(serviceName = "spfinancials", targetNamespace = "http://swifta.com/subsidiary/mats/serviceprovider/operation/spfinancial/v1.0")
public interface SPfinancial {

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
	
	

}