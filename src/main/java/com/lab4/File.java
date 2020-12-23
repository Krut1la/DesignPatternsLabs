/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab4;

/**
 * Interface for File. Lab 4. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public interface File {
	/**
	 * Opens a file.
	 * 
	 * @param path
	 * @param createIfNotExists
	 */
	public void open(String path, boolean createIfNotExists);
	
	/**
	 * Closes a file.
	 */
	public void close();
	
	/**
	 * Deletes a file.
	 * 
	 * @param path
	 */
	public void delete(String path);
}
