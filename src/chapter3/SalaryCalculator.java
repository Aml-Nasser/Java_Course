package chapter3;

import java.util.Scanner;

/*
--IF Statement.
*All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*in case we use if(sales > 10)
this 10 is called a magic number .. hard-coded number we don't know why we use without searching
it's better to initialize it
 */
public class SalaryCalculator {
    public static void main(String[] args){
        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();

        //Quick detour for the bonus earners
        if(sales > quota){
            salary= salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);


    }
}
