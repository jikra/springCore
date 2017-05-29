package cz.cizek.edu.springscope.controller;

import cz.cizek.edu.springscope.bean.ReqBean;
import cz.cizek.edu.springscope.bean.PBean;
import cz.cizek.edu.springscope.bean.SBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@RestController
@RequestMapping("/second")
public class SecondController {

    private final ReqBean reqBean;
    private final SBean sBean;
    private final PBean pBean;

    @Autowired
    public SecondController(ReqBean reqBean, SBean sBean, PBean pBean) {

        this.sBean = sBean;
        this.pBean = pBean;

        this.reqBean = reqBean;

        System.out.println("second controller Created");
    }

    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public ResponseEntity<String> req1() {
        System.out.println("request 1");
//        reqBean.sout();

        System.out.println(pBean.toString());

        return ResponseEntity.ok("ahoj");
    }
}
