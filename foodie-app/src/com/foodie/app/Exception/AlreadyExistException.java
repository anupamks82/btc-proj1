package com.foodie.app.Exception;

public class AlreadyExistException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public AlreadyExistException() {
			
		}
		
		public AlreadyExistException(String message) {
			super(message);
		} 

}
