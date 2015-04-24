package com.swifta.subsidiary.mats.operations.provisioning.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.operations.provisioning.model.Extension;
import com.swifta.subsidiary.mats.operations.provisioning.model.ParameterExtension;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Weboperationresponse {

	public String responsemessage;
	public String responsecode;
	public ParameterExtension parameterextension;

	public Weboperationresponse() {
		super();
	}

	public Weboperationresponse(String responsemessage, String responsecode,
			ParameterExtension parameterextension) {
		super();
		this.responsemessage = responsemessage;
		this.responsecode = responsecode;
		this.parameterextension = parameterextension;
	}

}
