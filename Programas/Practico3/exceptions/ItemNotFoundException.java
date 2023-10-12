package Practico3.exceptions;

public class ItemNotFoundException extends BinarySearchTreeException  {
    public ItemNotFoundException() {
        super("Item not found, consider using other root node");
    }
}
