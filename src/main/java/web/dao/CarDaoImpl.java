package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CarDaoImpl implements CarDao{
    private static final List<Car> getListCar = new ArrayList<>();

    static {
        getListCar.add(new Car("BMW", "Black", "2005"));
        getListCar.add(new Car("Audi", "Black", "1999"));
        getListCar.add(new Car("Ford", "Black", "2022"));
        getListCar.add(new Car("Genesis", "White", "2016"));
        getListCar.add(new Car("Honda", "White", "2019"));
    }

    @Override
    public List<Car> getListCar(int count) {
        if (count == 0) {
            return getListCar;
        }
        return getListCar.stream().limit(count).collect(Collectors.toList());
    }
}