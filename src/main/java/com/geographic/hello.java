package com.geographic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhoudachao on 2018/7/22.
 */

@RestController
public class hello {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){

        return "hello Springboot!";
    }
}
