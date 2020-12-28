/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab7;

/**
 * Implements the pencil command. Lab 7. 
 * 
 * @version 1.0 24 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class DrawPencilCommand implements Command {
	private Paper _paper;

	/**
	 * Constructor
	 * 
	 * @param paper
	 */
	public DrawPencilCommand(Paper paper) {
		_paper = paper;
	}

	/**
	 * Execute pencil drawing
	 */
	@Override
	public void Execute() {
		_paper.drawSpot(3);
	}
}
