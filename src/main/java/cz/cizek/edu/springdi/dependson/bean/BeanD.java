package cz.cizek.edu.springdi.dependson.bean;

import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class BeanD {

    public BeanD() {
        System.out.println("D");
    }
}
