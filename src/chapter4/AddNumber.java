package chapter4;

import java.util.Scanner;

/*
--Do while loop
*Write a program that allows a user to enter two numbers,
and then sums up the two numbers. The user should be able to
repeat this action until they indicate they are done.
 */
public class AddNumber {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        boolean again;
        do{
            System.out.println("Enter the first Number");
            double firstNum= scan.nextDouble();

            System.out.println("Enter the Second Number");
            double secondNum= scan.nextDouble();

            double sum = firstNum + secondNum;

            System.out.println("The sum is "+ sum);

            System.out.println("Would you like to start over? True or False");
            again = scan.nextBoolean();

        }while (again);

        scan.close();
    }

}
