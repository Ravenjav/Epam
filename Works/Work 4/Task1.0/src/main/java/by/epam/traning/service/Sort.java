package by.epam.traning.service;

import by.epam.traning.entity.VouchersStore;

public class Sort {
    public VouchersStore sort(VouchersStore mas, int key){
        switch (key){
            case (1):{
                for (int i = 0; i < mas.size(); i++){
                    for (int j = 1; j < mas.size(); j++){
                        if (mas.get(j).getType() < mas.get(j - 1).getType())
                            mas.swap(j, j - 1);
                    }
                }
                break;
            }
            case (2):{
                for (int i = 0; i < mas.size(); i++){
                    for (int j = 1; j < mas.size(); j++){
                        if (mas.get(j).getTransport() < mas.get(j - 1).getTransport())
                            mas.swap(j, j - 1);
                    }
                }
                break;
            }
            case (3):{
                for (int i = 0; i < mas.size(); i++){
                    for (int j = 1; j < mas.size(); j++){
                        if (mas.get(j).getEating() < mas.get(j - 1).getEating())
                            mas.swap(j, j - 1);
                    }
                }
                break;
            }
            case (4):   {
                for (int i = 0; i < mas.size(); i++){
                    for (int j = 1; j < mas.size(); j++){
                        if (mas.get(j).getDays() < mas.get(j - 1).getDays())
                            mas.swap(j, j - 1);
                    }
                }
                break;
            }
        }
        return mas;
    }
}
