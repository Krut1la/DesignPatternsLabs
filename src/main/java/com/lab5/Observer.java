/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab5;

/**
 * Interface for observers. Lab 5. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public interface Observer {
	
	/**
	 * Updates state
	 * 
	 * @param sender
	 */
	public void Update(Control sender);

}
