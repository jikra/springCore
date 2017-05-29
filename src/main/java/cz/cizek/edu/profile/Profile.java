package cz.cizek.edu.profile;

import cz.cizek.edu.profile.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class Profile {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("dev", "unittest", "test");

        context.register(AppConfig.class);
        context.refresh();

        System.out.println("---------------------------");

        context.close();

    }
}
