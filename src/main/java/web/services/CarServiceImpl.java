package web.services;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCar(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2010,"Model1", 140));
        cars.add(new Car(2017, "Model2", 100));
        cars.add(new Car(2013, "Model3", 250));
        cars.add(new Car(2016, "Model4", 160));
        cars.add(new Car(2006, "Model5", 170));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
