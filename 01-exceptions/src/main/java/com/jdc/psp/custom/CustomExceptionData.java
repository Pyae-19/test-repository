package com.jdc.psp.custom;

public class CustomExceptionData  {
	
//	public void useException(String message) {
//		changeCheckToUncheck(message);
//	}
	
	
	@SuppressWarnings("unused")
	public String changeCheckToUncheck(String message) {
		try {
			
			@SuppressWarnings("unused")
			String check = getMyCheckException(message);
			System.out.println(check);
			
		}catch (MyCheckException e) {
			System.err.println(e.getMessage());
			throw new MyUnCheckException(e.getMessage());
		}
		return message;
	}
	
	
	
	public String getMyCheckException(String message) throws MyCheckException{
		if(null == message || message.isBlank()) {
			throw new MyCheckException("There is no message yet for check");
		}
		return message;
	}
	
	public String getMyUnCheckException(String message) {
		if(null == message ||message.isBlank()) {
			throw new MyUnCheckException("There is no message yet for uncheck");
		}
		return message;
	}



	
}
