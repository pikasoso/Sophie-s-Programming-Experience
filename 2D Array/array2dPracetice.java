import java.util.Scanner;
public class array2dPracetice{
  
  public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    
    int aGrid [] [] = new int [2] [2];
    
    for (int r=0;r<aGrid.length;r++){
      
      for(int c=0;c<aGrid[r].length;c++){
        aGrid [r][c] = sc.nextInt();
        
      }

    }
    
    for (int r=0;r<aGrid.length;r++){
      
      for(int c=0;c<aGrid[r].length;c++){
        System.out.print(aGrid [r][c] + "  ");
        
      }
      System.out.println(); //end of a row 
    }
    
  }
  
  
  
}