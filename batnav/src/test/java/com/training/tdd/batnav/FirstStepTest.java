package com.training.tdd.batnav;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.training.tdd.batnav.domain.GameBoard;
import com.training.tdd.batnav.domain.Player;
import com.training.tdd.batnav.domain.Ship;
import com.training.tdd.batnav.srv.NavalBattle;
import com.training.tdd.batnav.util.FactoryUtil;

import junit.framework.TestCase;

public class FirstStepTest extends TestCase {

	private int boardX = 10;
	private int boardY = 10;
	private String nameP1;
	private String nameP2;
	private Player p1;
	private Player p2;
	private NavalBattle navBat;
	private List<Ship> listShips;
	private GameBoard gameBoard;

	@Before
	public void setUp() {
		nameP1 = "Gabo";
		nameP2 = "Gabo2";

		p1 = new Player(nameP1);
		p2 = new Player(nameP2);
		navBat = new NavalBattle();

		listShips = FactoryUtil.createListShips();

		gameBoard = new GameBoard(FactoryUtil.createInitGameBoard(boardX, boardY));
	}

	@Test
	public void testWhenStartShouldCreatePlayer() {
		navBat.createPlayers(nameP1, nameP2);

		assertEquals(p1, navBat.getP1());
		assertEquals(p2, navBat.getP2());
	}

	@Test 
	public void testWhenStartShouldCreateShipForEachPlayers() {
		p1.setListShips(listShips);
		p2.setListShips(listShips);

		navBat.createPlayers(nameP1, nameP2);
		navBat.createShipsForPlayers();

		assertEquals(p1, navBat.getP1());
		assertEquals(p2, navBat.getP2());
	}

	@Test
	public void testWhenStartShouldCreateGameBoard() {
		p1.setListShips(listShips);
		p2.setListShips(listShips);
		p1.setGameBoard(gameBoard);
		p2.setGameBoard(gameBoard);

		navBat.createPlayers(nameP1, nameP2);
		navBat.createShipsForPlayers();
		navBat.createGameBoardsForPlayers();

		assertEquals(p1.getGameBoard(), navBat.getP1().getGameBoard());
		assertEquals(p2.getGameBoard(), navBat.getP2().getGameBoard());	
	}
	
	@Test
	public void testWhenStartShouldAssignmentPositionShipGameBoard() {
		
		assertTrue(navBat.assignmentPositionShipForPlayers());
		
	}
}
