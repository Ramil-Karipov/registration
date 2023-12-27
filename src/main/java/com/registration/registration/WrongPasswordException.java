package com.registration.registration;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Используются недопустимые для пароля символы.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

