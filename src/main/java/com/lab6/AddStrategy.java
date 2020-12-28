/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab6;

import java.util.ArrayList;

/**
 * Implements sorting strategy of a game field. Lab 6. 
 * 
 * @version 1.0 24 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class AddStrategy implements Strategy {

	/**
	 * Adds number to each element of the game field
	 */
	@Override
	public void Apply(GameField gameField) {
		
		ArrayList<Integer> field = gameField.getElements();
		
		for(int i = 0; i < field.size(); i++) {
			field.set(i, field.get(i) + 10);
		}
		System.out.println("Each element of the game field was increased by 10.");
	}

}
