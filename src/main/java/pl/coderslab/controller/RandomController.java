package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {



    @GetMapping("/random/")
    @ResponseBody
    public String showRandom(){
        Random r = new Random();
        int a = r.nextInt(100)+1;
        String stringRand = "Random number: "  + a;
        return stringRand;
    }

    @GetMapping("/random/{max}")
    @ResponseBody
    public String random(@PathVariable int max) {
        Random r = new Random();
        int a = r.nextInt(max);
        String stringRand = "You choose: " + max + " Random number: " + a;
        return stringRand;
    }


    @GetMapping("/random/{min}/{max}")
    @ResponseBody
    public String randomMinMax(@PathVariable int min, @PathVariable int max) {
        Random r = new Random();
        int a = r.nextInt(max-min)+ min;
        String stringRand = "You choose: " +min +" and " + max + " Random number: " + a;
        return stringRand;
    }

}
