/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab4;

/**
 * Implements Directory adapter for file system. Lab 4. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class FileSystemEntryDirectory implements FileSystemEntry {
	
	private Directory _directory;
	private String _path;

	public FileSystemEntryDirectory(Directory directory, String path) {
		_directory = directory;
		_path = path;
	}

	/**
	 * Creates directory in the file system.
	 */
	@Override
	public void create() {
		_directory.create(_path);
	}
	
	/**
	 * Destroys directory in the file system.
	 */
	@Override
	public void destroy() {
		_directory.rmdir(_path);
	}	
}
