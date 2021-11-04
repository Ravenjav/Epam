package by.epamtraning.autoshop.DAO.userDB;

import by.epamtraning.autoshop.DAO.ConnectorDB;
import by.epamtraning.autoshop.entity.jb.User;
import by.epamtraning.autoshop.exception.DAOException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindUserByLogin{
    //private static final Logger DAOLogger = Logger.getLogger(FindByLogin.class.getName());
    private User user;

    public FindUserByLogin(){
        user = null;
    }

    public void init(String login) throws DAOException {
        Connection connection = null;
        try {
            connection = ConnectorDB.getConnection();
            //DAOLogger.info("connection opened");
            Statement statement = null;
            try {
                statement = connection.createStatement();
                use(login, statement);
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

    public void use(String login, Statement statement) throws DAOException {
        String sqlCommandTakeUser = "select * from user where Login = '" + login + "';";
        int id = 0;
        try {
            ResultSet resultSet = statement.executeQuery(sqlCommandTakeUser);
            if (resultSet.next()){
                id = resultSet.getInt("Id");
                String DBLogin = resultSet.getString("Login");
                String DBpassword = resultSet.getString("Password");
                int access = resultSet.getInt("Access");
                user = new User(id, DBLogin, DBpassword, access);
            }
            else{
                return;
            }
        }catch (SQLException e){
            throw new DAOException(e);
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
