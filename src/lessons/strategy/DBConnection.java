package lessons.strategy;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@Getter
@Setter
public class DBConnection {

    private static DBConnection dbConnection = new DBConnection("jdbc:mysql://localhost:3306/startegylesson", "root", "rootroot");
    private Connection connection;

    @SneakyThrows
    private DBConnection(String url, String username, String password) {
        this.connection = DriverManager.getConnection(url, username, password);
    }

    public static DBConnection openConnection() {
        return dbConnection;
    }

    @SneakyThrows
    public void closeConnection() {
        this.connection.close();
    }


}
