package cz.cizek.edu.proxyscope;

import cz.cizek.edu.proxyscope.bean.PBean;
import cz.cizek.edu.proxyscope.bean.SBean;
import cz.cizek.edu.proxyscope.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class ProxyScope {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SBean bean = context.getBean(SBean.class);
        System.out.println("bean: " + bean.toString());
        bean = context.getBean(SBean.class);
        System.out.println("bean: " + bean.toString());
        bean = context.getBean(SBean.class);
        System.out.println("bean: " + bean.toString());


        System.out.println("---------------------------");

        PBean bean1 = context.getBean(PBean.class);
        System.out.println("bean1: " + bean1.toString());
        bean1 = context.getBean(PBean.class);
        System.out.println("bean1: " + bean1.toString());
        bean1 = context.getBean(PBean.class);
        System.out.println("bean1: " + bean1.toString());

        System.out.println("---------------------------");
        bean.iMethod();

        context.close();

    }
}
