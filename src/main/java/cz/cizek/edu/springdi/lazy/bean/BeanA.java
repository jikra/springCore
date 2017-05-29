package cz.cizek.edu.springdi.lazy.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
@Lazy
public class BeanA {

    public BeanA() {
        System.out.println("A");
    }

    public void test() {
        System.out.println("A test");
    }
}
