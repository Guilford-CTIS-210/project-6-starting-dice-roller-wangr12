package edu.guilford;
//Ray Wang 9/19/24

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("This program rolls a number of dice and totals the rolls \nNumber of sides: ");
        int sides = scan.nextInt(); //gets # of sides input

        System.out.print("Number of dice: ");
        int number = scan.nextInt(); //gets # of dice input

        int sum = 0;

        // default for loop, prints loop variable as it counts up
        for (int i = 0; i < number; i++) { //rols the dice number of times
            int diceRoll = rand.nextInt(sides) + 1; //add one so the values start at 1
            sum += diceRoll; //add the dice roll to the total sum
            //System.out.println("sum of " + i + "d" + sides + "=" + sum);
        }
        System.out.println(number + "d" + sides + "=" + sum); //prints out number, sides, and the sum of the rolls
        scan.close(); //closes scanner
    }
}