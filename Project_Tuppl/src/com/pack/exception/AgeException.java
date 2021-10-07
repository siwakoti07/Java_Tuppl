package com.pack.exception;

public class AgeException extends Exception{

		private String exceptionMsg;

		public AgeException() {
			
		}

		public AgeException(String exceptionMsg) {
			this.exceptionMsg = exceptionMsg;
		}

}