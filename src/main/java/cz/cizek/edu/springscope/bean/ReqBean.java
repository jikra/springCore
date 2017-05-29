package cz.cizek.edu.springscope.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Component
//@Scope(value = "request") // tohle nebude fungovat protože to neuděla proxy když se tvoří controller
@RequestScope // tohle ano -- je to alias na request a proxy scope
public class ReqBean {

    public ReqBean() {
        System.out.println("ReqBean created");
    }
}
