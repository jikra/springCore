package cz.cizek.edu.springdi.autowire;

import cz.cizek.edu.springdi.autowire.bean.BeanB;
import cz.cizek.edu.springdi.autowire.bean.BeanLookup;
import cz.cizek.edu.springdi.autowire.bean.BeanX;
import cz.cizek.edu.springdi.autowire.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class Autowire {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Context starts up");

        BeanB bean = context.getBean(BeanB.class);
        bean.callA();

        System.out.println("---------------------");
        BeanX beanX = context.getBean(BeanX.class);
        beanX.callI();

        System.out.println("-----------------------");
        BeanLookup beanL = context.getBean(BeanLookup.class);
        beanL.test();
    }
}
