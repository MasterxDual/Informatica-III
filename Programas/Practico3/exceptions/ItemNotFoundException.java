package Practico3.exceptions;

public class ItemNotFoundException extends BinarySearchTreeException  {
    public ItemNotFoundException() {
        super("Item not found, consider using other root node");
    }
    public ItemNotFoundException(String x) {
        super(x + " was not found in the tree. Try again.");
    }
}
