package Practico3.utils;

public class RedBlackTree<T extends Comparable<T>> {
    private Class<T> type;
    RedBlackNode<T> root;
    RedBlackNode<T> nil; //Null node for representing leaf nodes.
    
    public RedBlackTree(Class<T> type) {
        this.type = type;
        if(type.equals(Integer.class)) {
            nil = new RedBlackNode<>(type.cast(-1));
        } else if(type.equals(Double.class)) {
            nil = new RedBlackNode<>(type.cast(-1.0));
        } else if(type.equals(String.class)) {
            nil = new RedBlackNode<>(type.cast(""));
        }
        nil.colour = 0; //Black colour
        root = nil;
    }

    public RedBlackNode<T> getRoot() {
        return root;
    }

    public void setRoot(RedBlackNode<T> root) {
        this.root = root;
    }

    public RedBlackTree(RedBlackNode<T> root) {
        this.root = root;
    }

    /**
     * Inserts a new node of value 'element' in the red-black tree, doing the necessary rotation to 
     * keep the red-black tree properties.
     * @param element to be inserted.
     */
    public void insert(T element) {
        RedBlackNode<T> newNode = new RedBlackNode<>(element);
        newNode.leftNode = nil;
        newNode.rightNode = nil;
        RedBlackNode<T> father = null;
        RedBlackNode<T> current = root;

        while(current != nil) {
            father = current;
            if(element.compareTo(current.value) < 0) {
                current = current.leftNode;
            } else {
                current = current.rightNode;
            }
        }

        newNode.father = father;
        if(father == null) {
            root = newNode;
        } else if(element.compareTo(father.value) < 0) {
            father.leftNode = newNode;
        } else {
            father.rightNode = newNode;
        }

        newNode.colour = 1;
        balanceAfterInsertion(newNode);
    }

    /**
     * Balances the red-black tree after inserting a node. It needs to revise 4 cases, every case is
     * different to solve. Obviously it need's to do rotations like AVL trees.
     * @param node
     */
    private void balanceAfterInsertion(RedBlackNode<T> node) {
        RedBlackNode<T> father;

        while(node != root && node.father.colour == 1) {
            if(node.father == node.father.father.leftNode) {
                father = node.father.father.rightNode;
                if(father.colour == 1) {
                    node.father.colour = 0;
                    father.colour = 0;
                    node.father.father.colour = 1;
                    node = node.father.father;
                } else {
                    if(node == node.father.rightNode) {
                        node = node.father;
                        leftRotate(node);
                    }
                    node.father.colour = 0;
                    node.father.father.colour = 1;
                    rightRotate(node.father.father);
                }
            } else {
                father = node.father.father.leftNode;
                if(father.colour == 1) {
                    node.father.colour = 0;
                    father.colour = 0;
                    node.father.father.colour = 1;
                    node = node.father.father;
                } else {
                    if(node == node.father.leftNode) {
                        node = node.father;
                        rightRotate(node);
                    }
                    node.father.colour = 0;
                    node.father.father.colour = 1;
                    leftRotate(node.father.father);
                }
            }
        }
        root.colour = 0; //Make sure that root is always black.
    }

    /**
     * Rotates from x node to the left (x node is the reference, the point from it will be rotated). 
     * @param x reference of going to rotate left the tree.
     */
    private void leftRotate(RedBlackNode<T> x) {
        RedBlackNode<T> y = x.rightNode;

        x.rightNode = y.leftNode;
        if(y.leftNode != nil) {
            y.leftNode.father = x;
        }
        y.father = x.father;
        if(x.father == null) {
            root = y;
        } else if(x == x.father.leftNode) {
            x.father.leftNode = y;
        } else {
            x.father.rightNode = y;
        }
        y.leftNode = x;
        x.father = y;
    }

    /**
     * Rotates from x node to the right (x node is the reference, the point from it will be rotated).
     * @param x reference of going to rotate right the tree.
     */
    private void rightRotate(RedBlackNode<T> x) {
        RedBlackNode<T> y = x.leftNode;

        x.leftNode = y.rightNode;
        if(y.rightNode != nil) {
            y.rightNode.father = x;
        }
        y.father = x.father;
        if(x.father == null) {
            root = y;
        } else if(x == x.father.rightNode) {
            x.father.rightNode = y;
        } else {
            x.father.leftNode = y;
        }
        y.rightNode = x;
        x.father = y;
    }

    /**
     * Print values and colours of all red-black tree inorder. 
     * This method is invoked by printOrderWithColour method.
     * @param node
     */
    public void printOrderWithColour(RedBlackNode<T> node) {
        if(node != nil && node != null && !node.value.equals(-1)) {
            printOrderWithColour(node.leftNode);
            System.out.println("Value: " + node.value + " - Colour: " + (node.colour == 1 ? "Red" : "Black"));
            printOrderWithColour(node.rightNode);
        }
    }



}
