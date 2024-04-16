package web.Service;

import web.model.Car;

import java.util.List;

public class CarServise {
    public static List<Car> getCars(List<Car> cars, int count) {
        return cars.subList(0, count);
    }
}
