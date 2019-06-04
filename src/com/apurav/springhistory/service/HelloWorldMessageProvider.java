package com.apurav.springhistory.service;

public class HelloWorldMessageProvider implements IMessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}