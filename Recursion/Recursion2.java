/*Name: Sophie Du
 * Teacher: Ms. A
 * Date:Sept 27
 * Descrption:This program uses recursion to determine the greatest common factor of 2 inputed integers. 
 */

import java.util.Scanner;

public class Recursion2{ 
  public static void main(String []args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Please enter 2 numbers");
    int num1 = sc.nextInt(); //prompt and get user input 
    int num2 = sc.nextInt();
    
    int gcf = greatestCommonFactor (num1,num2); //pass user input into method 
    System.out.println("GCF IS " + greatestCommonFactor(num1,num2));
    
    
  }
  
  
  public static int greatestCommonFactor (int num1, int num2){
    
    if (num1==num2){ //base case 
      return num1;
      
    }
    
    else if (num1>num2){ //apply euclid's method by making a recursive call that passes the smaller number first, then the difference between 2 numbers
      return greatestCommonFactor(num2, num1-num2);
      
    }
    
    else { //recursive step where allows the larger number to be passed into the method first 
      return greatestCommonFactor(num2, num1);
      
    }
    
    
  }
}