package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    public static void menu(Scanner scanner, int rows, int seatsInRow, boolean [][] seatsMatrix){
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("0. Exit");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("Cinema:");
            System.out.print(" ");
            for(int i=1; i<=seatsInRow; i++){
                System.out.print(" " + i);
            }
            System.out.println();
            for(int i=0; i<rows; i++){
                System.out.print(i+1);
                for(int j=0; j<seatsInRow; j++){
                    if(seatsMatrix[i][j] == false){
                        System.out.print(" S");
                    }else{
                        System.out.print(" B");
                    }
                }
                System.out.println();
            }
            menu(scanner,rows,seatsInRow, seatsMatrix);
        } else if (choice == 2) {
            int [] seat = new int[2];
            System.out.println("Enter a row number:");
            System.out.println("> ");
            seat[0] = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            System.out.println("> ");
            seat[1] = scanner.nextInt();
            seatsMatrix[seat[0]-1][seat[1]-1] = true;
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
            menu(scanner,rows,seatsInRow, seatsMatrix);
        } else if (choice == 0) {

        }
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        System.out.println("> ");
        int rows = scanner.nextInt();
        System.out.println("> ");
        System.out.println("Enter the number of seats in each row");
        int seatsInRow = scanner.nextInt();
        boolean [][] seatsMatrix = new boolean[rows][seatsInRow];
        for (boolean[] matrix : seatsMatrix) {
            Arrays.fill(matrix, false);
        }
        //menu
        menu(scanner, rows, seatsInRow, seatsMatrix);



    }
}