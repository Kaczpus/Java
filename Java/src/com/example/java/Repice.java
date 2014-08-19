package com.example.java;
import java.util.Scanner;

/**
 * Created by kacper on 8/19/14.
 */
public class Repice
{
    public static void main(String[] args)
    {
        System.out.print("Hello\n");
        System.out.print("if you want to \n");
        System.out.print("remove duplication press 1 \n");
        System.out.print("remove whitespace characters press 2 \n");
        System.out.print("remove concrete name press 3 \n");
        Scanner scan = new Scanner(System.in);
        int pe = scan.nextInt();

        switch (pe)
        {
            case 1:
                System.out.println("usuwamy powtórzenia bbleble");
                break;
            case 2:
                System.out.println("usuwamy spacje");
                break;
            case 3:
                System.out.println("Please enter what do you want to remove");
                Scanner scaner = new Scanner(System.in);
                String text =scaner.nextLine();
                System.out.println(text);
                break;

        }


    }
}
