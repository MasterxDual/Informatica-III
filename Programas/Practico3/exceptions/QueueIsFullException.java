package Practico3.exceptions;

public class QueueIsFullException extends QueueException {
    public QueueIsFullException(int size) {
        super("Queue of size " + size + " is full.");
    }

}
