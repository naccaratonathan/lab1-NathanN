package org.example;

import javax.swing.*;
/*
 Question 1, this would fail to run as the java file and class file have to be the same name
 Question 2, The main method must be declared as public static void so that the JVM is able to access the class.
 Question 3, Variables must be declared as a type as it determines the values inside and the actions performed.
*/
public class Main {
    private static String getNameFromGui() {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
        return name;
     // This can be marked as private because it is being used within the same class.
    }
    public static void printName(String name) {System.out.println("Hello, "+name+"!");}

    public static void main(String[] args) {
            String name = getNameFromGui();
            printName(name);
    }
}