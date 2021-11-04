package by.epamtraning.autoshop.action;

import by.epamtraning.autoshop.action.factories.*;
import by.epamtraning.autoshop.exception.ActionException;
import by.epamtraning.autoshop.textmaneger.TextManager;

import java.util.HashMap;
import java.util.Map;

public class ActionProvider {
    private final static ActionProvider actionProvider = new ActionProvider();
    private final Map<String, ActionFactory> repository = new HashMap<>();

    private ActionProvider(){
        repository.put(PathNames.Start.getName(), new StartActionFactory());
        repository.put(PathNames.Login.getName(), new LoginActionFactory());
        repository.put(PathNames.TryLogin.getName(), new TryLoginActionFactory());
        repository.put(PathNames.Registration.getName(), new RegistrationActionFactory());
        repository.put(PathNames.Error.getName(), new ErrorActionFactory());
        repository.put(PathNames.En.getName(), new EnActionFactory());
        repository.put(PathNames.Ru.getName(), new RuActionFactory());
    }

    public Action getAction(String path) throws ActionException{
        TextManager textManager = TextManager.getInstance();
        PathNames pathNames = null;
        Action action = null;
        try {
            if (repository.containsKey(path)){
                ActionFactory actionFactory = repository.get(path);
                action = actionFactory.createAction();
                return action;
            }
            else {
                throw new ActionException("Action Provider Ex, path not found");
            }
        }catch(IllegalArgumentException | NullPointerException e){
            throw new ActionException(e + textManager.getString(e + "Action Provider Ex, action repository exception"));
        }
    }

    public static ActionProvider getInstance(){
        return actionProvider;
    }
}
