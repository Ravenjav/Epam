package by.epamtraning.autoshop.controller;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.action.ActionProvider;
import by.epamtraning.autoshop.action.PathNames;
import by.epamtraning.autoshop.exception.ActionException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class DispatcherServlet extends HttpServlet {
    //private static final Logger ServletLogger = Logger.getLogger(DispatcherServlet.class.getName());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //ServletLogger.info("new request ");
        Action action = null;
        try {
            action = ActionProvider.getInstance().getAction(request.getRequestURL().toString());
        }catch (ActionException e){
            response.sendRedirect(PathNames.Error.getName());
        }
        action.setRequest(request);
        action.setResponse(response);
        try {
            action.use();
        } catch (ActionException e) {
            e.printStackTrace();
        }
        if (!action.getForward().isRedirect()) {
            getServletContext().getRequestDispatcher(action.getForward().getNewPath()).forward(request, response);
        }
        else{
            response.sendRedirect(action.getForward().getNewPath());
        }
    }
}
