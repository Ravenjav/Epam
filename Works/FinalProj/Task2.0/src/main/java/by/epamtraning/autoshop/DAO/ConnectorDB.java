package by.epamtraning.autoshop.DAO;

import by.epamtraning.autoshop.exception.DAOException;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectorDB {
    public static Connection getConnection() throws  DAOException{
        ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
        String url = resourceBundle.getString("db.url");
        String user = resourceBundle.getString("db.user");
        String pass = resourceBundle.getString("db.password");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException | ClassNotFoundException | InvocationTargetException | NoSuchMethodException |
                InstantiationException | IllegalAccessException e){
            throw new DAOException(e + "DAO, connection exception");
        }
    }
}
