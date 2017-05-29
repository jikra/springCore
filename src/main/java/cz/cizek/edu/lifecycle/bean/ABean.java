package cz.cizek.edu.lifecycle.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
//@Service
public class ABean implements InitializingBean {

    private final SBean sBean;

    @Autowired
    public ABean(SBean sBean) {
        this.sBean = sBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("postContruct");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("init bean");
    }

    public void initMe() {
        System.out.println("init method");
    }
}
