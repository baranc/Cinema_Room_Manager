package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        System.out.println("> ");
        int rows = scanner.nextInt();
        System.out.println("> ");
        System.out.println("Enter the number of seats in each row");
        int seatsInRow = scanner.nextInt();
        System.out.println("Cinema:");
        System.out.print(" ");
        for(int i=1; i<=seatsInRow; i++){
            System.out.print(" " + i);
        }
        System.out.println();
        for(int i=1; i<=rows; i++){
            System.out.print(i);
            for(int j=1; j<=seatsInRow; j++){
                System.out.print(" S");
            }
            System.out.println();
        }

        System.out.println("Total income:");
        if(rows * seatsInRow <= 60){
            System.out.println("$" + rows * seatsInRow * 10);
        }else{
            int income = 0;
            income = seatsInRow * (rows/2) *10 + seatsInRow *(rows-rows/2)*8;
            System.out.println("$" + income);
        }
        int [] seat = new int[2];
        System.out.println("Enter a row number:");
        System.out.println("> ");
        seat[0] = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        System.out.println("> ");
        seat[1] = scanner.nextInt();
        System.out.print("Ticket price:");
        int ticketPrice = 0;
        if(rows * seatsInRow <= 60){
            ticketPrice = 10;
        }else {
            if (seat[0] <= rows / 2) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }
        }
        System.out.println(" $" + ticketPrice);
        System.out.println("Cinema:");
        System.out.print(" ");
        for(int i=1; i<=seatsInRow; i++){
            System.out.print(" " + i);
        }
        System.out.println();
        for(int i=1; i<=rows; i++ ){
            System.out.print(i);
            for(int j=1; j<=seatsInRow; j++){
                if(i==seat[0] && j==seat[1]){
                    System.out.print(" B");
                    continue;
                }
                System.out.print(" S");
            }
            System.out.println();
        }
    }
}