/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab5;


/**
 * Implements base window. Lab 5. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class WindowBase extends ControlBase implements  Window {

	/**
	 * Shows the window
	 */
	@Override
	public void show() {
		System.out.println("Window is shown.");		
	}
}
