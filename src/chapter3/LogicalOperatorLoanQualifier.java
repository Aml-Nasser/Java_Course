package chapter3;

import java.util.Scanner;

/*
--Logical operators
*To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */
public class LogicalOperatorLoanQualifier {
    public static void main(String[] args){
        //Initialize the known values
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get unknown values
        System.out.println("Enter your salary");
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();

        System.out.println("Enter the number of years for your current employer: ");
        float years = scan.nextFloat();

        //Make a decision
        if (salary >= requiredSalary && years >= requiredYearsEmployed){
                System.out.println("Congrats! you're qualify for the loan ");
            }

        else {
            System.out.println("Sorry, you must earn at least"
                    + requiredSalary + " $ to qualify the loan");
        }
    }
}
