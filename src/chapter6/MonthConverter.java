package chapter6;
/*
* When i have Static methods within a class there is no need to instantiate
* that class in order to access them
 */
public class MonthConverter {

    public static void main(String [] args){
        System.out.println(Month.getMonth(2));
        System.out.println(Month.getMonth("January"));
    }
}
