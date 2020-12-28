/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab9;

/**
 * Implements nice data base factory. Lab 9. 
 * 
 * @version 1.0 25 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class NiceDatabaseFactory implements DataBaseFactory {

	/**
	 * Creates a table of the nice data base
	 */
	@Override
	public Table CreateTable() {
		return new NiceTable();
	}

	/**
	 * Creates a schema of the nice data base
	 */
	@Override
	public Schema CreateSchema() {
		return NiceSchema.getInstance();
	}

	/**
	 * Creates a loader of the nice data base
	 */
	@Override
	public Loader CreateLoader() {
		return new NiceLoader();
	}

}
