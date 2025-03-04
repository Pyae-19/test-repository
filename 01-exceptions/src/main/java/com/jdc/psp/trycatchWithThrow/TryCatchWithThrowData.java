package com.jdc.psp.trycatchWithThrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class TryCatchWithThrowData {
	
	public void useMessage()   {
		try {
				String message = getData();
		
//				if(message.length() == 0 | message.isBlank()) {
//					throw new NoSuchElementException("There is no message.");
//				}
				System.out.println(checkMessage(message));
				
			}catch (IOException e) {
				System.err.println(e.getMessage());
				
			}catch (NoSuchElementException e) {
				System.err.println(e.getMessage());
			}
	}
	
	//when create check type, must be throwss that type
	//when create uncheck type, it's all up to you
	//when you used throws, it must be same type or suprer type of you create object exception
	@SuppressWarnings("unused")
	private String checkMessage(String message) throws NullPointerException {
		
		if(message.isBlank()) {
			throw new NullPointerException("There is no message.");
		}
		return message;
	}
	
	@SuppressWarnings("unused")
	private String otherCheck(String message) {
		String msg = checkMessage(message);
		return msg;
	}
	
	private String getData() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type your messge!!!");
		return br.readLine();
	}

}
