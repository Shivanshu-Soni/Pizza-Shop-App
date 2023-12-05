package org.java.util;

public class Validator {
    public static final String NAME_PATTERN= "^[A-Za-z]+(\\s[A-Za-z]+)*$";
    public static boolean validateName( String name ) {
        return name.matches(NAME_PATTERN);
    }
    public static final String EMAIL_PATTERN= "^[a-zA-Z0-9._%+-]+@[a-zAZ0-9.-]+\\.[a-zA-Z]{2,}$";
    public static boolean validateEmail( String email ) {
        return email.matches(EMAIL_PATTERN);
    }
    public static final String PHONE_NUMBER_PATTERN= "^\\d{10}$";
    public static boolean validatePhoneNumber( String phoneNumber ) {
        return phoneNumber.matches(PHONE_NUMBER_PATTERN);
    }
}
