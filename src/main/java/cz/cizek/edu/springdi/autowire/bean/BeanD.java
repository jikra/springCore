package cz.cizek.edu.springdi.autowire.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
@Order(value = 1)
public class BeanD implements BeanI {

    public void sout() {
        System.out.println("D - sout");
    }
}
