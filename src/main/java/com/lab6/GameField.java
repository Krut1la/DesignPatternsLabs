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
 * Interface for game field. Lab 6. 
 * 
 * @version 1.0 24 Dec 2020
 * @author Aleksey Krutko
 *
 */
public interface GameField {
	/**
	 * Gets game field elements
	 * 
	 * @return game field elements
	 */
	public ArrayList<Integer> getElements();
}
