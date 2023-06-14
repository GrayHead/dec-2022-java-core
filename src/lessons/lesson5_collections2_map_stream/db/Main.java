package lessons.lesson5_collections2_map_stream.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Connection connection
                = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/world", "root", "rootroot");


        CallableStatement callableStatement = connection.prepareCall("select  * from city where id > ? and name like ?");
        callableStatement.setInt(1, 20);
        callableStatement.setString(2, "Leiden");
        ResultSet resultSet = callableStatement.executeQuery();
        List<City> cityList = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);// id
            String name = resultSet.getString("Name");
            cityList.add(new City(id, name));

        }
        System.out.println(cityList);

        connection.close();


    }
}

@Data
@AllArgsConstructor
class City {
    private int id;
    private String cityName;
}
