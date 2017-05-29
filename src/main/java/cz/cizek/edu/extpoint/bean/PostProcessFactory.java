package cz.cizek.edu.extpoint.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Component
public class PostProcessFactory implements BeanFactoryPostProcessor {


    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

//        beanFactory.getBeanDefinition("SBean").getPropertyValues().add("value", "MOJE TEST");
        System.out.println(beanFactory);
    }
}
