package cz.cizek.edu.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class ABean {

    private final SBean sBean;

    @Autowired
    public ABean(SBean sBean) {
        System.out.println("ABen crated");
        this.sBean = sBean;
    }
}
