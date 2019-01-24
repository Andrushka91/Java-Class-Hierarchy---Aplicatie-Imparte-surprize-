package P2_Imparte_surprize;

import java.util.ArrayList;
import java.util.Random;

public class FortuneCookie implements ISurprise {

	public static String message;
	private final static Random randomNumber = new Random();
	
	public FortuneCookie(String message) {
		this.message = message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void enjoy() {
		System.out.println("Fortune Cookie!!! " + message + "\n");
	}

	public static ISurprise generate() {
		
		int index = randomNumber.nextInt(19);
		CookieMessage fullMessage = new CookieMessage(index);
		 
		FortuneCookie fortuneCookie = new FortuneCookie(fullMessage.toString());
		
		return fortuneCookie;
	}

}
