package cz.cizek.edu.springdi.circular.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class BeanA {

    private BeanB beanB;

//    @Autowired
//    public BeanA(BeanB beanB) {
//        this.beanB = beanB;
//    }


    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}
