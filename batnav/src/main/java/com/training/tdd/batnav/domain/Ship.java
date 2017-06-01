package com.training.tdd.batnav.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public abstract class Ship {
	
	@Getter
	protected String name;

	@Getter
	protected int amountSpace;	
}
