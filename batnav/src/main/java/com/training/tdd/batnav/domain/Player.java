package com.training.tdd.batnav.domain;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author gabo
 *
 */
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Player {

	@Getter
	@Setter
	@NonNull
	private String name;
	
	@Getter
	@Setter
	private List<Ship> listShips;
	
	@Getter
	@Setter
	private GameBoard gameBoard;
	
}
