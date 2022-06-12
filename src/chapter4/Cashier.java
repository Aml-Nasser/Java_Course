package chapter4;

import java.util.Scanner;

/*
--For loop
*Write a cashier program that will scan a given number of items and totally the cost.
 */
public class Cashier {
    public static void main(String[] args) {
        //Get number of items to scan
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();

        double total = 0;

        //Create loop to iterate through all the items and accumulate the costs
        for (int i = 0; i < quantity; i++){
            System.out.println("Enter the Cost the item: ");
            double price = scan.nextDouble();

            total+=price;
       }
        scan.close();
        System.out.println("Your Total is $: "+ total);
    }
}

