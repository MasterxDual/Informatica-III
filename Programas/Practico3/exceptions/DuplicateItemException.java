package Practico3.exceptions;

public class DuplicateItemException extends BinarySearchTreeException {
    public DuplicateItemException(double value) {
        super("Duplicate element of value: " + value + ". There are two equals nodes. It can't be inserted to the search binary tree.");
    }
}
