package com.swifta.sub.mats.serviceinterface;

import java.math.BigDecimal;

import com.swifta.sub.mats.serviceinterface.ServiceFeematrix;
import com.swifta.sub.mats.serviceinterface.ServiceFeesInterface;

public class ServiceFees extends ServiceFeesInterface {
	public int transactiontypeid;
	public BigDecimal minimumamount;
	public BigDecimal maximumamount;
	public BigDecimal servicefee;
	public ServiceFeematrix servicefeetype;

}
