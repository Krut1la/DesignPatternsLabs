/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab4;

/**
 * Implements File adapter for file system. Lab 4. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class FileSystemEntryFile implements FileSystemEntry {
	
	private File _file;
	private String _path;

	/**
	 * Constructor
	 * 
	 * @param file
	 * @param path
	 */
	public FileSystemEntryFile(File file, String path) {
		_file = file;
		_path = path;
	}

	/**
	 * Creates file in the file system.
	 */
	@Override
	public void create() {
		_file.open(_path, true);
		
	}
	
	/**
	 * Destroys file in the file system.
	 */
	@Override
	public void destroy() {
		_file.delete(_path);
	}	
}
