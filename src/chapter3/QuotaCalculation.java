package chapter3;

import java.util.Scanner;

/*
--IF ELSE Statement.
*All salespeople are expected to make at least 10 sales each week.
for those who do they receive a congrats message.
for those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculation {
    public static void main (String[] args) {
        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();

        //Make a decision on the path to take - Output
        if (sales >= quota){
            System.out.println("Congrats! you've met your quota");
        }
        else {
            System.out.println("You miss your quota by: "+ (quota-sales));
        }
    }
}
