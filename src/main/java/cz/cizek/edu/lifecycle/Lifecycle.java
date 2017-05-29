package cz.cizek.edu.lifecycle;

import cz.cizek.edu.lifecycle.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class Lifecycle {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("---------------------------");

        context.close();

    }
}
