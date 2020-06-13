package Teles.Daniel.ExercicioSpringboosLombok.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloWordController {


    @GetMapping("/")
    public String index() {
        return "Página inicial";
    }
}
