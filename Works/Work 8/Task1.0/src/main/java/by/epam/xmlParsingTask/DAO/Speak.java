package by.epam.xmlParsingTask.DAO;

import by.epam.xmlParsingTask.entity.Cactus;
import by.epam.xmlParsingTask.entity.Flower;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Speak {
    public String getFile(){
        System.out.println("Введите путь к файлу"); //src/main/resources/Data/plants.xml"
        Scanner in = new Scanner(System.in);
        String out = in.nextLine();
        return out;
    }

    public int choseAnaliz(){
        System.out.println("Выберите анализатор\n" +
                            "1) Doom\n"+
                            "2) Sax\n" +
                            "3) Stax\n");
        Scanner in = new Scanner(System.in);
        int out = in.nextInt();
        return out;
    }

    public void outFlowers(Set<Flower> flowers){
        Iterator iterator = flowers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public void outCacti(Set<Cactus> cacti){
        Iterator iterator = cacti.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
