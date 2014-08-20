package com.example.java;
import java.util.Scanner;
import java.io.File;

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
