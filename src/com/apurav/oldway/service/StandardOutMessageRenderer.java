package com.apurav.oldway.service;
/**
 * @author apuravchauhan
 */
public class StandardOutMessageRenderer implements IMessageRenderer {
    private IMessageProvider messageProvider = null;
    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set messageProvider");
        }
        System.out.println(messageProvider.getMessage());
    }
    @Override
    public void setMessageProvider(IMessageProvider provider) {
        this.messageProvider = provider;
    }
}