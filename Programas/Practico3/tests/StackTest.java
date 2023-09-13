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
        /*2. Comprobación de Palíndromos:
        a. Crea un programa que verifique si una cadena es un palíndromo (se
        lee igual de izquierda a derecha y de derecha a izquierda).
        b. Primero elimina espacios en blanco y convierte la cadena a
        minúsculas. Luego, llena una pila con la primera mitad de los
        caracteres de la cadena y compara los caracteres de la segunda mitad
        con los elementos desapilados de la pila para determinar si es un
        palíndromo. */

        String word = "Anita Lava La Tina";
        word = word.toLowerCase().replace(" ", "");
        int size = word.length();
        Stack <Character> stackChar = new Stack<>(size);
        try {
            //Metodo pensado por mi, un poco rebuscado pero bueno, salió. No es el mas óptimo.
             for(int i = 0; i < size / 2; i++) {
                stackChar.push(word.charAt(i));
                System.out.println(stackChar.top());
            }
            for(int t = size % 2 != 0 ? size / 2 + 2 : size / 2 + 1; t < size; t++) {
                if(!stackChar.pop().equals(word.charAt(t - 1))) {
                    System.out.println("No es palíndromo");
                    return;
                } 
            } 
            /* //Metodo de Abby, el mas optimo. El problema es que no usa el stack como se pide en la consigna.
            for (int s = 0; s < size / 2; s++) {
                if(word.charAt(s) != word.charAt(size - 1 - s)) {
                    System.out.println("No es palíndromo");
                    break;
                }
            } 
            //Mas optimo que el primer metodo pero no tiene sentido pushear y luego poppear a la vez, pero bueno, funciona.
            for (int u = 0; u < size / 2; u++) {
                stackChar.push(word.charAt(u));
                if(!stackChar.pop().equals(word.charAt(size - 1 - u))) {
                    System.out.println("No es palíndromo");
                    return;
                }
            } */
            System.out.println("Es palíndromo");
        } catch (StackIsFullException | StackIsEmptyException e) {
            System.out.println(e.getMessage());
        } 
    }
}
