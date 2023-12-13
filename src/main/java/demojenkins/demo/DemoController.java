package demojenkins.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/about")
    public String about(){
        return "Hello world123";
    }
    @GetMapping(value = "/contact")
    public String contact(){
        return "Hello you";
    }

}
