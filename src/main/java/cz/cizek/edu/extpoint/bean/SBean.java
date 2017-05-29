package cz.cizek.edu.extpoint.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class SBean {

    @Value("${test}")
    private String value;

    @PostConstruct
    private void init() {
        System.out.println("SBena init: " + value);
    }
}
