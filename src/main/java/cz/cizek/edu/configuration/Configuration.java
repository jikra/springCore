package cz.cizek.edu.configuration;

import cz.cizek.edu.configuration.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class Configuration {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("---------------------------");

        for (String s : context.getBeanDefinitionNames()) {
            System.out.println(s);
        }

        context.close();

    }
}
