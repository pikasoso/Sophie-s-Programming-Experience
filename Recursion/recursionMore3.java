import java.util.Scanner;
public class recursionMore3{
  
  public static void main(String []args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter an number position in the sequence:");
  int n = sc.nextInt();
  
  System.out.println("The " +n +" th number in the sequence is:"+sequence(n));
  
  
  
  
  }
  public static int sequence(int num){
    
    if(num<=1){
      return num;
    }
    else{
      return sequence(num-1) + sequence(num-2);
      
    }
    
    
  }
  
}