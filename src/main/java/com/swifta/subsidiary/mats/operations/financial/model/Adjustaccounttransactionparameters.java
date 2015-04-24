package com.swifta.subsidiary.mats.operations.financial.model;

import java.util.Date;

public class Adjustaccounttransactionparameters {

	public String orginatingresourceid;
	public String destinationresourceid;
	public String amount;
	public Date dateoftransaction;
	public AdjustmentType adjusttype;
	public String originatingresourcedescription;
	public String destinationresourcedescription;

	public Adjustaccounttransactionparameters() {
		super();
	}

	public Adjustaccounttransactionparameters(String orginatingresourceid,
			String destinationresourceid, Date dateoftransaction,
			AdjustmentType adjusttype, String fromresourcedescription,
			String toresourcedescription) {
		super();
		this.orginatingresourceid = orginatingresourceid;
		this.destinationresourceid = destinationresourceid;
		this.dateoftransaction = dateoftransaction;
		this.adjusttype = adjusttype;
		this.originatingresourcedescription = fromresourcedescription;
		this.destinationresourcedescription = toresourcedescription;
	}

	// public String getFromresource() {
	// return orginatingresourceid;
	// }
	//
	// public void setFromresource(String orginatingresourceid) {
	// this.orginatingresourceid = orginatingresourceid;
	// }
	//
	// public String getToresource() {
	// return destinationresourceid;
	// }
	//
	// public void setToresource(String destinationresourceid) {
	// this.destinationresourceid = destinationresourceid;
	// }
	//
	// public Date getDateoftransaction() {
	// return dateoftransaction;
	// }
	//
	// public void setDateoftransaction(Date dateoftransaction) {
	// this.dateoftransaction = dateoftransaction;
	// }
	//
	// public AdjustmentTypeV1_0 getAdjusttype() {
	// return adjusttype;
	// }
	//
	// public void setAdjusttype(AdjustmentTypeV1_0 adjusttype) {
	// this.adjusttype = adjusttype;
	// }
	//
	// public String getFromresourcedescription() {
	// return originatingresourcedescription;
	// }
	//
	// public void setFromresourcedescription(String fromresourcedescription) {
	// this.originatingresourcedescription = fromresourcedescription;
	// }
	//
	// public String getToresourcedescription() {
	// return destinationresourcedescription;
	// }
	//
	// public void setToresourcedescription(String toresourcedescription) {
	// this.destinationresourcedescription = toresourcedescription;
	// }

}
