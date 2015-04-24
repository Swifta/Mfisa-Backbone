package com.swifta.subsidiary.mats.operations.financial.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.operations.financial.model.ParameterExtension;

@XmlAccessorType(XmlAccessType.FIELD)
public class Cashoutresponse {
	public String orginatingpartnerfee;
	public String orginatingpartnerbalanceafter;
	public String destinationpartnerbalanceafter;
	public String financialtransactionid;
	public ParameterExtension parameter;

	// public Cashoutresponse() {
	// super();
	// }
	//
	// public Cashoutresponse(String orginatingpartnerfee,
	// String orginatingpartnerbalanceafter,
	// String destinationpartnerbalanceafter, StatusCode statuscode) {
	// super();
	// this.orginatingpartnerfee = orginatingpartnerfee;
	// this.orginatingpartnerbalanceafter = orginatingpartnerbalanceafter;
	// this.destinationpartnerbalanceafter = destinationpartnerbalanceafter;
	// this.statuscode = statuscode;
	// }

	// public String getOrginatingpartnerfee() {
	// return orginatingpartnerfee;
	// }
	//
	// public void setOrginatingpartnerfee(String orginatingpartnerfee) {
	// this.orginatingpartnerfee = orginatingpartnerfee;
	// }
	//
	// public String getOrginatingpartnerbalanceafter() {
	// return orginatingpartnerbalanceafter;
	// }
	//
	// public void setOrginatingpartnerbalanceafter(
	// String orginatingpartnerbalanceafter) {
	// this.orginatingpartnerbalanceafter = orginatingpartnerbalanceafter;
	// }
	//
	// public String getDestinationpartnerbalanceafter() {
	// return destinationpartnerbalanceafter;
	// }
	//
	// public void setDestinationpartnerbalanceafter(
	// String destinationpartnerbalanceafter) {
	// this.destinationpartnerbalanceafter = destinationpartnerbalanceafter;
	// }
	//
	// public StatusCodeV1_0 getStatuscode() {
	// return statuscode;
	// }
	//
	// public void setStatuscode(StatusCodeV1_0 statuscode) {
	// this.statuscode = statuscode;
	// }

}
