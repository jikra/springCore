package cz.cizek.edu.configuration.bean;

import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class SBean {

    public SBean() {
        System.out.println("SBean created:" + this);
    }
}
