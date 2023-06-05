package model.services;

import model.Card;
import model.Memory;
import model.Pc;
import model.Procesor;
import model.utils.PcUtil;
import model.vynimky.NotEnoughSpaceForMemoryModulesException;
import model.vynimky.NotEvenNumberOfMemoryCardsInsertedException;
import model.vynimky.NotTheSameCardTypeException;

import java.util.Arrays;

public class Configurator implements ConfiguratorService {
    @Override
    public void insertMemory(Pc pc, Memory... memories) throws NotEnoughSpaceForMemoryModulesException, NotEvenNumberOfMemoryCardsInsertedException, NotTheSameCardTypeException {
        PcUtil.checkInsertionPossibility(pc, memories);
        pc.setMemories(Arrays.asList(memories));
    }

    @Override
    public void insertProcesor(Pc pc, Procesor procesor) {
        pc.setProcesor(procesor);
    }

    @Override
    public void insertCards(Pc pc, Card card) {
        pc.getCards().add(card);
    }

}
