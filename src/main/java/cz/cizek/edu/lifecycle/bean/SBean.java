package cz.cizek.edu.lifecycle.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class SBean implements BeanNameAware {

    public void close() {
        System.out.println("SBean closed");
    }

    public void setBeanName(String name) {
        System.out.println("moje name je: " + name);
    }
}
