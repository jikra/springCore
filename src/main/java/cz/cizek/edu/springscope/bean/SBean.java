package cz.cizek.edu.springscope.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class SBean implements ObjectFactory<SBean> {

    public SBean() {
        System.out.println("singleton bean 'SBean' was created");
    }

    public SBean getObject() throws BeansException {
        System.out.println("singleton bean 'SBean' was created by getObject");
        return new SBean();
    }
}
