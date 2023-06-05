package model.services;

import model.Card;
import model.Memory;
import model.Pc;
import model.Procesor;
import model.exceptions.NotEnoughSpaceForMemoryModulesException;
import model.exceptions.NotEvenNumberOfMemoryCardsInsertedException;
import model.exceptions.NotTheSameCardTypeException;

public interface ConfiguratorService {

    void insertMemory(Pc pc, Memory... memory) throws NotEnoughSpaceForMemoryModulesException, NotEvenNumberOfMemoryCardsInsertedException, NotTheSameCardTypeException;

    void insertProcesor(Pc pc, Procesor procesor);

    void insertCards(Pc pc, Card card);
}
