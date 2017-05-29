package cz.cizek.edu.configuration.config;

import cz.cizek.edu.configuration.bean.ABean;
import cz.cizek.edu.configuration.bean.SBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Configuration
public class AppConfig2 {

    //    @Bean
    //    public SBean sBean() {
    //
    //        System.out.println("Config SBean");
    //        return new SBean();
    //    }

    @Bean
    public ABean aBean(SBean sBean) {

        System.out.println("Config ABean: -> sBean:" + sBean);
        return new ABean(sBean);
    }

}
