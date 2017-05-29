package cz.cizek.edu.configuration.config;

import cz.cizek.edu.configuration.bean.ABean;
import cz.cizek.edu.configuration.bean.SBean;
import cz.cizek.edu.springdi.autowire.bean.BeanB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Configuration
@ComponentScan(basePackages = "cz.cizek.edu.configuration")
public class AppConfig {

    @Bean
    public SBean sBean() {

        System.out.println("Config SBean");
        return new SBean();
    }

//    @Bean
//    public ABean aBean(SBean sBean) {
//
//        System.out.println("Config ABean: -> sBean:" + sBean);
//        return new ABean(sBean);
//    }

}
