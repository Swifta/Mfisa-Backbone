package com.swifta.subsidiary.mats.operations.provisioning.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.operations.provisioning.model.ParameterExtension;
import com.swifta.subsidiary.mats.operations.provisioning.model.StatusCode;

@XmlAccessorType(XmlAccessType.FIELD)
public class Addcustodyaccountrequestresponse extends Operationresponse {

	public String accountnumber;
	public StatusCode statuscode;
	public ParameterExtension extensionparameters;

	// public Addaccountresponse(StatusCode statuscode) {
	// super();
	// this.statuscode = statuscode;
	// }
	//
	// public Addaccountresponse() {
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
