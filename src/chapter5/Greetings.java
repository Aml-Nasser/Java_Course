package chapter5;
/*
--Our First Method
*Write a method that asks a user for their name, then greets them by name.
 */

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {

        System.out.println("Enter your name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        greetUser(name);

    }
    public static void greetUser(String name){
        System.out.println("Hi there," +name);

    }

}
