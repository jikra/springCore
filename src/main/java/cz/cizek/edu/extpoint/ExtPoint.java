package cz.cizek.edu.extpoint;

import cz.cizek.edu.extpoint.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class ExtPoint {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("---------------------------");

        for (String s : context.getBeanDefinitionNames()) {
            System.out.println(s);
        }

        context.close();

    }
}
