package model.services;

import model.Card;
import model.Memory;
import model.Pc;
import model.Procesor;
import model.vynimky.NotEnoughSpaceForMemoryModulesException;
import model.vynimky.NotEvenNumberOfMemoryCardsInsertedException;
import model.vynimky.NotTheSameCardTypeException;

public interface ConfiguratorService {

    void insertMemory(Pc pc, Memory... memory) throws NotEnoughSpaceForMemoryModulesException, NotEvenNumberOfMemoryCardsInsertedException, NotTheSameCardTypeException;

    void insertProcesor(Pc pc, Procesor procesor);

    void insertCards(Pc pc, Card card);
}
