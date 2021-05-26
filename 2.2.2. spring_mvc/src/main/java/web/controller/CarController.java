package web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping()
    public String createCars(@RequestParam(required = false, defaultValue = "5") String count, ModelMap model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 3, "sedan"));
        cars.add(new Car("Bentley Continental", 51, "coupe"));
        cars.add(new Car("Honda Accord", 1, "sedan"));
        cars.add(new Car("Tesla Model X", 1, "SUV"));
        cars.add(new Car("Audi A6", 4, "sedan"));

        model.addAttribute("Cars", carService.carAmount(Integer.parseInt(count), cars));
        return "cars";
    }


}
