package com.calculatorguy.rpncalc.statemachine;

public interface State<T> {
	public State<?> handleEvent(CalcEvent<T> c);
}
