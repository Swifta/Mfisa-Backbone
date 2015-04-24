package com.swifta.subsidiary.mats.operations.financial.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.operations.financial.model.ParameterExtension;
import com.swifta.subsidiary.mats.operations.financial.model.StatusCode;

@XmlAccessorType(XmlAccessType.FIELD)
public class Adjustaccountresponse {

	public StatusCode StatusCode;
	public ParameterExtension extension;

	// public StatusCodeV1_0 getStatusCode() {
	// return StatusCode;
	// }
	//
	// public void setStatusCode(StatusCodeV1_0 statusCode) {
	// StatusCode = statusCode;
	// }

}
