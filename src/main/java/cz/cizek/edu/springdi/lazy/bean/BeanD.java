package cz.cizek.edu.springdi.lazy.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
@Lazy
public class BeanD {

    public BeanD() {
        System.out.println("D");
    }

    public void test() {
        System.out.println("D - test");
    }
}
