package com.swifta.subsidiary.mats.operations.financial.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class Cashinrequestparameters {

	@XmlElement(nillable = false)
	public String orginatingresourceid;

	@XmlElement(nillable = false)
	public String destinationresourceid;

	public String amount;
	public String sendingdescription;
	public String receivingdescription;
	public ParameterExtension extensionparameters;

}
