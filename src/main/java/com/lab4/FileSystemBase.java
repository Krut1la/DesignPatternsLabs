/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab4;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of FileSysten. Lab 4. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class FileSystemBase implements FileSystem {
	
	protected List<FileSystemEntry> fileSystemEntries;

	/**
	 * Constructor.
	 */
	public FileSystemBase() {
		fileSystemEntries = new ArrayList<FileSystemEntry>();
	}
	
	/**
	 * Gets the list of entries.
	 */
	public List<FileSystemEntry> getFileSystemEntries(){
		return fileSystemEntries;
	}

	/**
	 * Creates all files and directories of the file system.
	 */
	@Override
	public void create() {
		for (FileSystemEntry fileSystemEntry : fileSystemEntries) {
			fileSystemEntry.create();
		}
	}
	
	/**
	 * Destroys all files and directories of the file system.
	 */
	@Override
	public void destroy() {
		for (FileSystemEntry fileSystemEntry : fileSystemEntries) {
			fileSystemEntry.destroy();
		}
	}	
}
