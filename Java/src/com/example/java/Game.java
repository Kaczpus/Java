package com.example.java;

/**
 * Created by kacper on 8/20/14.
 */
abstract class Game
{
    protected String about;
    public abstract Game giveCase();
   protected void Open() { /*otwieranie*/ };


}

class Case1 extends Game
{
    public Case1()
    {
    about = "Case1";
    }
   public void Edit() {/*edytujesz*/ }
   public void Save() { /* savujesz*/}
   public void Close() { /*zamykasz*/}

   public Game  giveCase()
   {
       System.out.println(about);
       Open();
       Edit();
       Save();
       Close();
       return this;
   }
}


class Case2 extends Game
{
    public Case2()
    {
        about = "Case3";
    }
    public void Edit() {/*edytujesz*/ }
    public void Save() { /* savujesz*/}
    public void Close() { /*zamykasz*/}

    public Game  giveCase()
    {
        System.out.println(about);
        Open();
        Edit();
        Save();
        Close();
        return this;
    }
}

class Case3 extends Game
{
    public Case3()
    {
        about = "Case3";
    }
    public void Edit() {/*edytujesz*/ }
    public void Save() { /* savujesz*/}
    public void Close() { /*zamykasz*/}

    public Game  giveCase()
    {
        System.out.println(about);
        Open();
        Edit();
        Save();
        Close();
        return this;
    }
}

class caseCreator
{
   public Game CaseCreating(String about)
   {
       Game choose = null;
       if(about.equalsIgnoreCase("Case1"))
       {
           choose = new Case1();
       }
       if(about.equalsIgnoreCase("Case2"))
       {
           choose = new Case2();
       }
       if(about.equalsIgnoreCase("Case3"))
       {
           choose = new Case3();
       }
       return choose.giveCase();
   }
}