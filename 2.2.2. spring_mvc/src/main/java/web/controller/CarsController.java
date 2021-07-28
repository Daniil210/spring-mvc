package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.model.Car;
import web.service.CarServiceImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @Autowired
    CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, Model model) {
        if (count < 0){
            count = 0;
        }

        model.addAttribute("carList", count > 5 ? carService.getAllCars() : carService.getCars(count));
        return "cars";
    }
}
