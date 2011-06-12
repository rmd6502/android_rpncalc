package com.calculatorguy.rpncalc.statemachine;

public class KeyEvent implements CalcEvent<KeyValue> {
	public class UnknownKeyException extends Exception {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3615721204854827370L;

		public UnknownKeyException() {
			super("Unknown Key");
		}
	}

	private KeyValue key;
	
	public CalcEventType getType() {
		return CalcEventType.KEY_EVENT;
	}

	public KeyValue getValue() {
		return key;
	}
	
	public KeyEvent(String s) throws UnknownKeyException {
		if (s.equals("0")) {
			key = KeyValue.KEY_0;
		} else if (s.equals("1")) {
			key = KeyValue.KEY_1;
		} else {
			throw new UnknownKeyException();
		}
	}
}
