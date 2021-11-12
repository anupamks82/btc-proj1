package com.foodie.app.Exception;

public class InvalideCategoryException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public InvalideCategoryException() {
			
		}
		
		public InvalideCategoryException(String message) {
			super(message);
		} 

}
