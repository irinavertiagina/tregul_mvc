package com.irina.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author irkin
 **/
@Controller
public class myController {

    @RequestMapping("/")
    public String showFirstView(){
        return "firstView";
    }

    @RequestMapping("/askDetail")
    public String askDetails(){
        return "askDetails";
    }

    @RequestMapping("/showDetail")
    public String showDetails(){
        return "showDetails";
    }

}
