package cz.cizek.edu.injectionmethod.lookup.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service("pBeanCreate")
@Scope(value = "prototype")
public class PBean {

    public PBean() {
        System.out.println("BPean created");
    }

    public void doSomething() {
        System.out.println("PBean do something");
    }
}
