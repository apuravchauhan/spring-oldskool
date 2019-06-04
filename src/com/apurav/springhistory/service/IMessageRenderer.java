package com.apurav.springhistory.service;

public interface IMessageRenderer {
    public void render();

    // setter used by spring for injection
    public void setMessageProvider(IMessageProvider provider);

    public IMessageProvider getMessageProvider();
}