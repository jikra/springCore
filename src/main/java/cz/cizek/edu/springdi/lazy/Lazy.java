package cz.cizek.edu.springdi.lazy;

import cz.cizek.edu.springdi.lazy.bean.BeanB;
import cz.cizek.edu.springdi.lazy.bean.BeanC;
import cz.cizek.edu.springdi.lazy.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class Lazy {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Context starts up");

        context.getBean(BeanC.class);

        System.out.println("Try to create B bean");
        context.getBean(BeanB.class);

    }
}
