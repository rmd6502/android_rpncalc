package com.calculatorguy.rpncalc.statemachine;

public interface State {
	public State handleEvent(Object c);
}
