package by.epamtraning.autoshop.DAO.userDB;

import by.epamtraning.autoshop.DAO.ConnectorDB;
import by.epamtraning.autoshop.entity.jb.UserInfo;
import by.epamtraning.autoshop.exception.DAOException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindUserInfoById {
    private UserInfo userInfo;

    public void init(int id) throws DAOException {
        Connection connection = null;
        try {
            connection = ConnectorDB.getConnection();
            //DAOLogger.info("connection opened");
            Statement statement = null;
            try {
                statement = connection.createStatement();
                use(id, statement);
            }finally {
                if (statement != null)
                    statement.close();
            }
        } catch (DAOException | SQLException e) {
            throw new DAOException(e + "DAO, connection exception");
        }
        finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new DAOException(e + "DAO, connection try close exception");
                }
                //DAOLogger.info("connection closed");
            }
        }
    }

    public void use(int id, Statement statement) throws DAOException {
        String sqlCommandTakeUserInfo = "select * from userinfo where Id = '" + id + "';";
        try {
            ResultSet resultSetInfo = statement.executeQuery(sqlCommandTakeUserInfo);
            if (resultSetInfo.next()) {
                String DBName = resultSetInfo.getString("Name");
                String DBSurName = resultSetInfo.getString("SurName");
                int DBage = resultSetInfo.getInt("Age");
                String DBcity = resultSetInfo.getString("City");
                userInfo = new UserInfo(id, DBName, DBSurName, DBage, DBcity);
                System.out.println(userInfo.toString());
            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }


}
