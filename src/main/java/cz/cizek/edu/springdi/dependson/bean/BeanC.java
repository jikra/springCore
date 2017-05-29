package cz.cizek.edu.springdi.dependson.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class BeanC {

    public BeanC() {
        System.out.println("C");
    }
}
