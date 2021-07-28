package web;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDaoImpl;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

public class Test {

    @Autowired
    static CarServiceImpl carService;

    public static void main(String[] args) {

        List<Car> cars = carService.getCars(3);
        System.out.println(cars.get(1));
    }
}
