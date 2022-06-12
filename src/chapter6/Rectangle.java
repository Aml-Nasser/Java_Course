package chapter6;
/*
*does not contain main
* Generalized shell that we could then later on in other classes
make more specific
* Protected is that any class within this package can access same as not
* using modifier at all.
* Encapsulation Hiding the data of a class by making its fields private and allowing access through public methods
* it's a definition , a blueprint.
 */
public class Rectangle {
    //Encapsulation by make them private and use them through getters & Setters
    private double length;
    private double width;

    //Constructor assign default values to the fields
    public Rectangle(){
        length =0;
        width =0;
    }
    //Param Constructor
    public Rectangle(double length, double width){
       setLength(length); //Can set this way
        this.width = width; //or can be set this way.
    }

    //Getters
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    //Setters
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }

    //Methods if used without access modifier only classes within this package can call
    public double calculatePerimeter(){
        return 2*(length+width);
    }
    public double calculateArea(){
        return length * width;
    }

}
