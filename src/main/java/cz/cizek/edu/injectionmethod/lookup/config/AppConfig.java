package cz.cizek.edu.injectionmethod.lookup.config;

import cz.cizek.edu.injectionmethod.lookup.bean.PBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Configuration
@ComponentScan(basePackages = "cz.cizek.edu.injectionmethod.lookup")
public class AppConfig {

}
