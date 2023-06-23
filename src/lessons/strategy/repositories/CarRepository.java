package lessons.strategy.repositories;

import homeworks.hw4.part3.Car;
import lessons.strategy.DBConnection;
import lombok.SneakyThrows;

import java.sql.CallableStatement;
import java.sql.Connection;

public class CarRepository {
    private Connection connection = DBConnection.openConnection().getConnection();

    @SneakyThrows
    public void save(Car car) {
        CallableStatement callableStatement = connection.prepareCall("insert into carsatatat (model,power) values (?,?);");
        callableStatement.setString(1, car.getModel());
        callableStatement.setInt(2, car.getPower());
        callableStatement.executeUpdate();
    }

}
