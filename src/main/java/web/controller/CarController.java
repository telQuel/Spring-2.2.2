package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(Model model) {
        model.addAttribute("cars", carService.getCars());
        return "cars";
    }

    @RequestMapping(value = "/cars", params = {"count"})
    public String getCar(Model model, @RequestParam int count) {
        model.addAttribute("cars", carService.getCar(count));
        return "cars";
    }
}
