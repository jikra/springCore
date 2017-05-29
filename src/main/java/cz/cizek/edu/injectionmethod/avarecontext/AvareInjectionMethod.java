package cz.cizek.edu.injectionmethod.avarecontext;

import cz.cizek.edu.injectionmethod.avarecontext.bean.SBean;
import cz.cizek.edu.injectionmethod.avarecontext.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class AvareInjectionMethod {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SBean bean = context.getBean(SBean.class);

        bean.doSomething();
        bean.doSomething();
        bean.doSomething();
        bean.doSomething();
    }
}
