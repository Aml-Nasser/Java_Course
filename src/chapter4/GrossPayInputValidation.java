package chapter4;

import java.util.Scanner;

/*
--While loop
*Each Store employee makes $15 an hour. write a program that allows the e,ployee
to enter the number of hours worked for the week. Do not allow Overtime.
 */
public class GrossPayInputValidation {
    public static void main(String[] args){
        //Initialize known variables
        int rate = 15;
        int maxHours =40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scan= new Scanner(System.in);
        double hoursWorked = scan.nextDouble();

        //Validate input
        /*hoursWorked in while is a Sentinel Controls the flow of the loop
         in the condition without it, the loop will be infinite*/
        while (hoursWorked > maxHours || hoursWorked<1){
            System.out.println("Invalid entry. your hours must be between 1 and 40. Try again.");
            hoursWorked = scan.nextDouble();
        }
        scan.close();
        //Calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $ "+gross);
    }
}
