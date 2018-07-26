package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String msg;

    WelcomeController(@Value("${WELCOME_MESSAGE}") String msg){

    }

    @GetMapping("/")
    public String sayHello() {
        return msg;
    }
}
