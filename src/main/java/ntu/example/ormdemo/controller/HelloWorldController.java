package ntu.example.ormdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping(path = "/")
    public @ResponseBody String returnHelloWorld() {
        return "Hello World";
    }
}
