package com.calculatorguy.rpncalc.statemachine;


public class MainState implements State {

	public <T>State handleEvent(CalcEvent<T> c) {
		@SuppressWarnings("unchecked")
		CalcEvent<KeyValue> cc = (CalcEvent<KeyValue>) c;
		switch(cc.getValue()) {
		case KEY_0:
			break;
		}
		return null;
	}
}
