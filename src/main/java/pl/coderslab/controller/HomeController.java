package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;


@Controller
public class HomeController {

    @RequestMapping("/home")
    private String passColor (Model model){

            LocalDateTime localDateTime = LocalDateTime.now();
            int hour = localDateTime.getHour();

            if ((hour >= 8) && (hour <= 20)) {
                model.addAttribute("color", "black");
                model.addAttribute("backgroundColor", "white");
                return "home";
            } else {
                model.addAttribute("color", "white");
                model.addAttribute("backgroundColor", "black");
                return "home";

            }
        }
}




