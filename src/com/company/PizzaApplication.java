package com.company;

import java.io.FileNotFoundException;

public class PizzaApplication {

    public static void main(String[] args) throws FileNotFoundException {
        UserInterface userInterface = new UserInterface();

        userInterface.start();
    }
}