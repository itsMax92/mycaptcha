package com.mycaptcha.otp;

import com.twilio.Twilio;
import com.twilio.rest.verify.v2.service.Verification;

public class SendOtp {
	
	public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Verification verification = Verification.creator(
                "VAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "+15017122661",
                "sms")
            .create();

        System.out.println(verification.getStatus());
    }
}
