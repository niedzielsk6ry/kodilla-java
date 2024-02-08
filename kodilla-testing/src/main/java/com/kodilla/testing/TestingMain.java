package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        calculatorTest();

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
    public static void calculatorTest() {
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(5, 3);
        if (resultAdd == 8) {
            System.out.println("Test dodawania zakończony powodzeniem.");
        } else {
            System.out.println("Błąd! Test dodawania nie przeszedł pomyślnie.");
        }

        int resultSubtract = calculator.subtract(5, 3);
        if (resultSubtract == 2) {
            System.out.println("Test odejmowania zakończony powodzeniem.");
        } else {
            System.out.println("Błąd! Test odejmowania nie przeszedł pomyślnie.");
        }
    }
}
