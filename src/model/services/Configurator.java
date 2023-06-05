package model.services;

import model.Card;
import model.Memory;
import model.Pc;
import model.Procesor;
import model.utils.PcUtil;
import model.exceptions.NotEnoughSpaceForMemoryModulesException;
import model.exceptions.NotEvenNumberOfMemoryCardsInsertedException;
import model.exceptions.NotTheSameCardTypeException;

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
