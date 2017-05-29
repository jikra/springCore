package cz.cizek.edu.extpoint.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Component
public class PostProcess implements BeanPostProcessor/* MergedBeanDefinitionPostProcessor */ {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("before-" + beanName + ":" + bean);

        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("after-" + beanName + ":" + bean);

        return bean;
    }

    //    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
    //
    //    }
}
