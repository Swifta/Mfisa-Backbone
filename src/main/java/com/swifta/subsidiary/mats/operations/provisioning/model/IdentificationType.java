package com.swifta.subsidiary.mats.operations.provisioning.model;

public enum IdentificationType {

	PASSP(1), DRLCS(2), SOCS(3), IDCD(4), EMID(5), NRIN(6), OTHR(7);

	private int value;

	private IdentificationType(int v) {
		value = v;
	}

	public int returnIntvalue() {
		return value;
	}

}
