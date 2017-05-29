package cz.cizek.edu.springscope.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Component
@SessionScope
public class SessBean {

    public SessBean() {
        System.out.println("SessBean created");
    }
}
