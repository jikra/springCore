package cz.cizek.edu.profile.config;

import cz.cizek.edu.profile.bean.ABean;
import cz.cizek.edu.profile.bean.DBean;
import cz.cizek.edu.profile.bean.EBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Configuration
@ComponentScan(basePackages = "cz.cizek.edu.profile")
public class AppConfig {

    @Bean
    @Profile("dev")
    public ABean aBean() {
        System.out.println("ApConfig create ABean");
        return new ABean();
    }

    @Bean
    @Profile({"test", "prod"})
    public DBean dBean() {
        System.out.println("AppConfig create DBean");
        return new DBean();
    }

    @Bean
    public EBean eBean() {
        System.out.println("AppConfig create eBean");
        return new EBean();
    }

}
