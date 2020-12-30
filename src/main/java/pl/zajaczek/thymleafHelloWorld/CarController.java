package pl.zajaczek.thymleafHelloWorld;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private List<Car> cars;//creating list

    //fill the List in Constructor
    public CarController() {
        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Fiat", "126p");
        Car car3 = new Car("Polonez", "Caro");
        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

    }

    @GetMapping("/car")
    public String get(Model model) {
        model.addAttribute("cars", cars);
        model.addAttribute("newCar", new Car());//empty element to fill from html
        return "car";
    }

    @PostMapping("/add-car") //adding elements from web
    public String addCar(@ModelAttribute Car car){
        cars.add(car);//adding new element on web
        return "redirect:/car";//transfer to get mapping
    }
}
