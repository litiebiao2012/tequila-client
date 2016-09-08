package com.tequila.client.spring.support.schema;

import com.tequila.client.core.config.ApplicationConfig;
import com.tequila.client.core.config.JobConfig;
import com.tequila.client.core.config.RegistryConfig;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by fe on 16/9/1.
 */
public class TequilaNamespaceHandler extends NamespaceHandlerSupport{


    public void init() {
        registerBeanDefinitionParser("application",new TequilaBeanDefinitionParser(ApplicationConfig.class,true));
        registerBeanDefinitionParser("registry",new TequilaBeanDefinitionParser(RegistryConfig.class,true));
        registerBeanDefinitionParser("job",new TequilaBeanDefinitionParser(JobConfig.class,true));
    }
}
