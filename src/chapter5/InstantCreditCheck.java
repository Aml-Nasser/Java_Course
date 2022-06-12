package chapter5;

import java.util.Scanner;

/*
--Variable Scope
* Write an 'instant credit check' Program that approves
* anyone who makes more than $25,000 and has a credit score
* of 700 or better. Reject all others.
 */
public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore =700;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        //Initialize what we know
        //declare globally

        //Get what we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scan.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(salary,creditScore);

        //Notify the user
        notifyUser(qualified);

    }
    public static double getSalary(){
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your Credit Score: ");
        int creditScore = scan.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified( double salary, int creditScore){
        if (creditScore >= requiredCreditScore && salary>=requiredSalary){
            return true;
        }
        else {
            return false;
        }

    }

    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! you've been approved");
        }
        else {
            System.out.println("Sorry you've been declined");
        }

    }
}
