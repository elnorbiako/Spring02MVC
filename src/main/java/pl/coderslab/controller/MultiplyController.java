package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MultiplyController {

    @GetMapping("/multiply{size}")
    public String multiplyTable(Model model,@PathVariable("size") int size){

        model.addAttribute(size);

        return "multiply";
    }
}
