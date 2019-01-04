package Person;
import java.util.Scanner;


public class TestPerson{
  static Scanner sc = new Scanner (System.in);
  public static void main(String []args){
    System.out.println("Enter 1 for students, 2 for stuff");
    int ans = sc.nextInt();
    Student pika = new Student ("pika","77 great street", "math" , 2019, 2000);
    Staff cat = new Staff ("cat" , "66 awesome street", "bayview",1000);
    
    System.out.println();
    if(ans ==1){
      
      
    }
    
    System.out.println();
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}