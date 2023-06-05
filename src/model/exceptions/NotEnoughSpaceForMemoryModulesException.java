package model.exceptions;

public class NotEnoughSpaceForMemoryModulesException extends Exception{

    public NotEnoughSpaceForMemoryModulesException(){
        super("You are trying to insert more modules into the PC than is permitted");
    }
}
