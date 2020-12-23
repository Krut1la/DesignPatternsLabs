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
 * Class implements limited access to an image.  lab 3. 
 * 
 * @version 1.0 22 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class LimitedAccessImageProxy implements Image {
	
	private Image _fullAccessImage;
	private int _minX;
	private int _minY;
	private int _maxX;
	private int _maxY;

	/**
	 * Constructor
	 * 
	 * @param fullAccessImage  An image interface.
	 * @param minX
	 * @param minY
	 * @param maxX
	 * @param maxY
	 */
	public LimitedAccessImageProxy(Image fullAccessImage, int minX, int minY, int maxX, int maxY) {
		_fullAccessImage = fullAccessImage;
		_minX = minX;
		_minY = minY;
		_maxX = maxX;
		_maxY = maxY;
	}

	/**
	 * Gets color of specific pixel with limitation.
	 * 
	 * @param x coordinate of the pixel
	 * @param y coordinate of the pixel
	 * @return  Color
	 */
	@Override
	public Color getColorAt(int x, int y) throws IllegalArgumentException{

		if (x < _minX || x > _maxX || y < _minY || y > _maxY)
			throw new IllegalArgumentException(String.format("Access to Pixel[%d, %d] denied!", x, y));
			
		return _fullAccessImage.getColorAt(x, y);
	}

}
