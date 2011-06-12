/**
 * 
 */
package com.calculatorguy.rpncalc.statemachine;

/**
 * @author rmd
 *
 */
public interface CalcEvent<T> {
	public CalcEventType getType();
	public T getValue();
}
