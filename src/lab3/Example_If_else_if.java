package lab3;

import java.util.Scanner;

public class Example_If_else_if {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input score
        System.out.println("Enter your score: ");
        double score = scanner.nextDouble();
        //test condition
        // F  =  0 - 49.99
        // D  = 50 - 54.99
        // D+ = 55 - 59.99
        // C  = 60 - 64.99
        // C+ = 65 - 69.99
        // B  = 70 - 74.99
        // B+ = 75 - 79.99
        // A  = 80 - 100.00
        if (score >=0 && score <= 49.99){
            System.out.println("your grad is F.");
        }else if (score >=50 && score <= 54.99){
            System.out.println("your grad is D.");
        }else if (score >=55 && score <= 59.99) {
            System.out.println("your grad is D+.");
        }else if (score >=60 && score <= 64.99) {
            System.out.println("your grad is C.");
        }else if (score >=65 && score <= 69.99) {
            System.out.println("your grad is C+.");
        }else if (score >=70 && score <= 74.99) {
            System.out.println("your grad is B.");
        }else if (score >=75 && score <= 79.99) {
            System.out.println("your grad is B+.");
        }else if (score >=80 && score <= 100.00) {
            System.out.println("your grad is A.");
        }else
            //coding here
            System.out.println("Please,Thank You");


    }//main

}//class
