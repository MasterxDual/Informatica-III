package Practico3.tests;

import Practico3.exceptions.StackIsEmptyException;
import Practico3.exceptions.StackIsFullException;
import Practico3.utils.Stack;

public class StackTest {
    public void testStackInteger() {
        Stack<Integer> stackInteger = new Stack<>(5);
    
        try {
            stackInteger.push(1);
            stackInteger.push(2);
            stackInteger.push(3);
            stackInteger.push(4);
            stackInteger.push(5);  
            
            System.out.println(stackInteger.pop());
            System.out.println(stackInteger.pop());
            System.out.println(stackInteger.pop());
            System.out.println(stackInteger.pop());
            System.out.println(stackInteger.pop());
            System.out.println(stackInteger.pop()); //StackIsEmptyException
        } catch(StackIsEmptyException e) {
            System.out.println(e.getMessage());
        } catch(StackIsFullException e) {
            System.out.println(e.getMessage());
        }
    }

    public void testStackString() {
        Stack <String> stackString = new Stack<>(3);

        try {
            stackString.push("Hola");
            stackString.push("Mundo");
            stackString.push("!!!");

            System.out.println(stackString.pop());
            System.out.println(stackString.pop());
            System.out.println(stackString.pop());

            stackString.push("Hola");
            stackString.push("Que tal");
            stackString.push("!!!");
            stackString.push("!!!"); //StackIsFullException
        } catch (StackIsEmptyException e) {
            System.out.println(e.getMessage());
        } catch (StackIsFullException e) {
            System.out.println(e.getMessage());
        }
    }
}
