/*
 * 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class insertion1{
  public static void main (String []args){
    
    
    int [] num = {1,2,3,4,5,6,7,8,9,10};
    insertionSort(num);
    String [] words = {" bbb", "ccc", "zzz", "qqq"               };
    insertionSort2(words);
    ArrayList< Integer>  integer = new ArrayList <Integer>();
    Scanner sc = new Scanner (System.in);
    int input =0;
    
    System.out.println();
    System.out.println ("Please enter a number between 1 and 100 [enter -1]to exit");

    
    int var = 0;
    
    while (var!= -1){
      
      System.out.println("Enter: ");
      var=sc.nextInt();
      
      integer.add (var);

  


    }
    integer.remove(integer.size()-1);
    
    insertionSort3(integer);
    
    System.out.println("Do you wwant to add:");
    sc.nextInt();
    insertionSort3(integer);
  }
  
  public static void insertionSort(int num[]){
    
    int n = num.length;
    for (int i=0;i<n;i++){
      int temp = num[i];
      int j= i-1;
      while (j>=0&& num[j]<temp){
        num [j+1] = num[j];
        j--;
      }
      num[j+1] = temp;
    }
    System.out.println("List in sorted order:");
    
    for (int i=0;i<n;i++){
    System.out.print( num[i] + " ");
    }
  }
  
    public static void insertionSort2(String words[]){
    
    int n = words.length;
    for (int i=0;i<n;i++){
      String temp = words[i];
      int j= i-1;
      while (j>=0&& words[j].compareTo(temp) > 0){
        words [j+1] = words[j];
        j--;
      }
      words[j+1] = temp;
    }
    System.out.println();
    System.out.println("List in alphebatical order:");
    
    for (int i=0;i<n;i++){
    System.out.print( words[i] + " ");
    }
  }
  
    public static void insertionSort3(ArrayList <Integer> integer){
    
    int n = integer.size();
    for (int i=0;i<n;i++){
      int temp = integer.get(i);
      int j= i-1;
      while (j>=0&& integer.get(j) > temp){
       integer.set((j+1),integer.get(j));
        j--;
      }
      integer.set((j+1),temp);
    }
    System.out.println();
    System.out.println("List in sorted order:");
    
    for (int i=0;i<n;i++){
    System.out.print( integer.get(i) + " ");
    }
    
  
  }
  
  
  
  
  
}