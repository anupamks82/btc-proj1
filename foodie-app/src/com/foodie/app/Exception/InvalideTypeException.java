package com.foodie.app.Exception;

public class InvalideTypeException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public InvalideTypeException() {
			
		}
		
		public InvalideTypeException(String message) {
			super(message);
		} 

}
