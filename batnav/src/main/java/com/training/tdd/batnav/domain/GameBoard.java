package com.training.tdd.batnav.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class GameBoard {
	
	public GameBoard(int[][] board) {
		this.board = board;
	}
	
	@Getter
	@Setter
	@NonNull
	private int[][] board;

}
