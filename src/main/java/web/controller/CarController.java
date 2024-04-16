package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServise;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    private final CarServise carServise;

    @Autowired
    public CarController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(required = false, defaultValue = "-1") int count) {


        List<Car> carCount = null;
        if (count == -1 || count >= 5) {
            carCount = carServise.getCars();
        } else {
            carCount = carServise.getCars(count);
        }
        model.addAttribute("cars", carCount);
        return "cars";
    }
}
