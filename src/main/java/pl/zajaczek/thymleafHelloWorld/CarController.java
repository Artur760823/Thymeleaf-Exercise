package pl.zajaczek.thymleafHelloWorld;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String get(Model model){
        Car car = new Car("BMW", "i8");
        Car car1 = new Car("Fiat", "126p");
        Car car2 = new Car("Polonez", "Caro");
        Car car3 = new Car("Citroen", "C2");
        Car car4 = new Car("Peugeot", "308SW");
        Car car5 = new Car("Syrena", "Sport");

        List<Car> cars = Arrays.asList(car, car1, car2, car3, car4, car5);

        model.addAttribute("cars", cars);
        return "car";
    }
}
