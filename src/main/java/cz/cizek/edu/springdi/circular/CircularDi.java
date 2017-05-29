package cz.cizek.edu.springdi.circular;

import cz.cizek.edu.springdi.circular.bean.BeanA;
import cz.cizek.edu.springdi.circular.bean.BeanB;
import cz.cizek.edu.springdi.circular.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class CircularDi {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BeanA beanA = context.getBean(BeanA.class);
        BeanB beanB = context.getBean(BeanB.class);

        System.out.println("END");
    }
}
