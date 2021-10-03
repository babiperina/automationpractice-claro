package com.example.automationpracticeclarov2.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Factory {

    public static String emailFactory(){
        String email = "babiperina+";
        String formatedDate = new SimpleDateFormat( "ddMMyyyy_HHmmss" ).format(Calendar.getInstance().getTime());
       return email+formatedDate+"@test.com";
    }
}
