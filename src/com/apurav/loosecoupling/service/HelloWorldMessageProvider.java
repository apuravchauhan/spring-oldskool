package com.apurav.loosecoupling.service;

public class HelloWorldMessageProvider implements IMessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}