package com.lab3;

import java.awt.Color;

public class LimitedAccessImageProxy implements Image {
	
	private Image _fullAccessImage;
	private int _minX;
	private int _minY;
	private int _maxX;
	private int _maxY;

	public LimitedAccessImageProxy(Image fullAccessImage, int minX, int minY, int maxX, int maxY) {
		_fullAccessImage = fullAccessImage;
		_minX = minX;
		_minY = minY;
		_maxX = maxX;
		_maxY = maxY;
	}

	@Override
	public Color getColorAt(int x, int y) {

		if (x < _minX || x > _maxX || y < _minY || y > _maxY)
			
			
		return _fullAccessImage.getColorAt(x, y);
	}

}
