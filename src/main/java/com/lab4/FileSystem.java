/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab4;

/**
 * Interface for FileSystem. Lab 4. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public interface FileSystem {

	/**
	 * Creates all files and directories of the file system.
	 */
	public void create();
	
	/**
	 * Destroys all files and directories of the file system.
	 */
	public void destroy();	
}
