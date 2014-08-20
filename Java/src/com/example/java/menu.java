package com.example.java;

/**
 * Created by kacper on 8/20/14.
 */

class menu
{
    private static menu instance = null;
    private  int indentyfikator;
    private menu()
    {
        String menu = "\n" + "Hello" + "\n" + "1.remove duplications" +
                "\n" + "2.remove whitespaces" + "\n" + "3.remove concrete name";
        System.out.print(menu);
    }

  public static synchronized menu giveMenu()
  {
    if(instance ==null)
    {
        instance = new menu();
        return instance;
    }
      System.out.println("Menu już zostało utworzone");
      return instance;
  }
    public void about()
    {
        System.out.println("Indentyfikator = " + indentyfikator);
    }
}