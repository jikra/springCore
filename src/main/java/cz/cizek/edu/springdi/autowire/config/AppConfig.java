package cz.cizek.edu.springdi.autowire.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Configuration
@ComponentScan(basePackages = "cz.cizek.edu.springdi.autowire")
public class AppConfig {

    @Bean(name = "noveAhoj")
    public String text() {
        return new String("nove AHOJ");
    }
}
