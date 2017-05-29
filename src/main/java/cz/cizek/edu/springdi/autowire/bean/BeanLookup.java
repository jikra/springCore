package cz.cizek.edu.springdi.autowire.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Component
public abstract class BeanLookup {

    public void test() {
        String string = createString();
        System.out.println(string);
    }

    @Lookup("noveAhoj")
    abstract String createString();
}
