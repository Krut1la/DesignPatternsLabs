/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab4;

/**
 * Interface for Directory. Lab 4. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public interface Directory {
	/**
	 * Creates a directory.
	 * 
	 * @param path
	 */
	public void create(String path);
	
	/**
	 * Removes a directory.
	 * 
	 * @param path
	 */
	public void rmdir(String path);

}
