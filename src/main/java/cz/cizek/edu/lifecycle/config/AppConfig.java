package cz.cizek.edu.lifecycle.config;

import cz.cizek.edu.lifecycle.bean.ABean;
import cz.cizek.edu.lifecycle.bean.SBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Configuration
@ComponentScan(basePackages = "cz.cizek.edu.lifecycle")
public class AppConfig {

    @Bean(name = "otherABean", initMethod = "initMe")
    public ABean otherABean(SBean sBean) {
        return new ABean(sBean);
    }

//    @Bean(name = "otherSBean")
//    public SBean otherSBean() {
//        return new SBean();
//    }
}
