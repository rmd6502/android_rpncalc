package com.calculatorguy.rpncalc.statemachine;

public interface State {
	public <T> State handleEvent(CalcEvent<T> c);
}
