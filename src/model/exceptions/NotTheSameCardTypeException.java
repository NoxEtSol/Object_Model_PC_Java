package model.exceptions;

public class NotTheSameCardTypeException extends Exception{
    public NotTheSameCardTypeException() {
        super("You are trying to insert different Cards at the same time");
    }
}
