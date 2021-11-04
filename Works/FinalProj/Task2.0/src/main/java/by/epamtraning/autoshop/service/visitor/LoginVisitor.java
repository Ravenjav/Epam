package by.epamtraning.autoshop.service.visitor;

import by.epamtraning.autoshop.DAO.userDB.FindUserByLogin;
import by.epamtraning.autoshop.DAO.userDB.FindUserInfoById;
import by.epamtraning.autoshop.entity.jb.User;
import by.epamtraning.autoshop.entity.jb.UserInfo;
import by.epamtraning.autoshop.exception.DAOException;
import by.epamtraning.autoshop.exception.ServiceException;

public class LoginVisitor {
    private int flag;
    private User user;
    private UserInfo userInfo;

    public LoginVisitor(){
        flag = 0;
        user = null;
        userInfo = null;
    }

    public void use(String login, String password) throws ServiceException {
        FindUserByLogin findUserByLogin = new FindUserByLogin();
        try {
            findUserByLogin.init(login);
        }catch (DAOException e){
            throw new ServiceException("Service exception" + e);
        }
        if (findUserByLogin.getUser() == null){
            flag = 1;
        }
        else {
            if (!findUserByLogin.getUser().getPassword().equals(password))
                flag = 2;
            else{
                FindUserInfoById findUserInfoById = new FindUserInfoById();
                try {
                    findUserInfoById.init(user.getId());
                }catch (DAOException e){
                    throw new ServiceException("Service exception" + e);
                }
            }
        }
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
