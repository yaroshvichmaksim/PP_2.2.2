package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServise {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, 2001, "bmw"));
        cars.add(new Car(2, 2002, "audi"));
        cars.add(new Car(3, 2003, "mersedes"));
        cars.add(new Car(4, 2004, "volkswagen"));
        cars.add(new Car(5, 2005, "renault"));

    }

    public List<Car> getCars(int count) {

        return cars.subList(0, count);
    }

    public List<Car> getCars() {

        return cars;
    }

}
