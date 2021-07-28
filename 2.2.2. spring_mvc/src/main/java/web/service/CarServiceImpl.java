package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
}
