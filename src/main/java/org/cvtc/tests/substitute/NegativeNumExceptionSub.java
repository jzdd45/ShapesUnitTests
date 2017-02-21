package org.cvtc.tests.substitute;

public class NegativeNumExceptionSub extends Exception {
	// A custom exception for handling numbers less than 0. 

	private static final long serialVersionUID = -3966048059969669473L;
			
	// The message the exception will return if called.
	public NegativeNumExceptionSub() {
		super("Error: Please enter a positive number.");
	}

}
