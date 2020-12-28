/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab7;

import java.util.HashMap;

/**
 * Implements painting command invoker. Lab 7. 
 * 
 * @version 1.0 24 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class Painter implements Ivoker {
	private HashMap<String, Command> _commands;

	/**
	 * Constructor
	 */
	public Painter() {
		_commands = new HashMap<String, Command>();
	}

	/**
	 * Register command
	 */
	@Override
	public void registerCommand(String commandName, Command command) {
		_commands.put(commandName, command);

	}

	/**
	 * Execute command
	 */
	@Override
	public void execute(String commandName) {
		Command command = _commands.get(commandName);
		
		if (command == null)
			throw new IllegalArgumentException("Command is not registered!");
		
		command.Execute();
	}

}
