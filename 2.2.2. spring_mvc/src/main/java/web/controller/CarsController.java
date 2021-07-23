package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @Autowired
    CarDaoImpl carDao;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if(count == null){
            count = 5;
        }

        model.addAttribute("carList", carDao.getCars(count));

        return "cars";
    }
}
