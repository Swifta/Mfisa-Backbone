package com.swifta.subsidiary.mats.operations.provisioning.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.operations.provisioning.model.ParameterExtension;
import com.swifta.subsidiary.mats.operations.provisioning.model.StatusCode;

@XmlAccessorType(XmlAccessType.FIELD)
public class Setparentrequestresponse extends Operationresponse {

	public String responsemessage;
	public StatusCode statuscode;
	public ParameterExtension extensionparameters;

	// public Activationrequestresponse(StatusCode statuscode) {
	// super();
	// this.statuscode = statuscode;
	// }
	//
	// public Activationrequestresponse() {
	// super();
	// }
	//
	// public StatusCode getStatuscode() {
	// return statuscode;
	// }
	//
	// public void setStatuscode(StatusCode statuscode) {
	// this.statuscode = statuscode;
	// }

}
