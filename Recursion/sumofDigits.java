import java.util.Scanner;

public class sumofDigits { 

  public static int getSum(int n) {     
    int sum = 0; //if n is 0, sum will remain 0
    
    while (n!=0) { //recursively looping the quotient of n divided by 10
      
      sum = sum + n % 10; // get the value of the remaining digit, eg(0 for 10, 2 for 12) 
      n = n/10; // remove the last digit that has been added (remove 2 from 12, n = 1; remove 4 
                        //from 24, n = 2)
      
    } 
    return sum; 
    
  } 

    public static void main(String[] args) {  //main method
      Scanner sc = new Scanner (System.in);
        int n = 0;
        System.out.println("Please enter a number:");
        n=sc.nextInt();

        System.out.println("The sum of digits for " + n + " is " +getSum(n)); 
    } 
} 

