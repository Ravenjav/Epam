package by.epam.xmlParsingTask.sirvice.parsers;

import by.epam.xmlParsingTask.DAO.Speak;
import by.epam.xmlParsingTask.entity.Cactus;
import by.epam.xmlParsingTask.entity.Flower;
import by.epam.xmlParsingTask.sirvice.parsers.doom.CactusDoomBuilder;
import by.epam.xmlParsingTask.sirvice.parsers.doom.FlowerDoomBuilder;

import java.util.Set;

public class UseDoom {
    public void useDoom(String fileName, Speak speak){
        FlowerDoomBuilder flDoomBuilder = new FlowerDoomBuilder();
        flDoomBuilder.buildSetFlowers(fileName);
        Set<Flower> flowers = flDoomBuilder.getFlowers();
        speak.outFlowers(flowers);
        CactusDoomBuilder caDoomBuilder = new CactusDoomBuilder();
        caDoomBuilder.buildSetCactus(fileName);
        Set<Cactus> cacti = caDoomBuilder.getCacti();
        speak.outCacti(cacti);
    }
}
