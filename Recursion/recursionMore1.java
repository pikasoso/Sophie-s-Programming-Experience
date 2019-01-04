import java.util.Scanner;
public class recursionMore1{
  public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Please enter a number of HA you want:");
    int num = sc.nextInt();
    recursionMore1 t = new recursionMore1();
    if (num!=0){
 
    t.printHa(num);
    }
    else{
      System.out.println("YO");
    }
    
  }
  public int printHa (int num){
    if (num>0){
       System.out.println("HA");
      this.printHa(num-1);
     
    }

      return 0;
      
    
  }
  
  
}
  