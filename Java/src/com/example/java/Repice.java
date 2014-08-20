package com.example.java;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * Created by kacper on 8/19/14.
 */
public class Repice
{
    public static void main(String[] args)
    {
        if(args.length>0)
        {
            File file = new File(args[0]);
        }
        if(args.length != 1)
        {
            System.err.println("Invalid command line, exactly one argument required");
            System.exit(1);
        }

        


        String menu = "\n" + "Hello" + "\n" + "1.remove duplications" +
                "\n" + "2.remove whitespaces" + "\n" + "3.remove concrete name";
        System.out.print(menu);





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


