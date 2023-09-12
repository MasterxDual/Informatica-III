package Practico3.exceptions;

public class StackIsFullException extends StackException {
    public StackIsFullException(int size) {
        super("Stack of size " + size + " is full");
    }
}
