import java.util.*; 

public class ConstructTriangle { 
  
  public static void printTriangle(int[] A) { 
    
    if (A.length < 1) { //base case
      return; 
    }
    
    else{ // Creating new array which contains the sum of consecutive elements in the array 
      
      int[] temp = new int[A.length - 1]; 
      
      for (int i = 0; i < A.length - 1; i++)  { 
        
        int x = A[i] + A[i + 1];
        temp[i] = x; 
      } 
      
      // Make a recursive call and pass  the newly created array 
      printTriangle(temp); 
      
      // Print current array in the end so that smaller arrays are printed first 
      System.out.println(Arrays.toString(A)); 
      
    } 
  }
  
  public static void main(String[] args) { 
    
    int[] A = { 1, 2, 3, 4, 5 }; 
    printTriangle(A); 
    
  } 
} 