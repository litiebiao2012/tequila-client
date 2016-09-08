package com.tequila.client.spring.support.schema;

import com.tequila.client.core.config.ApplicationConfig;
import com.tequila.client.core.config.JobConfig;
import com.tequila.client.core.config.RegistryConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * Created by fe on 16/9/1.
 */
public class TequilaBeanDefinitionParser implements BeanDefinitionParser {

    public static final Logger logger = LoggerFactory.getLogger(TequilaBeanDefinitionParser.class);

    private final Class<?> beanClass;

    private final boolean required;

    public TequilaBeanDefinitionParser(Class<?> beanClass, boolean required) {
        this.beanClass = beanClass;
        this.required = required;
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        try {
            return parse(element,parserContext,beanClass,required);
        } catch (Exception e) {
            logger.error("parse error , e : {}",e);
            throw new RuntimeException("parse error!",e);
        }
    }

    private static BeanDefinition parse(Element element, ParserContext parserContext,Class<?> beanClass,boolean required) throws  Exception {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(beanClass);
        beanDefinition.setLazyInit(false);
        if (ApplicationConfig.class.equals(beanClass)) {

        }
        if (RegistryConfig.class.equals(beanClass)) {

        }


        if (JobConfig.class.equals(beanClass)) {

        }
        return null;
    }
}
