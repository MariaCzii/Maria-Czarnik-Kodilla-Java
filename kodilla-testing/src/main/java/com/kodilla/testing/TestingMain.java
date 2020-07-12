package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculatorTest = new Calculator();

        if (calculatorTest.addAToB(6, 6) == 12) {
            System.out.println("Poprawny wynik dodawania. Test zakonczony poprawnie");
        } else {
            System.out.println("Error!");
        }

        if (calculatorTest.subtractBFromA(10, 5) == 5) {
            System.out.println("Poprawny wynik odejmowania. Test zakonczony poprawnie");
        } else {
            System.out.println("Error!");
        }
    }
}
