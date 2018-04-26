package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(){

    return "form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String saveForm(@RequestParam ("paramName") String paramName ){

        return " You param: " + paramName;
    }
}

