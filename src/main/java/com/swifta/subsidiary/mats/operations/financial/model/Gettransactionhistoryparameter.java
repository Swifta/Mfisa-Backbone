package com.swifta.subsidiary.mats.operations.financial.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Gettransactionhistoryparameter {

	String transactionid;
	
	String resourceid;

	@XmlElement(name = "testlist")
	protected List<String> testlist;

//	public String getTransactionid() {
//		return transactionid;
//	}
//	@XmlElement(name = "transactionid", required = true, nillable = false)
//	public void setTransactionid(String transactionid) {
//		this.transactionid = transactionid;
//	}
//
//	public String getResourceid() {
//		return resourceid;
//	}
//
//	public void setResourceid(String resourceid) {
//		this.resourceid = resourceid;
//	}

}
