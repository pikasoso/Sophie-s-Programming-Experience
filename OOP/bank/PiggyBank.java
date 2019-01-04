package bank;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class PiggyBank{
  public static void main(String[] args) {
    List <Nickel>nickelList  = new ArrayList<Nickel>(); //many forms
    List <Dime>dimeList  = new ArrayList<Dime>();
    List <Quarter>quarterList  = new ArrayList<Quarter>(); //many forms
    List <Loonie>loonieList  = new ArrayList<Loonie>();
    List <Toonie>toonieList  = new ArrayList<Toonie>(); //many forms

    System.out.println("Display Menu:");
    System.out.println("1.Show total in bank");
    System.out.println("2. Add a nickel");
    System.out.println("3. Add a dime");
    System.out.println("4. Add a quarter");
    System.out.println("5. Add a loonie");
    System.out.println("6. Add a toonie");    
    System.out.println("7.Take money out of bank");    
    System.out.println("Enter 0 to quite, Enter your choice"); 
  }  
}

