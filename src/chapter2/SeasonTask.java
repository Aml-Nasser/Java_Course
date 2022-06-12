package chapter2;

import java.util.Scanner;

public class SeasonTask {
    public static void main(String arg[]){
        //used algorithm
        //1-ask the user for a season of the year
        System.out.println("Enter a name of a season");
        Scanner scan = new Scanner(System.in);
        String season = scan.next();

        //2-then the whole no of cups
        System.out.println("Enter a number");
        int number = scan.nextInt();

        //3-then an adjective
        System.out.println("Enter adjective");
        String adjective = scan.next();
        scan.close();

        //4-Use the input to complete a sentence
        System.out.println("On a "+adjective+" "+season+" day, i drink a minimum of " +number+ " Cups of coffee.");

    }
}
