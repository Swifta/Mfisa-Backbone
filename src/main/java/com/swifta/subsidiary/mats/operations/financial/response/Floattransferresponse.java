package com.swifta.subsidiary.mats.operations.financial.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.operations.financial.model.ParameterExtension;

@XmlAccessorType(XmlAccessType.FIELD)
public class Floattransferresponse {
	public String transactionid;
	public String orginatingpartnerbalanceafter;
	public String orginatingpartnerfee;
	public ParameterExtension extension;

	// public Floattransferresponse() {
	// super();
	// }
	//
	// public Floattransferresponse(String transactionid,
	// String orginatingpartnerbalanceafter,
	// String orginatingpartnerfee, List<Object> any,
	// StatusCode statuscode) {
	// super();
	// this.transactionid = transactionid;
	// this.orginatingpartnerbalanceafter = orginatingpartnerbalanceafter;
	// this.orginatingpartnerfee = orginatingpartnerfee;
	// this.any = any;
	// this.statuscode = statuscode;
	// }

}
