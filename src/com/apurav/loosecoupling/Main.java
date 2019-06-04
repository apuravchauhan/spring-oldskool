package com.apurav.loosecoupling;

import com.apurav.loosecoupling.service.IMessageRenderer;

/**
 * 
 * @author apuravchauhan
 *
 */
public class Main {
    public static void main(String[] args) throws Exception {
        IMessageRenderer renderer = (IMessageRenderer) ApuravFramework.beanRegistry.get("renderer");
        renderer.render();
    }
}