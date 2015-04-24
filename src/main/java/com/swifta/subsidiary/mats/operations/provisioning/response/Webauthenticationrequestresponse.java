package com.swifta.subsidiary.mats.operations.provisioning.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.operations.provisioning.model.ParameterExtension;

@XmlAccessorType(XmlAccessType.FIELD)
public class Webauthenticationrequestresponse extends Weboperationresponse {
	public String[] permission;
	public Kyc accountholderdetail;

	public Webauthenticationrequestresponse() {
		super();
	}

	public Webauthenticationrequestresponse(String responsemessage,
			String responsecode, String[] permission,
			ParameterExtension parameterextension) {
		super(responsemessage, responsecode, parameterextension);
		this.permission = permission;

	}

}
