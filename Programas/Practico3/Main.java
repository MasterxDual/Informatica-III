package Practico3;

import Practico3.tests.StackTest;

public class Main {
    public static void main(String[] args) {
        StackTest test1 = new StackTest();
    
        /* test1.testStackInteger();
        test1.testStackString(); 
        System.out.println(test1.isPalindrome("Anita Lava La Tina") ? "Expression is palindrome" : "Expression isn´t palindrome");
        System.out.println(test1.isMathematicExpression("(((((2 + 3) * 5) - 8))") ? "Expression is equilibrated" : "Expression isn´t equilibrated");*/
        test1.testStackListInteger();
    }
}
