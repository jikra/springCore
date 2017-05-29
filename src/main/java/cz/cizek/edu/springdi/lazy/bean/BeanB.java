package cz.cizek.edu.springdi.lazy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
@Scope(value = "prototype")
public class BeanB {

    private final BeanA beanA;

    public BeanB(BeanA beanA) {
        this.beanA = beanA;
        System.out.println("B");
    }

    public void callA() {
        this.beanA.test();
    }
}
