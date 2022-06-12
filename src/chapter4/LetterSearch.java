package chapter4;
/*
--For loop
*Search a String to determine if it contains the letter 'A'.
 */

import java.util.Scanner;

public class LetterSearch {
    public static void main (String[] args){
        //Get text
        System.out.println("Enter any Text");
        Scanner scan =new Scanner(System.in);
        String input = scan.next();
        scan.close();

        boolean letterFound = false;

        //Search text for letter A
        for(int i=0; i<input.length();i++){
            char currentLetter=input.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a' ){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("This text contain the Letter A");
        }
        else {
            System.out.println("This text doesn't contain the Letter A");
        }
    }
}
