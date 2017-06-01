package com.training.tdd.batnav.srv;

import com.training.tdd.batnav.domain.GameBoard;
import com.training.tdd.batnav.domain.Player;
import com.training.tdd.batnav.util.LoadValueNavalBattle;

import lombok.Getter;

public class NavalBattle {
	
	private static final int boardX = 10;
	private static final int boradY = 10;
	
	@Getter
	private Player p1;
	@Getter
	private Player p2;

	/**
	 * 
	 * @param nameP1
	 * @param nameP2
	 * @return
	 */
	public boolean createPlayers(String nameP1, String nameP2) {		
		this.p1 = new Player(nameP1);
		this.p2 = new Player(nameP2);
		return true;
	}

	/**
	 * 
	 */
	public void createShipsForPlayers() {
		this.p1.setListShips(LoadValueNavalBattle.createListShips());
		this.p2.setListShips(LoadValueNavalBattle.createListShips());
	}
	
	/**
	 * 
	 */
	public void createGameBoardsForPlayers() {
		this.p1.setGameBoard(new GameBoard(LoadValueNavalBattle.createInitGameBoard(boardX, boradY)));
		this.p2.setGameBoard(new GameBoard(LoadValueNavalBattle.createInitGameBoard(boardX, boradY)));
	}

	public boolean assignmentPositionShipForPlayers() {
		
		
		
		return true;
	}

}
