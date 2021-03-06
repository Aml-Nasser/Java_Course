package chapter6;


import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        //to avoid static problem we instantiate an object from this clas with a default constructor
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println("The total area is: "+ area);
        calculator.scan.close();
    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scan.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scan.nextDouble();

       // Rectangle room = new Rectangle(length,width);
        return new Rectangle(length,width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
