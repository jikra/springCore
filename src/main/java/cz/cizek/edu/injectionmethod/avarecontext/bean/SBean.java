package cz.cizek.edu.injectionmethod.avarecontext.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
public class SBean
                implements ApplicationContextAware
{

    private ApplicationContext applicationContext;
    private PBean pBean;

//    injection by aware context
        public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.applicationContext = applicationContext;
        }

        private PBean getPBean() {
            return this.applicationContext.getBean(PBean.class);
        }

    // standart -- ale prototype se vytvori hned a jen jednou
//    @Autowired
//    public SBean(PBean pBean) {
//        this.pBean = pBean;
//        System.out.println("SBean created");
//    }
//
//    private PBean getPBean() {
//        return this.pBean;
//    }

    public void doSomething() {
        getPBean().doSomething();
    }
}
