package cz.cizek.edu.springscope.controller;

import cz.cizek.edu.springscope.bean.ReqBean;
import cz.cizek.edu.springscope.bean.PBean;
import cz.cizek.edu.springscope.bean.SBean;
import cz.cizek.edu.springscope.bean.SessBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@RestController
@RequestMapping("/first")
public class FirstController {

    private final ReqBean reqBean;
    private final SBean sBean;
    private final PBean pBean;
    private final SessBean sessBean;

    @Autowired
    public FirstController(ReqBean reqBean, SBean sBean, PBean pBean, SessBean sessBean) {

        this.sBean = sBean;
        this.pBean = pBean;

        this.reqBean = reqBean;
        this.sessBean = sessBean;

        System.out.println("first controller Created");
    }

    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public ResponseEntity<String> req1() {

//        System.out.println("pBean" + pBean.toString());
//        System.out.println("sBean" + sBean.toString());
        System.out.println("reqBean" + reqBean.toString());
        System.out.println("sessBean" + sessBean.toString());


        return ResponseEntity.ok("ahoj");
    }
}
