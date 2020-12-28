/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab5;

/**
 * Implements base button. Lab 5. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class ButtonBase extends ControlBase implements Button{

	/**
	 * Pushes the button
	 */
	@Override
	public void push() {
		System.out.println("Button is pushed.");
	}
}
