package Practico3.utils;

public record Person(String name, int age) {
    /**
     *  Classes that are primarily used to store data immutably. It is a feature that simplifies the creation
     * of simple model classes, where objects are basically data containers with accessor methods. 
     *  When you define a record this way, Java automatically generates certain methods, such as a 
     * constructor, getters, equals(), hashCode(), and toString(). This means you don't need to 
     * write those methods manually, which makes the code more concise. Records are mainly used for 
     * simple, immutable data classes.
     */
}
