package main.java.springmvc.controller;

import javax.xml.ws.RequestWrapper;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public  String  show(){
        return "hello";
    }
}
