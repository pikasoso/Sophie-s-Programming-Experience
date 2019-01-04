/*Name: Sophie Du
 * Teacher: Ms. A
 * Date:Sept 27
 * Descrption:This program uses recursion to determine the factorial of an inputed integer. 
 */

import java.util.Scanner;

public class Recursion1{
  public static void main(String []args){
    Scanner sc = new Scanner (System.in); //declare Scanner 
    
    System.out.println("Please enter a number to get its factorial:");
    int num = sc.nextInt(); //prompt and get user input 
        
    System.out.println("The factorial of " + num + " is " +factorial (num));
    
  }
  
  public static int factorial(int num){ 

    if(num>0){  
      
      return (num*factorial(num-1)); //making a recursive call to multiply the integer itself by all other smaller integers one  by one 
      
    }
    else{ //base case to end the factorial calculation by multiplying 1
      
      return 1;
    }

  }
  
  
  
  
  
}