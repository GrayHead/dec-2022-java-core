package lessons.strategy.services.car;

import homeworks.hw4.part3.Car;
import lessons.strategy.repositories.CarRepository;

public class ICarServiceOne implements CarService {
    private CarRepository carRepository;

    @Override
    public void save(Car car) {
        //......
        carRepository.save(car);
        //......

    }
}
