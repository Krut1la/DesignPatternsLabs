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
 * Interface for image lab 3. 
 * 
 * @version 1.0 21 Dec 2020
 * @author Aleksey Krutko
 *
 */

public interface Image {
	/**
	 * Gets color of specific pixel.
	 * 
	 * @param x coordinate of the pixel
	 * @param y coordinate of the pixel
	 * @return  Color
	 */
	public Color getColorAt(int x, int y); 
}
