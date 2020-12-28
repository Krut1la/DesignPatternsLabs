/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab5;

/**
 * Interface for control. Lab 5. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public interface Control extends Observer, NotifyEvent{
	/**
	 * Gets current width of the control
	 */
	public int getWidth();
	
	/**
	 * Gets current height of the control
	 */
	public int getHeight();
	
	/**
	 * Sets size of the control
	 * 
	 * @param width
	 * @param height
	 */
	public void setSize(int width, int height);
	
	/**
	 * Adds child control
	 * 
	 * @param control
	 */
	public void addControl(Control control);
}
