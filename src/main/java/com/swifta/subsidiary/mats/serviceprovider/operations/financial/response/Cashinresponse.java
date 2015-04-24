package com.swifta.subsidiary.mats.serviceprovider.operations.financial.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.serviceprovider.operations.financial.model.ParameterExtension;
import com.swifta.subsidiary.mats.serviceprovider.operations.financial.model.StatusCode;

@XmlAccessorType(XmlAccessType.FIELD)
public class Cashinresponse {
	public String fee;
	public String orginatingpartnerbalanceafter;
	public String destinationpartnerbalanceafter;
	public String financialtransactionid;
	public String ResponseMessage;
	public StatusCode statuscode;
	public ParameterExtension extensionparameters;

}
