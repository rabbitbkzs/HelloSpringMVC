package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping("/hello")
    public String show(){
        return "hello";
    }
}
