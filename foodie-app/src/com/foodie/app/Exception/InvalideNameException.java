package com.foodie.app.Exception;

public class InvalideNameException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public InvalideNameException() {
			
		}
		
		public InvalideNameException(String message) {
			super(message);
		} 

}
