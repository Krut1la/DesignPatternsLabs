/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab9;

/**
 * Implements cool data base factory. Lab 9. 
 * 
 * @version 1.0 25 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class CoolDatabaseFactory implements DataBaseFactory {

	/**
	 * Creates a table
	 */
	@Override
	public Table CreateTable() {
		return new CoolTable();
	}

	/**
	 * Creates a schema
	 */
	@Override
	public Schema CreateSchema() {
		return CoolSchema.getInstance();
	}

	/**
	 * Creates a loader
	 */
	@Override
	public Loader CreateLoader() {
		return new CoolLoader();
	}

}
