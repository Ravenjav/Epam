package by.epamtraning.autoshop.action;

public enum PathNames {
    Start("http://localhost:8080/Task2_0_war_exploded/"),
    Login ("http://localhost:8080/Task2_0_war_exploded/login.html"),
    TryLogin("http://localhost:8080/Task2_0_war_exploded/tryLogin.html"),
    Registration("http://localhost:8080/Task2_0_war_exploded/registration.html"),
    Error("http://localhost:8080/Task2_0_war_exploded/error.html"),
    En("http://localhost:8080/Task2_0_war_exploded/languageEn.html"),
    Ru("http://localhost:8080/Task2_0_war_exploded/languageRu.html");
    private String name;

    private PathNames(String name){
        this.name =name;
    }

    public String getName(){
        return name;
    }
}
