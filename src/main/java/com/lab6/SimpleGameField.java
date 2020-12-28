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
 * Implements a simple game field. Lab 6. 
 * 
 * @version 1.0 24 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class SimpleGameField implements GameField {
	protected ArrayList<Integer> _gameField;

	/**
	 * Constructor
	 */
	public SimpleGameField() {
		_gameField = new ArrayList<Integer>();
		_gameField.add(10);
		_gameField.add(200);
		_gameField.add(30);
		_gameField.add(4);
		_gameField.add(50);
	}

	/**
	 * Gets game field elements
	 */
	@Override
	public ArrayList<Integer> getElements() {
		return _gameField;
	}
	
	@Override
	public String toString() {
		String result = "[";
		for (Integer integer : _gameField) {
			result+= integer.toString() + ", ";
		}
		result+= "]";
		
		return result;
	}

}
