package com.training.tdd.batnav.util;

import java.util.ArrayList;
import java.util.List;

import com.training.tdd.batnav.domain.AircraftCarrier;
import com.training.tdd.batnav.domain.ArmoredCruiser;
import com.training.tdd.batnav.domain.Destroyer;
import com.training.tdd.batnav.domain.MissileLauncher;
import com.training.tdd.batnav.domain.Ship;
import com.training.tdd.batnav.domain.Submarine;

public class FactoryUtil {
	
	/**
	 * 
	 * @return
	 */
	public static List<Ship> createListShips() {
		List<Ship> listShips = new ArrayList<Ship>();

		Ship submar = new Submarine();
		Ship armCru = new ArmoredCruiser();
		Ship airCar = new AircraftCarrier();
		Ship destro = new Destroyer();
		Ship misLau = new MissileLauncher();

		listShips.add(submar);		
		listShips.add(armCru);
		listShips.add(airCar);
		listShips.add(destro);
		listShips.add(misLau);

		return listShips;
	}
	
	/**
	 * 
	 * @param boardX
	 * @param boardY
	 * @return
	 */
	public static int [][] createInitGameBoard(int boardX, int boardY) {
		int gameBoard[][] = new int [boardX][boardY]; //definir y crear matriz de 10x10 
		int length =  gameBoard.length;
		for(int n = 0; n < length; n++)  { 
			for(int n1 = 0; n1 < length; n1++) { 
				gameBoard[n][n1] = 0;
			}
		}

		return gameBoard;
	}

}
