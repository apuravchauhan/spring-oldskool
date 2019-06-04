package com.apurav.springhistory;

import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.apurav.springhistory.service.IMessageRenderer;
/**
 * 
 * @author apuravchauhan
 *
 */
public class MainSpring {
    public static void main(String[] args) throws Exception {
       // BeanFactory beanFactory = getBeanFactoryViaProperties();

        IMessageRenderer messageRenderer = (IMessageRenderer) getBeanFactoryViaXML().getBean("renderer");
        messageRenderer.render();
    }
    private static BeanFactory getBeanFactoryViaXML() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("context.xml",MainSpring.class));
        return beanFactory;
    }
    private static BeanFactory getBeanFactoryViaProperties() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertiesBeanDefinitionReader beanDefinitionReader = new PropertiesBeanDefinitionReader(beanFactory);
        Properties properties = new Properties();
        properties.load(MainSpring.class.getResourceAsStream("beans.properties"));
        beanDefinitionReader.registerBeanDefinitions(properties);
        return beanFactory;
    }
  
}