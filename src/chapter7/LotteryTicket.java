package chapter7;

import java.util.Random;

/*
--Arrays Container of multiple values
* they're all in the same data type
 */
public class LotteryTicket {
    private static final int LENGTH = 6; //UpperCase variable Constant, make it final to make sure it's won't change
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){

        int[] ticket = generateNumbers(); //Receive the ticket
        printTicket(ticket);
    }

    public static int [] generateNumbers(){

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i=0; i< LENGTH; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1; //We add 1 to ensure it's between 1`69,and use nextInt(bound)
        }

        return ticket;
    }

    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
