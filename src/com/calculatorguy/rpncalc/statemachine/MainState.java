package com.calculatorguy.rpncalc.statemachine;


public class MainState implements State<?> {

	public State handleEvent(CalcEvent<KeyValue> c) {
		switch(c.getValue()) {
		case KEY_0:
			break;
		}
		return null;
	}
}
