/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab4;

/**
 * Interface for FileSystenEntry. Adapter for File and Directory. Lab 4. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public interface FileSystemEntry {
	/**
	 * Creates entry in the file system.
	 */
	public void create();
	
	/**
	 * Destroys entry in the file system.
	 */
	public void destroy();	
}
