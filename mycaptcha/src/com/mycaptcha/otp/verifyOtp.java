package com.mycaptcha.otp;

import com.twilio.Twilio;
import com.twilio.rest.verify.v2.service.VerificationCheck;

public class verifyOtp {
	
	 public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
	    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

	    public static void main(String[] args) {
	        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	        VerificationCheck verificationCheck = VerificationCheck.creator(
	                "VAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
	            .setTo("+15017122661")
	            .setCode("123456")
	            .create();

	        System.out.println(verificationCheck.getStatus());
	    }
}
