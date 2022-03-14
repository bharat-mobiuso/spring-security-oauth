package io.javabrains.springsecurityoauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/restricted")
    public String restricted(){
        return "Now you are logged in to see this restricted page";
    }

}
