package by.epamtraning.autoshop.action.visitor;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.exception.ActionException;
import by.epamtraning.autoshop.exception.ServiceException;
import by.epamtraning.autoshop.service.visitor.LoginVisitor;

public class TryLogin extends Action {

    public TryLogin() {
        super();
    }

    public void use() throws ActionException {
        this.setForward(new Forward("/Task2_0_war_exploded/shop.html", true));
        String login = getRequest().getParameter("login");
        String password = getRequest().getParameter("password");
        if (login != "" && password != "") {
            LoginVisitor service = new LoginVisitor();
            try {
                service.use(login, password);
            } catch (ServiceException e) {
                throw new ActionException("Action exception" + e);
            }
            int flag = service.getFlag();
            switch (flag) {
                case (0): {

                }
                case (1): {
                    this.getForward().setNewPath("/Task2_0_war_exploded/login.html");
                    this.getRequest().getSession().setAttribute("exc", getTextManager().getString("TryLogin.LoginNotExist"));
                    break;
                }
                case (2): {
                    this.getForward().setNewPath("/Task2_0_war_exploded/login.html");
                    this.getRequest().getSession().setAttribute("exc", getTextManager().getString("TryLogin.WrongPassword"));
                    break;
                }
                default: {
                    this.getRequest().getSession().setAttribute("role", service.getUser().getAccess());
                    this.getRequest().getSession().setAttribute("name", service.getUserInfo().getName());
                    this.getRequest().getSession().setAttribute("city", service.getUserInfo().getCity());
                }
            }
        }
        else{
            this.getForward().setNewPath("/Task2_0_war_exploded/login.html");
            this.getRequest().getSession().setAttribute("exc", getTextManager().getString("TryLogin.EmptyLoginOrPassword"));
        }
    }
}
