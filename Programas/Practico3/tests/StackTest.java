package Practico3.tests;

import Practico3.exceptions.StackIsEmptyException;
import Practico3.exceptions.StackIsFullException;
import Practico3.utils.Stack;

public class StackTest {
    /*1. c. Prueba tu implementación utilizando diferentes operaciones y
    elementos. */
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

    /*1. c. Prueba tu implementación utilizando diferentes operaciones y
    elementos. */
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

    public void verifyPalindrome() {
        String word = "Anita Lava La Tina";
        Stack <Character> stackChar = new Stack<>(word.length());
        /*2. Comprobación de Palíndromos:
        a. Crea un programa que verifique si una cadena es un palíndromo (se
        lee igual de izquierda a derecha y de derecha a izquierda).
        b. Primero elimina espacios en blanco y convierte la cadena a
        minúsculas. Luego, llena una pila con la primera mitad de los
        caracteres de la cadena y compara los caracteres de la segunda mitad
        con los elementos desapilados de la pila para determinar si es un
        palíndromo. */
        System.out.println(word.toLowerCase().replace(" ", ""));
        try {
            for(int i = 0; i < word.length() / 2; i++) {
                stackChar.push(word.charAt(i));       
            }
        } catch (StackIsFullException e) {
            System.out.println(e.getMessage());
        } 
    }
}
