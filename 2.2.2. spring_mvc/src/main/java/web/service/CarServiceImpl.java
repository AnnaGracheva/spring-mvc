package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> carAmount(int count, List<Car> cars) {
        List<Car> carList = new ArrayList<>();
        if (count > cars.size()) {
            return cars;
        }
        for (int i = 0; i < count;) {
            for(Car car : cars) {
                if(i < count) {
                    carList.add(car);
                    i++;
                }
            }
        }
        return carList;
    }
}
