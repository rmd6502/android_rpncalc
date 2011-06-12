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
		} else if (s.equals("2")) {
			key = KeyValue.KEY_2;
		} else if (s.equals("3")) {
			key = KeyValue.KEY_3;
		} else if (s.equals("4")) {
			key = KeyValue.KEY_4;
		} else if (s.equals("5")) {
			key = KeyValue.KEY_5;
		} else if (s.equals("6")) {
			key = KeyValue.KEY_6;
		} else if (s.equals("7")) {
			key = KeyValue.KEY_7;
		} else if (s.equals("8")) {
			key = KeyValue.KEY_8;
		} else if (s.equals("9")) {
			key = KeyValue.KEY_9;
		} else if (s.equals("+")) {
			key = KeyValue.KEY_PLUS;
		} else if (s.equals("-")) {
			key = KeyValue.KEY_MINUS;
		} else if (s.equals("*")) {
			key = KeyValue.KEY_TIMES;
		} else if (s.equals("Ö")) {
			key = KeyValue.KEY_DIV;
		} else if (s.equals("sin")) {
			key = KeyValue.KEY_SIN;
		} else if (s.equals("cos")) {
			key = KeyValue.KEY_COS;
		} else if (s.equals("tan")) {
			key = KeyValue.KEY_TAN;
		} else if (s.equals("sqrt")) {
			key = KeyValue.KEY_SQRT;
		} else {
			throw new UnknownKeyException();
		}
	}
}
