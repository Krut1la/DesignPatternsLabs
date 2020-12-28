/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab9;


/**
 * Implements nice schema. Lab 9. 
 * 
 * @version 1.0 25 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class NiceSchema implements Schema {
	
	/**
	 * Hidden constructor for singleton purpose
	 */
	private NiceSchema() {

	}

	/**
	 * Shows schema of the nice data base
	 */
	@Override
	public void showSchema() {
		System.out.println("Nice schema is shown.");

	}
	
	/**
	 * Singleton instance holder
	 *
	 */
	private static class Singleton{
		public static final NiceSchema instance = new NiceSchema();
		
	}

	/**
	 * Returns instance of NiceSchema
	 * 
	 * @return
	 */
	public static Schema getInstance() {
		return Singleton.instance;
	}
}
