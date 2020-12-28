/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab9;

/**
 * Implements cool schema. Lab 9. 
 * 
 * @version 1.0 25 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class CoolSchema implements Schema {
	
	/**
	 * Hidden constructor for singleton purpose
	 */
	private CoolSchema() {

	}

	/**
	 * Shows schema of the cool data base
	 */
	@Override
	public void showSchema() {
		System.out.println("Cool schema is shown.");

	}
	
	/**
	 * Singleton instance holder
	 *
	 */
	private static class Singleton{
		public static final CoolSchema instance = new CoolSchema();
		
	}

	/**
	 * Returns instance of CoolSchema
	 * 
	 * @return
	 */
	public static Schema getInstance() {
		return Singleton.instance;
	}

}
