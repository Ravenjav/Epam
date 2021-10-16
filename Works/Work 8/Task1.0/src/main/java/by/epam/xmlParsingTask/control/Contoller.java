package by.epam.xmlParsingTask.control;

import by.epam.xmlParsingTask.DAO.Speak;
import by.epam.xmlParsingTask.entity.Cactus;
import by.epam.xmlParsingTask.entity.Flower;
import by.epam.xmlParsingTask.sirvice.parsers.UseDoom;
import by.epam.xmlParsingTask.sirvice.parsers.UseSax;
import by.epam.xmlParsingTask.sirvice.parsers.doom.CactusDoomBuilder;
import by.epam.xmlParsingTask.sirvice.parsers.doom.FlowerDoomBuilder;

import java.io.File;
import java.util.Set;

public class Contoller {
    public void control(){
        Speak speak = new Speak();
        String fileName = speak.getFile();
        File file = new File(fileName);
        if (!file.exists()){
            System.out.println("Wrong path");
            return;
        }
        int analiz = speak.choseAnaliz();
        switch (analiz){
            case (1):{
               new UseDoom().useDoom(fileName, speak);
            }
        }
    }
}
