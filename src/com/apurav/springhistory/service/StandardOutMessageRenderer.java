package com.apurav.springhistory.service;

public class StandardOutMessageRenderer implements IMessageRenderer {
    private IMessageProvider messageProvider = null;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:" + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(IMessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public IMessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}