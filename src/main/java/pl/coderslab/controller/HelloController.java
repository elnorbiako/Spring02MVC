package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }


    @GetMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String helloPerson(@PathVariable String firstName, @PathVariable String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

    @GetMapping ("/helloview")
    public String helloView(){
        return "helloViewResolver";

    }
}

