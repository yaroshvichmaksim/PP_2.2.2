package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServise;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(required = false, defaultValue = "-1") int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, 2001, "bmw"));
        cars.add(new Car(2, 2002, "audi"));
        cars.add(new Car(3, 2003, "mersedes"));
        cars.add(new Car(4, 2004, "volkswagen"));
        cars.add(new Car(5, 2005, "renault"));
        List<Car> carCount = null;
        if (count == -1) {
            carCount = cars;
        } else if (count >= 5) {
            carCount = cars;
        } else {
            carCount = CarServise.getCars(cars, count);
        }
        model.addAttribute("cars", carCount);
        return "cars";
    }
}
