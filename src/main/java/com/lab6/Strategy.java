/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab6;

/**
 * Interface for strategy of changing a game field. Lab 6. 
 * 
 * @version 1.0 24 Dec 2020
 * @author Aleksey Krutko
 *
 */
public interface Strategy {
	/**
	 * Changes the game field according to a strategy
	 * 
	 * @param gameField Game field to apply the strategy on
	 */
	public void Apply(GameField gameField);

}
