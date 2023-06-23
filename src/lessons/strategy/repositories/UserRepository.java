package lessons.strategy.repositories;

import lessons.lesson6_some.reflction.User;
import lessons.strategy.DBConnection;
import lombok.SneakyThrows;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserRepository /*DAO*/ {
    // crud

    private Connection connection = DBConnection.openConnection().getConnection();

    // create
    @SneakyThrows
    public void save(User user) {
        CallableStatement callableStatement = this.connection.prepareCall("insert into user(name) values(?)");
        callableStatement.setString(1, user.getName());
        callableStatement.executeUpdate();
    }

    // read
    @SneakyThrows
    public List<User> read() {
        List<User> users = new ArrayList<>();
        CallableStatement callableStatement = this.connection.prepareCall("select  * from user");
        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()) {
            users.add(new User(resultSet.getInt("id"), resultSet.getString("name")));
        }

        return users;
    }

}
