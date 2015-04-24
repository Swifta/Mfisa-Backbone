package com.swifta.sub.mats.serviceinterface;

import java.math.BigDecimal;

import com.swifta.sub.mats.serviceinterface.ServiceCommissionConditionTypes;
import com.swifta.sub.mats.serviceinterface.ServiceCommissionModelTypes;

public class ServiceCommission {
	public ServiceCommissionConditionTypes servicecommissioncondition;
	public ServiceCommissionModelTypes servicecommissionmodeltype;
	public int transactiontypeid;
	public BigDecimal minimumamount;
	public BigDecimal maximumamount;
	public BigDecimal commissionfee;
	public ServiceCommissionmatrix commissionfeetype;
}
