package cz.cizek.edu.springdi.autowire.bean;

import cz.cizek.edu.springdi.autowire.MyQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class BeanX {

//    --------Crash--------- if no primary or qualifier
    private BeanI beanI;

    @Autowired
    public BeanX(@MyQualifier("beanD") BeanI beanI) {
        this.beanI = beanI;
    }

    public void callI() {
        beanI.sout();
    }


    //---------Array order------------
//    private BeanI[] beanI;
//
//    @Autowired
//    public BeanX(BeanI[] beanI) {
//        this.beanI = beanI;
//    }
//
//    public void callI() {
//        for (BeanI i : beanI) {
//            i.sout();
//        }
//    }

}
