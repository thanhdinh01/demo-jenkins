package demojenkins.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/about")
    public String contact(){
        return "Hello world1";
    }
}
