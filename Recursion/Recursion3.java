

import java.util.Scanner;

public class Recursion3{
  public static void main(String []args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Please enter a real value for base");
    double num1 = sc.nextDouble();
    
    System.out.println("Please enter a power value:");
    double num2 = sc.nextInt();
    
    System.out.println( num1 +"^" + num2 + " is " + power (num1,num2));
    
  }
  
  
  public static double power(double num1, double num2){
    
    if (num2==0){
      return 1;
      
    }
    
    if (num2 < 0) {
      return 1 / power(num1, -num2); //return the reciprocal of the positive exponent
    }
    else {
      double results = num1 * power(num1, num2-1); //make a recursive call to get the power through multiplication
      return results;
    }
    
    
  }
}