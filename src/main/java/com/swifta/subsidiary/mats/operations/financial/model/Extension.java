package com.swifta.subsidiary.mats.operations.financial.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;

public class Extension {

	@XmlAnyElement(lax = true)
	public List<Object> any;

}
