/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab8;

/**
 * Implements cool iterator creator. Lab 8. 
 * 
 * @version 1.0 25 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class CoolIteratorCreator extends IteratorCreator {

	/**
	 * Creates cool iterator
	 */
	@Override
	public Iterator factoryMethod() {
		return new CoolIterator();
	}

}
