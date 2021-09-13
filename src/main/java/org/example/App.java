package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main( String[] args )
    {
        double firstNum;
        double secondNum;
        double thirdNum;
        double highestNum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNum = sc.nextDouble();

        System.out.print("Enter the second number: ");
        secondNum = sc.nextDouble();

        System.out.print("Enter the third number: ");
        thirdNum = sc.nextDouble();

        if(firstNum != secondNum && firstNum != thirdNum && secondNum != thirdNum)
        {
            if(firstNum > secondNum && firstNum > thirdNum)
            {
                highestNum = firstNum;
            }
            else if(secondNum > firstNum && secondNum > thirdNum)
            {
                highestNum = secondNum;
            }
            else if(thirdNum > firstNum && thirdNum > secondNum)
            {
                highestNum = thirdNum;
            }

            System.out.println("The largest number is " + highestNum + ".");
        }
    }
}
