package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao{

    public static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mercedes-Benz M-Класс II (W164) 350",2007, 650000.00));
        carList.add(new Car("Hyundai ix35 I Рестайлинг", 2015, 945000));
        carList.add(new Car("Land Rover Range Rover Evoque I 6-speed", 2012, 1490000));
        carList.add(new Car("Peugeot 408 I Рестайлинг",2017, 984000.00));
        carList.add(new Car("Volkswagen Touareg II",2013, 1797000));
    }

    @Override
    public List<Car> getCars(int count) {

        return carList.subList(0, count);
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}
