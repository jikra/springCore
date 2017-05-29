package cz.cizek.edu.extpoint.config;

import cz.cizek.edu.extpoint.bean.ABean;
import cz.cizek.edu.extpoint.bean.SBean;
import cz.cizek.edu.extpoint.bean.XBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;

import java.util.Properties;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Configuration
@ComponentScan(basePackages = "cz.cizek.edu.extpoint")
public class AppConfig {

    @Value("${test}")
    private String val;

    @Bean
    public XBean xBean() {
        System.out.println("val:" + val);
        return new XBean(val);
    }

    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {

        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
        Properties properties = new Properties();
        properties.put("test", "testa");

        propertyPlaceholderConfigurer.setProperties(properties);

        return propertyPlaceholderConfigurer;
    }
}
