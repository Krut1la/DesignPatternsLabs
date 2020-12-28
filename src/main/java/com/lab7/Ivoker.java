/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab7;

/**
 * Interface for commands invoker. Lab 7. 
 * 
 * @version 1.0 24 Dec 2020
 * @author Aleksey Krutko
 *
 */
public interface Ivoker {
	/**
	 * Register command
	 * 
	 * @param commandName
	 * @param command
	 */
	public void registerCommand(String commandName, Command command);
	
	/**
	 * Execute command
	 * 
	 * @param commandName
	 */
	public void execute(String commandName);
}
