package cz.cizek.edu.springdi.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class BeanUns {

    private BeanNA beanNA;

    public BeanUns() {
    }

    @Autowired(required = false)
    public BeanUns(BeanNA beanNA) {
        this.beanNA = beanNA;
    }
}
