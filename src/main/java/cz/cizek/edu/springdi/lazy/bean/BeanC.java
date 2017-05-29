package cz.cizek.edu.springdi.lazy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
@Lazy
public class BeanC {

    private BeanD beanD;

    @Autowired
    public BeanC(BeanD beanD) {
        this.beanD = beanD;
        System.out.println("C");
    }
}
