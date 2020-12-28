/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab6;

import java.util.Comparator;

/**
 * Implements sorting strategy of a game field. Lab 6. 
 * 
 * @version 1.0 24 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class SortStrategy implements Strategy {

	/**
	 * Sort the game field
	 */
	@Override
	public void Apply(GameField gameField) {
		gameField.getElements().sort(new Comparator<Integer>() {
		
			@Override
			public int compare(Integer left, Integer right) {				
				return Float.compare(left, right);
			}
		});
		System.out.println("Game field is sorted.");

	}

}
