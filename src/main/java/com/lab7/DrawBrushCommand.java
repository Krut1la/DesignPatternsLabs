/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab7;

/**
 * Implements brush command. Lab 7. 
 * 
 * @version 1.0 24 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class DrawBrushCommand implements Command {
	private Paper _paper;

	/**
	 * Constructor
	 * 
	 * @param paper
	 */
	public DrawBrushCommand(Paper paper) {
		_paper = paper;
	}

	/**
	 * Execute brush drawing
	 */
	@Override
	public void Execute() {
		_paper.drawSpot(10);
	}

}
