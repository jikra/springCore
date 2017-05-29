package cz.cizek.edu.proxyscope.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class SBean {

    private PBeanInterface pBean;

    @Autowired
    public SBean(PBeanInterface pBean) {
        this.pBean = pBean;
    }

    public SBean() {
        System.out.println("SBean created");
    }

    public void iMethod() {
        ((PBean) pBean).implMethod();

        pBean.imethod();
    }

    @Override
    public String toString() {
        return "SBean=" + super.toString() + "{" +
                "pBean=" + pBean.getClass() +
                '}';
    }
}
