/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab7;

/**
 * Implements the thick paper. Lab 7. 
 * 
 * @version 1.0 24 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class ThickPaper implements Paper {

	/**
	 * Draws spot with specific radius.
	 */
	@Override
	public void drawSpot(int spotRadius) {
		System.out.println(String.format("Spot of size %d has been drawn", spotRadius));
	}

}
