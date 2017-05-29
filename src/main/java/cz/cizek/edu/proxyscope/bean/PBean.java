package cz.cizek.edu.proxyscope.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PBean implements PBeanInterface {

    public PBean() {
        System.out.println("PBean created");
    }

    public void implMethod() {
        System.out.println("IMPL");
    }

    public void imethod() {
        System.out.println("INTERFACE");
        implMethod();
    }
}
