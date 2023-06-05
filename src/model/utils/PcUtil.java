package model.utils;

import model.Memory;
import model.Pc;
import model.vynimky.NotEnoughSpaceForMemoryModulesException;
import model.vynimky.NotEvenNumberOfMemoryCardsInsertedException;
import model.vynimky.NotTheSameCardTypeException;

public class PcUtil {

    public static void checkInsertionPossibility(Pc pc, Memory[] memories) throws NotEnoughSpaceForMemoryModulesException, NotEvenNumberOfMemoryCardsInsertedException, NotTheSameCardTypeException {
        int numberOfMemoryModules = memories.length;

        if (pc.getNumberOfMemoryModules() < numberOfMemoryModules) {
            throw new NotEnoughSpaceForMemoryModulesException();
        }

        if (numberOfMemoryModules > 1) {
            if (numberOfMemoryModules % 2 != 0) {
                throw new NotEvenNumberOfMemoryCardsInsertedException();
            }
        }

        String memorySize = null;

        for (Memory memory : memories) {
            if (memorySize == null) {
                memorySize = memory.getSize();
            } else {
                if (!memorySize.equals(memory.getSize())) {
                    throw new NotTheSameCardTypeException();
                }
            }
        }
    }
}
