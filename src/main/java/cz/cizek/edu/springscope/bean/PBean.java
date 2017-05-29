package cz.cizek.edu.springscope.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
@Scope(value = "prototype")
public class PBean {

    private SBean sBean;

    @Autowired
    public PBean(SBean sBean) {
        this.sBean = sBean;
        System.out.println("prototype 'PBean' was created");
    }

    public PBean() {
        System.out.println("prototype 'PBean' was created");
    }

    @Override
    public String toString() {
        return "PBean=" + super.toString() +
                "{sBean=" + sBean +
                '}';
    }
}
