/*Name: Sophie 
 * Teacher: Mrs. A
 * Description: Level 1
 * Date: Sept7, 2018
 */
import java.util.ArrayList;
import java.util.Scanner;
public class arrayList1{
  static Scanner sc = new Scanner (System.in);
  
  
  public static void main (String []args){

    ArrayList<Integer> num =  new ArrayList<Integer>();
    int ans = 0;
    int sum =0; 
    
    initializeArray (num);
    enterfromKeyboard (num);
    
    
    System.out.println("Menu :");
    System.out.println("1. Count number of whole integers");
    System.out.println("2. Display the integers you entered");
    System.out.println("3. Display the integers you entered in reverse order");
    System.out.println("4. Find sum");
    System.out.println("5. Find average ");
    System.out.println("6. Find max");
    System.out.println("7. Find min");
    System.out.println("8. Search for the position of the integer");
    System.out.println("9. Sort the integers in ascending order");
    
    
    System.out.println("Please enter your choice: [enter -1 to exit]");
    ans = sc.nextInt();
    
    if (ans ==-1){
      System.out.println("Thank you");
      
    }
    if (ans ==1){
      countWhole (num);
    }
    
    else if (ans ==2){
      display(num);
      
    }
    
    else if (ans ==3){
      displayReverse(num);
      
    }
    
    else if (ans ==4){
      System.out.println("The sum is " + sum(num));
      
    }
    else if (ans ==5){
      
      average(num,sum);
      
    }
    
    else if (ans ==6){
      System.out.println("The maximum number is " + findMax (num));
      
    }
    
    else if (ans ==7){
      System.out.println("The minimum number is " + findMin (num));
      
    }
    else if (ans ==8){
      search(num);
      
    }
    else if (ans ==9){
      
      System.out.println("Do you want to use normal bubble sort or improved bubble sort? 1 for normal, 2 for improved ");
      int answer = sc.nextInt();
      
      if (answer ==1){
      sort(num);
      }
      
      else if (answer ==2){
        ImprovedBubble(num);
      }
      
      else {
        System.out.println("Invalid input, please try again");
        answer = sc.nextInt();
      }
      

    }

    
  }
  //}
  public static void initializeArray (ArrayList<Integer> num){
    for(int i=0;i<num.size();i++){
      num.add( -1 );
    }
  }
  
  public static void enterfromKeyboard (ArrayList<Integer> num){
    System.out.println("ENTER A NUMBER: enter -1 to exit");
    
    for (int i =0;i<10;i++){
      if (sc.hasNextInt()) {
      num.add(sc.nextInt());
      
    }
      if(num.get(i) == -1)
        break;
    }
    
    
    
  }
    
  public static void countWhole (ArrayList<Integer> num){
    int counter = 0;
    for(int i =0;i<num.size();i++){
      if (num.get(i) > 0) {
        counter++;
        
      }
    }
 
  System.out.println("There are " + counter + " whole numbers.");
}
  

  public static void display (ArrayList<Integer> num){
    System.out.print( "numbers in the order they are entered: ");
    for (int k = 0; k < num.size(); k++){
      System.out.print( num.get( k ) + ", "  );
    }
  }
  
  public static void displayReverse (ArrayList <Integer> num){
    System.out.print( "numbers in the reverse order they are entered: ");
    for (int k = num.size()-1; k >=0; k--){
      System.out.print( num.get( k ) + ", "  );
    }
  }
  
  public static int sum (ArrayList <Integer> num){
    int sum =0;
    for (int i=0;i<num.size();i++){
      sum += num.get(i);
    }
    return sum; 
  }
  
  public static void average (ArrayList <Integer> num, int sum){
    double average = 0;
    sum = sum(num);
    average = sum/num.size();
    
    System.out.println(String.format( "%.1f", average ));
  }
  
  public static int findMax (ArrayList <Integer> num){
    int max = num.get(0);
    
    for (int i=0;i<num.size();i++){
      if (num.get(i)> max){
        max = num.get(i);
      }
    } 
    
    return max; 
  }
  
  public static int findMin (ArrayList <Integer> num){
    int min =num.get(0);
    
    for (int i=0;i<num.size();i++){
      if (num.get(i) <min){
        min = num.get(i);
      }
    }
    
    return min; 
  }
  
  public static void search (ArrayList <Integer> num){
    
    System.out.println("Please enter a number you want to search:");
    int searchNum = sc.nextInt();
    boolean found = false; 
    
    for (int i=0;i<num.size();i++){
      if (num.get(i) == searchNum){
        System.out.print("The number " + searchNum+" is found in the positions " + i);
        found  = true;
      }
      
      
      
    }
    if (found == false){
      System.out.print( "404 not found");
      
    }
  }
  
  
  public static void sort (ArrayList <Integer> num){
    
    for (int i=0;i<num.size()-1;i++){
      for (int j=0;j<num.size()-1-i;j++){
        
        if (num.get(j+1) < num.get(j)){
          int temp = num.get(j);
          num.set(j,num.get(j+1) );
          num.set(j+1, temp); 
          
        }
        
      }

    
  }
    for(int i=0;i<num.size();i++){
      System.out.print(num.get(i) + ", ");
      
    }
  }
  
  public static void ImprovedBubble (ArrayList <Integer> num){
    
    int i = 0;
    boolean swapped = true;
    int temp = 0;
    while(swapped == true){
      
      swapped = false;
      i++;
      
      for (int j=0;j<num.size()-1;j++){
        if (num.get(j+1) < num.get(j)){
          temp = num.get(j);
          num.set(j, num.get(j+1));
          num.set(j+1, temp); 
          
          swapped= true;
        }
      }
    }
    
    for(int k=0;k<num.size();k++){
      System.out.print(num.get(k) + ", ");
      
    }
  }
}

