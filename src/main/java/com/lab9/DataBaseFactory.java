/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab9;

/**
 * Interface for data base factory. Lab 9. 
 * 
 * @version 1.0 25 Dec 2020
 * @author Aleksey Krutko
 *
 */
public interface DataBaseFactory {
	/**
	 * Creates a table
	 * 
	 * @return
	 */
	public Table CreateTable();
	
	/**
	 * Creates a schema
	 * 
	 * @return
	 */
	public Schema CreateSchema();
	
	/**
	 * Creates a loader
	 * 
	 * @return
	 */
	public Loader CreateLoader();

}
