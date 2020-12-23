/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab4;

/**
 * Implementation of Directory. Lab 4. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class DirectoryBase implements Directory {

	/**
	 * Constructor.
	 */
	public DirectoryBase() {

	}
	
	/**
	 * Creates a directory.
	 * 
	 * @param path
	 */
	@Override
	public void create(String path) {
		System.out.println(String.format("Directory '%s' created.", path));
	}
	
	/**
	 * Removes a directory.
	 * 
	 * @param path
	 */
	@Override
	public void rmdir(String path) {
		System.out.println(String.format("Directory '%s' removed.", path));
	}

}
