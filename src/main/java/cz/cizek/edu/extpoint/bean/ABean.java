package cz.cizek.edu.extpoint.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class ABean {

    private final SBean sBean;

    @Autowired
    public ABean(SBean sBean) {
        this.sBean = sBean;
    }

}
