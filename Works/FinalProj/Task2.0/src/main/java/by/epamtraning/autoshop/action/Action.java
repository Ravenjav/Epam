package by.epamtraning.autoshop.action;

import by.epamtraning.autoshop.exception.ActionException;
import by.epamtraning.autoshop.textmaneger.TextManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public abstract class Action{
    //private UserTipe user;
    private Forward forward;
    private TextManager textManager;
    private HttpServletRequest request;
    private HttpServletResponse response;

    public Action() {
        textManager = TextManager.getInstance();
    }

    public class Forward{
        private String newPath;
        private boolean redirect;
        private Map<String, Object> attributes = new HashMap<>();

        public Forward(String newPath, boolean redirect) {
            this.newPath = newPath;
            this.redirect = redirect;
            this.attributes = new HashMap<>();
        }

        public String getNewPath() {
            return newPath;
        }

        public void setNewPath(String forward) {
            this.newPath = forward;
        }

        public boolean isRedirect() {
            return redirect;
        }

        public void setRedirect(boolean redirect) {
            this.redirect = redirect;
        }

        public Map<String, Object> getAttributes() {
            return attributes;
        }

        public void setAttributes(Map<String, Object> attributes) {
            this.attributes = attributes;
        }

        public void addAttribute(String name, Object object){
            this.attributes.put(name, object);
        }
    }

    public Forward getForward() {
        return forward;
    }

    public void setForward(Forward forward) {
        this.forward = forward;
    }

    public TextManager getTextManager(){
        return textManager;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public abstract void use() throws ActionException;
}
