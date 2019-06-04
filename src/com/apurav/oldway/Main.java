package com.apurav.oldway;

import com.apurav.oldway.service.ApuravChauhanMessageProvider;
import com.apurav.oldway.service.HelloWorldMessageProvider;
import com.apurav.oldway.service.IMessageProvider;
import com.apurav.oldway.service.IMessageRenderer;
import com.apurav.oldway.service.StandardOutMessageRenderer;

/**
 * 
 * @author apuravchauhan
 *
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        
        IMessageProvider provider = new HelloWorldMessageProvider();
        IMessageRenderer messageRenderer = new StandardOutMessageRenderer();
        messageRenderer.setMessageProvider(provider);
        messageRenderer.render();
    }

}