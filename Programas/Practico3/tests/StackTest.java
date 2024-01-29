package Practico3.tests;

import java.util.Scanner;

import Practico3.exceptions.StackIsEmptyException;
import Practico3.exceptions.StackIsFullException;
import Practico3.utils.Node;
import Practico3.utils.Stack;
import Practico3.utils.StackList;

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
        } catch(StackIsEmptyException | StackIsFullException e) {
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
        } catch (StackIsEmptyException | StackIsFullException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isPalindrome(String word) {
        /*2. Comprobación de Palíndromos:
        a. Crea un programa que verifique si una cadena es un palíndromo (se
        lee igual de izquierda a derecha y de derecha a izquierda).
        b. Primero elimina espacios en blanco y convierte la cadena a
        minúsculas. Luego, llena una pila con la primera mitad de los
        caracteres de la cadena y compara los caracteres de la segunda mitad
        con los elementos desapilados de la pila para determinar si es un
        palíndromo. */
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
                    return false;
                } 
            } 
            /* //Metodo de Abby, el mas optimo. El problema es que no usa el stack como se pide en la consigna.
            for (int s = 0; s < size / 2; s++) {
                if(word.charAt(s) != word.charAt(size - 1 - s)) {
                    return false;
                }
            } 
            //Mas optimo que el primer metodo pero no tiene sentido pushear y luego poppear a la vez, pero bueno, funciona.
            for (int u = 0; u < size / 2; u++) {
                stackChar.push(word.charAt(u));
                if(!stackChar.pop().equals(word.charAt(size - 1 - u))) {
                    return false;
                }
            } */
            return true;
        } catch (StackIsFullException | StackIsEmptyException e) {
            System.out.println(e.getMessage());
            return false;
        } 
    }

    public boolean isMathematicExpression(String expression) {
        /* 3. Expresiones Matemáticas:
        a. Implementa un programa que verifique si una expresión matemática
        con paréntesis está correctamente equilibrada.
        b. Utiliza una pila para rastrear los paréntesis y asegurarte de que cada
        apertura tenga un cierre correspondiente.
        c. Siempre que se encuentre un paréntesis de cierre, se verifica si hay un
        paréntesis de apertura correspondiente en la pila. Si la pila está vacía
        al final del proceso, la expresión se considera equilibrada. Si no,
        significa que hay paréntesis sin su correspondiente paréntesis de
        apertura, y la expresión no está equilibrada. */
        expression = expression.replace(" ", "");
        int size = expression.length();
        Stack <Character> stackChar = new Stack<>(size);

        /* Metodo mio
        try {
            for (int u = 0; u < size; u++) {
                if(expression.charAt(u) == '(') {
                    stackChar.push('(');
                } else if(expression.charAt(u) == ')') {
                    if(!stackChar.isEmpty()) {
                        System.out.println(stackChar.pop() + " was eliminated from the stack");
                    } else {
                        return false;
                    }
                }
            }
            if(stackChar.isEmpty()) {
                return true;
            }
        } catch (StackIsFullException | StackIsEmptyException e) {
            System.out.println(e.getMessage());
        }
        return false; */

        /* Metodo mas sencillo:
        Si ves lineas de código repetido, seguramente se puede simplificar
        Por ejemplo return true, return true y así.
        No importa donde esten los return, si estan repetidos hay una pista.
        Si ves varios if que hacen lo mismo (isEmpty en este caso), 
        seguramente se puede simplificar (aunque cuestan más esos casos).
        */
        try {
            for (int u = 0; u < size; u++) {
                if(expression.charAt(u) == '(') {
                    stackChar.push('(');
                } else if(expression.charAt(u) == ')') {
                    System.out.println(stackChar.pop() + " was eliminated from the stack");
                }
            }
            return stackChar.isEmpty();
        } catch (StackIsFullException | StackIsEmptyException e) {
            System.out.println(e.getMessage());
            return false;     
        }
    }


    /* 1. Implementación de una Pila con lista:
    a. Crea una clase que represente una pila utilistackList2zando una lista.
    b. Implementa métodos para push (agregar un elemento), pop (eliminar
    el elemento en la cima) y top (ver el elemento en la cima sin
    eliminarlo).
    c. Prueba tu implementación utilizando diferentes operaciones y
    elementos.*/
    public void testStackListInteger() {
        StackList<Integer> stackList = new StackList<>();

        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        
        try {
            System.out.println(stackList.pop());
            System.out.println(stackList.pop());
            System.out.println(stackList.pop());
            System.out.println(stackList.pop());
            System.out.println(stackList.pop());
        } catch (StackIsEmptyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(stackList.isEmpty());
        System.out.println(stackList.size());
    }

    /*2. Pila de Palabras:
    a. Implementa una pila que almacene palabras. Crea un programa que
    solicite al usuario ingresar palabras y las apile. Luego, desapílalas e
    imprímelas en orden inverso. */
    public void makeStackOfWords() {
        StackList<String> stackList = new StackList<>();

        stackList.push("Hola");
        stackList.push("Mundo");
        stackList.push("Palabra 1");
        stackList.push("Palabra 2");
        
        try {
            System.out.println(stackList.pop());
            System.out.println(stackList.pop());
            System.out.println(stackList.pop());
            System.out.println(stackList.pop());
        } catch (StackIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    /*3. Verificación de Paréntesis
    a. Escribe un programa que verifique si una expresión matemática tiene
    paréntesis balanceados. Por ejemplo, para la expresión ((3+2)*5) la
    salida debería ser "Paréntesis balanceados", mientras que para
    ((3+2)*5)) la salida debería ser "Paréntesis desbalanceados".*/

    public boolean isBalancedExpression(String word) {
        word = word.replace(" ", "");
        int size = word.length();
        StackList <Character> stackList = new StackList<>();
        
        try {
            for(int s = 0; s < size; s++) {
                if(word.charAt(s) == '(') {
                    stackList.push('(');
                } else if(word.charAt(s) == ')') {
                    stackList.pop();
                }
            }
            return stackList.isEmpty();
        } catch (StackIsEmptyException e) {
            return false;
        }
    }

    /*4. Conversión de Decimal a Binario:
    a. Crea un programa que convierta un número decimal a su
    representación en binario utilizando una pila. Puedes usar el algoritmo
    de división sucesiva por 2. */
    public void convertToBinary(Integer number) {
        StackList <Integer> stackList = new StackList<>();

        try {
            /* Manera basica:
            if(number == 1) {
                stackList.push(1);
            } else if(number % 2 == 0) {
                stackList.push(0);
                convertToBinary(number / 2);
            } else if(number % 2 != 0) {
                stackList.push(1);
                convertToBinary(number / 2);
            } 
            System.out.print(stackList.pop() + " ");
            */
            //Manera optima:
            if(number % 2 == 0) {
                stackList.push(0);
                convertToBinary(number / 2);
            } else if(number % 2 != 0) {
                stackList.push(1);
                if(number != 1) {
                    convertToBinary(number / 2);
                }
            }
            System.out.print(stackList.pop() + " ");
        } catch (StackIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a stack list by input of numbers
     * @param stack created
     * @return stack list created
     */
    public StackList<Integer> insertStackByInput(StackList<Integer> stack) {
        int number;
        do {
            System.out.println("Ingrese un numero");
            stack.push(new Scanner(System.in).nextInt());
            System.out.println("¿Desea ingresar otro numero? (1-Si 0-No)");
            number = new Scanner(System.in).nextInt();
        } while(number != 0);

        return stack;
    }

    /**
     * If it finds the 'old' value on the bound stack, it replaces it with the 'new' value. 
     * Otherwise, throw an exception.
     * @param stack to search for the element
     * @param newValue value that replaces the other
     * @param oldValue replaced value
     * @throws NullPointerException If don't find the value 'old'
     */
    public void replace(StackList<Integer> stack, int newValue, int oldValue) throws NullPointerException {
        Node<Integer> temp = stack.getRoot();
        
        try {
            while(temp.getData() != oldValue) {
                temp = temp.getNext();
            }
            temp.setData(newValue);
        } catch(NullPointerException e) {
            System.err.println("No se ha encontrado el valor " + oldValue + " en la pila");
            throw e;
        }
    }

    /**
     * This is for one or more 'old values' found in the stack list. The previous method replace is only for one 'old value'.
     * If it finds the 'old' value on the bound stack, it replaces it with the 'new' value. 
     * Otherwise, throw an exception.
     * @param stack to search for the element
     * @param newValue value that replaces the other
     * @param oldValue replaced value
     * @throws NullPointerException If don't find the value 'old'
     */
    public void replace2(StackList<Integer> stack, int newValue, int oldValue) throws NullPointerException {
        Node<Integer> temp = stack.getRoot();
        int count = 0;
        
        while(temp != null) {
            if(oldValue == temp.getData()) {
                temp.setData(newValue);
                count++;
            }
            temp = temp.getNext();
        }
        if(count == 0) {
            System.out.println("No se encontró el valor " + oldValue + " en la pila.");
            throw new NullPointerException();
        }
         
    }

    /**A pointer p points to the base and another t points to the last added element.
     * Reads the last two numbers added and stores the sum of these on the same stack.
     * Additionally, it prints the p and t pointer.
     * @param stack to add
     */
    public void sumAndAdd(StackList<Integer> stack) {
        try {
            Node<Integer> topOfStack = stack.getRoot();
            Node<Integer> t = topOfStack;
            Node<Integer> p = t;
            Node<Integer> newNode = new Node<>(t.getData() + t.getNext().getData());
    
            while(p.getNext() != null) {
                p = p.getNext();
            }
    
            newNode.setNext(topOfStack);
            stack.setRoot(newNode);
            t = newNode;
    
            System.out.println("Nodo base p = " + p.getData());
            System.out.println("Nodo top of stack t = " + t.getData());
        } catch(NullPointerException e) {
            System.err.println("La pila no contiene la cantidad suficiente de nodos para realizar la operacion.");
            throw e;
        }
    }
}
