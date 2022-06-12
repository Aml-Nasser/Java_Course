package chapter4;

import java.util.Scanner;

/*
--Nested loops
*Find the average of each student's test score
 */
public class AverageTestScore {
    public static void main(String [] args){
        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scan = new Scanner(System.in);

        //Process all students
        for (int i=0; i<numberOfStudents; i++){

            double total = 0;
            for(int j=0;j<numberOfTests;j++){
                System.out.println("Enter the score for test #" + (j+1));
                double score = scan.nextDouble();
                total+=score;
            }
            double testAverage = total/numberOfTests;
            System.out.println("Student number#" +(i+1) + " average is " + testAverage);
        }
        scan.close();
    }
}
