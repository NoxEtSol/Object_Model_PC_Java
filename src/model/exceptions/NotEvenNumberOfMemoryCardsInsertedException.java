package model.exceptions;

public class NotEvenNumberOfMemoryCardsInsertedException extends Exception{
    public NotEvenNumberOfMemoryCardsInsertedException() {
        super("If there is more than one Memory card, you can insert only odd numbers of Memory cards.");
    }
}
