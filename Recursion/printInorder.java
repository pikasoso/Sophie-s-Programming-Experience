import java.util.Scanner;

public class printInorder{ 
  
  public static void printNumber(int n) 
  { 
    
    if (n < 1) { 
      
      return; 
    }
    
    else { 
      
      System.out.print(" " + n); 
      
      printNumber(n-1); // make a recursive call for all numbers less than n one by one 
      
      System.out.print( " " + n); //print the new number 
      
      return; 
      
    } 
  } 
  
  
  
  public static void main(String[] args) 
  { 
    Scanner sc = new Scanner (System.in);
    int n = 0;
    System.out.println("Please enter a number:");
    n = sc.nextInt();
    
    printNumber(n); 
  } 
}
