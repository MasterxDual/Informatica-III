package Practico3.exceptions;

public class QueueIsEmptyException extends QueueException {
    public QueueIsEmptyException() {
        super("Queue is empty.");
    }
}
