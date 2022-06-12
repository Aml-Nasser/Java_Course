package chapter3;

import java.util.Scanner;
/*
can use switch or enhanced switch
switch(grade){
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "You need to work job a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error invalid grade";
                break;
        }
 */

public class GradeMessage {
    public static void main(String[] args){
        System.out.println("Enter your letter grade:");
        Scanner scan =new Scanner(System.in);
        String grade = scan.next();

        String message = switch (grade) {
            case "A" -> "Excellent Job!";
            case "B" -> "Great job";
            case "C" -> "Good job";
            case "D" -> "You need to work job a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error invalid grade";
        };
        System.out.println(message);
    }
}
