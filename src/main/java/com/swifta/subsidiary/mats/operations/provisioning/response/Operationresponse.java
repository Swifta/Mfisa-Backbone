package com.swifta.subsidiary.mats.operations.provisioning.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.operations.provisioning.model.Extension;
import com.swifta.subsidiary.mats.operations.provisioning.model.ParameterExtension;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Operationresponse {

	public String responsemessage;
	public String responsecode;
	public Extension extension;
	public ParameterExtension parameterextension;

//	public Operationresponse(String responsemessage, String responsecode,
//			Extension extension, ParameterExtension parameterextension) {
//		super();
//		this.responsemessage = responsemessage;
//		this.responsecode = responsecode;
//		this.extension = extension;
//		this.parameterextension = parameterextension;
//	}

}
