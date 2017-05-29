package cz.cizek.edu.springdi.autowire.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class BeanA {

    public BeanA() {
        System.out.println("A");
    }

    public void sout() {
        System.out.println("A - sout");
    }
}
