/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab5;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements base control. Lab 5. 
 * 
 * @version 1.0 23 Dec 2020
 * @author Aleksey Krutko
 *
 */
public abstract class ControlBase implements Control {
	
	protected List<Observer> _childControls;
	protected int _width;
	protected int _height;

	/**
	 * Constructor
	 */
	public ControlBase() {
		_childControls = new ArrayList<Observer>();
		setSize(10, 10);
	}

	/**
	 * Updates the state of the control according to notifier
	 */
	@Override
	public void Update(Control sender) {
		System.out.println("Control has got an event and is going to resize according to its parent:");
		System.out.println(String.format("Parent size is %dx%d.", sender.getWidth(), sender.getHeight()));
		setSize(sender.getWidth() - 10, sender.getHeight() - 10);
		System.out.println(String.format("New size of this control (-10) is %dx%d.", getWidth(), getHeight()));
	}

	/**
	 * Notify child controls
	 */
	@Override
	public void Notify() {
		for (Observer observer : _childControls) {
			observer.Update(this);
		}
	}
	
	/**
	 * Gets current width of the control
	 */
	@Override
	public int getWidth() {
		return _width;
	}
	
	/**
	 * Gets current height of the control
	 */
	@Override
	public int getHeight() {
		return _height;
	}

	/**
	 * Sets size of the control
	 */
	@Override
	public void setSize(int width, int height) {
		_width = width;
		_height = height;
		
		Notify();
	}

	/**
	 * Adds child control
	 */
	@Override
	public void addControl(Control control) {
		_childControls.add(control);
	}

}
