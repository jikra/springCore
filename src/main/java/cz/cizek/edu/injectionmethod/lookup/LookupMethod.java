package cz.cizek.edu.injectionmethod.lookup;

import cz.cizek.edu.injectionmethod.lookup.bean.SBean;
import cz.cizek.edu.injectionmethod.lookup.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class LookupMethod {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SBean bean = context.getBean(SBean.class);

        bean.doSomething();
        bean.doSomething();
        bean.doSomething();
        bean.doSomething();
    }
}
