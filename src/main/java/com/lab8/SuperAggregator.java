/*
 * Aleksey Krutko
 * 
 * FIOT KPI
 * 
 * Copyright (c) 2020 
*/
package com.lab8;

/**
 * Implements super aggregator that can iterate in many ways. Lab 8. 
 * 
 * @version 1.0 25 Dec 2020
 * @author Aleksey Krutko
 *
 */
public class SuperAggregator implements Aggregator {
	
	private IteratorCreator[] _iteratorCreators = {new CoolIteratorCreator(), new NiceIteratorCreator()};

	/**
	 * Iterates in many ways
	 */
	@Override
	public void iterate() {
		for (IteratorCreator iteratorCreator : _iteratorCreators) {
			Iterator iterator = iteratorCreator.factoryMethod();
			System.out
			.println(String.format("Next element returned by %s is %d", iterator.getClass(), iterator.getNext()));
		}
	}

}
