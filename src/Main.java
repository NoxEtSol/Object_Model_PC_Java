import model.Card;
import model.Memory;
import model.Pc;
import model.Procesor;
import model.enums.CardType;
import model.services.Configurator;
import model.exceptions.NotEnoughSpaceForMemoryModulesException;
import model.exceptions.NotEvenNumberOfMemoryCardsInsertedException;
import model.exceptions.NotTheSameCardTypeException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NotEnoughSpaceForMemoryModulesException, NotEvenNumberOfMemoryCardsInsertedException, NotTheSameCardTypeException {
        Pc pc = new Pc(2);
        Configurator configurator = new Configurator();

        List<Memory> memories = new ArrayList<Memory>();
        Memory memory = new Memory("1024Mb", "3.5GHz");
        Memory memory2 = new Memory("1024Mb", "3.5GHz");

        Procesor procesor = new Procesor("AMD", "3.5GHz");

        Card card = new Card(CardType.GRAPHICS_CARD);
        Card card2 = new Card(CardType.NETWORK_CARD);
        Card card3 = new Card(CardType.SOUND_CARD);

        memories.add(memory);
        memories.add(memory2);

        configurator.insertMemory(pc, memory, memory2);
        configurator.insertProcesor(pc, procesor);
        configurator.insertCards(pc, card);
        configurator.insertCards(pc, card2);
        configurator.insertCards(pc, card3);


        System.out.println(pc);
    }

}