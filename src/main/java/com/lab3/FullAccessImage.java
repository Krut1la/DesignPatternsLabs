/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/


package com.lab3;

import java.awt.Color;

/**
 * Class implements full access to an image.  lab 3. 
 * 
 * @version 1.0 22 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class FullAccessImage implements Image {

	
	/**
	 * Constructor
	 */
	public FullAccessImage() {

	}

	/**
	 * Gets color of specific pixel.
	 */
	@Override
	public Color getColorAt(int x, int y) {
		System.out.println(String.format("Color at Pixels[%d, %d] is %d", x, y, x*y));
		return null;
	}

}
