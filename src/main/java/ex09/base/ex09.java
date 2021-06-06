package ex09.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length? ");
        String str1 = input.nextLine();
        int length = Integer.parseInt(str1);

        System.out.print("What is the width? ");
        String str2 = input.nextLine();
        int width = Integer.parseInt(str2);

        int area = length * width;
        final double oneCan = 350.0;
        int roundCans = (int) Math.ceil(area / oneCan);

        System.out.println("You will need to purchase " + roundCans + " gallons of paint to cover " + area + " square feet.");
    }
}
