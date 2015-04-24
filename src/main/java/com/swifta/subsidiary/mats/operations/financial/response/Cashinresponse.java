package com.swifta.subsidiary.mats.operations.financial.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.swifta.subsidiary.mats.operations.financial.model.ParameterExtension;



@XmlAccessorType(XmlAccessType.FIELD)
public class Cashinresponse {
	public String fee;
	public String orginatingresourcebalanceafter;
	public String destinationresourcebalanceafter;
	public String financialtransactionid;
	public ParameterExtension extension;

	// public Cashinresponse() {
	// super();
	// }
	//
	// public Cashinresponse(String fee,
	// String orginatingresourcebalanceafter,
	// String destinationresourcebalanceafter, StatusCode statuscode) {
	// super();
	// this.fee = fee;
	// this.orginatingresourcebalanceafter = orginatingresourcebalanceafter;
	// this.destinationresourcebalanceafter = destinationresourcebalanceafter;
	// this.statuscode = statuscode;
	// }

	// public String getFee() {
	// return fee;
	// }
	//
	// public void setFee(String fee) {
	// this.fee = fee;
	// }
	//
	// public String getOrginatingresourcebalanceafter() {
	// return orginatingresourcebalanceafter;
	// }
	//
	// public void setOrginatingresourcebalanceafter(
	// String orginatingresourcebalanceafter) {
	// this.orginatingresourcebalanceafter = orginatingresourcebalanceafter;
	// }
	//
	// public String getDestinationresourcebalanceafter() {
	// return destinationresourcebalanceafter;
	// }
	//
	// public void setDestinationresourcebalanceafter(
	// String destinationresourcebalanceafter) {
	// this.destinationresourcebalanceafter = destinationresourcebalanceafter;
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
