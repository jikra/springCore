package cz.cizek.edu.profile.config;

import cz.cizek.edu.profile.bean.BBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Configuration
@Profile({"!unittest", "dev"})
public class DbConfig {

    @Bean
    public BBean bBean() {
        System.out.println("DbConfig create BBean");
        return new BBean();
    }

}
