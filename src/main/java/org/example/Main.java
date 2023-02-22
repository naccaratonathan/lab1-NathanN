package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getNameFromGui();
    }

        /*
         Question 1, this would fail to run as the java file and class file have to be the same name
         Question 2, The main method must be declared as public static void so that the JVM is able to access the class.
         Question 3, Variables must be declared as a type as it determines the values inside and the actions performed.
        */
        private static void getNameFromGui() {
            // This can be marked as private because it is being used within the same class.
            String name = JOptionPane.showInputDialog("What is your name?");
            System.out.println(name);
            System.out.println("Hello " +name);

    }
}