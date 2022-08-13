package com.example.spring.boot.jpa.h2.crud;

import java.util.ResourceBundle;

public class Messages {

    public static String get(String messageKey) {
        return ResourceBundle.getBundle("messages").getString(messageKey);
    }
    
    public static String format(String messageKey, Object... args) {
    	return String.format(get(messageKey), args);
    }

}