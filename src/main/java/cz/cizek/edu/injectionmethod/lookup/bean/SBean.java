package cz.cizek.edu.injectionmethod.lookup.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public abstract class SBean {

    private PBean pBean;

    @Lookup("pBeanCreate")
    public abstract PBean getPBean();

    public void doSomething() {
        getPBean().doSomething();
    }
}
