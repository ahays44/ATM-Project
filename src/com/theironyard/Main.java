package com.theironyard;


import java.util.Scanner;

public class Main {




    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name.");

        String name = scanner.nextLine();
        if (name.isEmpty()) {

            throw new Exception("Invalid Name.");

        }
        else {
            System.out.println("Welcome, " + name);
        }
        System.out.println("What would you like to do?");
        System.out.println("1. Check your balance.");
        System.out.println("2. Withdraw Funds.");
        System.out.println("3. Cancel.");

        String option = scanner.nextLine();
        int num = Integer.valueOf(option);

        if (num <= 1) {
            System.out.println("Your balance is $100.");
        }

        else if (num <= 2) {
            System.out.println("How much would you like to withdraw?");
            String amount = scanner.nextLine();
            int intAmount = Integer.valueOf(amount);
            if (intAmount <= 100) {
                System.out.println("Please take your money.");
                System.out.println("Thank you, please come again.");
            }
            else {
                throw new Exception ("Insufficient Funds.");
            }
        }

        if (num > 2) {
            System.out.println("Thank you and please come again.");
        }
        else if (num >3) {
            throw new Exception ("Invalid Option.");
        }



    }
}
