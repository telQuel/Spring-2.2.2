package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2010,"Model1", 140));
        cars.add(new Car(2017, "Model2", 100));
        cars.add(new Car(2013, "Model3", 250));
        cars.add(new Car(2016, "Model4", 160));
        cars.add(new Car(2006, "Model5", 170));
        model.addAttribute("cars", cars);
        return "cars";
    }

    @RequestMapping(value = "/cars", params = {"count"})
    public String getCar(Model model, @RequestParam int count) {
        model.addAttribute("cars", carService.getCar(count));
        return "cars";
    }
}
