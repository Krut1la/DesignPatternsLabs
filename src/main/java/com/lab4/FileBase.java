/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab4;

/**
 * Implementation of File. Lab 4. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class FileBase implements File {

	/**
	 * Constructor.
	 */
	public FileBase() {

	}

	/**
	 * Opens a file.
	 * 
	 * @param path
	 * @param createIfNotExists
	 */
	public void open(String path, boolean createIfNotExists) {
		if (createIfNotExists)
			System.out.println(String.format("File '%s' created.", path));
		else
			System.out.println(String.format("File '%s' opened.", path));
	}
	
	/**
	 * Closes a file.
	 */
	public void close() {
		System.out.println(String.format("File closed."));
	}
	
	/**
	 * Deletes a file.
	 * 
	 * @param path
	 */
	public void delete(String path) {
		System.out.println(String.format("File '%s' deleted.", path));
	}
}
