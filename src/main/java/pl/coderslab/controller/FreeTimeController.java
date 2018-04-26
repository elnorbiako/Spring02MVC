package pl.coderslab.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class FreeTimeController {

    @GetMapping("/freetime")
    @ResponseBody
    public String freeTime (){

      LocalDateTime localDateTime = LocalDateTime.now();

        // other date than today

       // String str = "2018-04-29 18:30";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime localDateTime = LocalDateTime.parse(str, formatter);
        // some minor issues - day is not working!

        String day = localDateTime.getDayOfWeek().toString();
        int hour = localDateTime.getHour();

        String doing;
        if ((day.equals("SATURDAY")) || (day.equals("SUNDAY"))) {
            doing = "Free time";
        }
        else if ((hour >=9) && (hour<=17)){
            doing = "Working, don't call";
        } else {
            doing = "After work";
        }

        return "What I'm doing : " + doing;
    }
}


/*
    Utwórz kontroler o nazwie FreeTimeController.
    Pobierz aktualną datę.
    Sprawdź aktualny dzień tygodnia oraz aktualną godzinę.
    Jeśli dzień przypada na sobotę lub niedzielę, zwróć tekst Wolne.

    Jeśli dzień przypada na dzień roboczy, a godzina od 9 do 17, zwróć tekst Pracuje, nie dzwoń..
    Jeśli dzień przypada na dzień roboczy, a godzina poza zakresem 9-17 zwróć tekst Po Pracy.

    Aby przetestować działanie aplikacji, możesz zamiast aktualnej daty, pobrać wybraną przez siebie datę i godzinę.

 */