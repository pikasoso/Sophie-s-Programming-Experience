/*Name: Sophie 
 * Teacher: Mrs. A
 * Description: Level 1
 * Date: Sept7, 2018
 */
import java.util.Scanner;
public class arrayLevel1{
  static Scanner sc = new Scanner (System.in);
  static final int MAX =10;
  
  public static void main (String []args){
    
    int[] num = new int[MAX];
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
    System.out.println("9. Find mean, median and mode");
    System.out.println("10. Sort the integers in ascending order");
    
    
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
    else if (ans ==10){
      
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
      
      System.out.println("The entered numbers in ascending order is ");
      for (int i=0;i<MAX;i++){
        System.out.print( num[i] +", ");
      }
    }
    else if (ans==9){
      centralTendency(num,sum);
    }
    
  }
  //}
  public static void initializeArray (int[] num){
    for (int i=0;i<MAX;i++){
      num [i] = -1;
      
    }
  }
  
  public static void enterfromKeyboard (int[] num){
    System.out.println("Please enter 10 integers between 1 to 100:");
    for (int i=0;i<MAX;i++){
      num [i] = sc.nextInt();
      
      if (num[i] >100 || num[i] <0){
        System.out.println("Invalid input, please try again:");
        num [i] = sc.nextInt();
      }
    }
  }
  
  public static void countWhole (int[] num){
    int counter = 0;
    for (int i=0;i<MAX;i++){
      
      if (num[i] > 0) {
        counter++;
        
      }
    }
    System.out.println("There are " + counter + " whole numbers.");
  }
  
  public static void display (int[] num){
    System.out.print( "numbers in the order they are entered: ");
    for (int i=0;i<MAX;i++){
      System.out.print( num[i] + ", ");
    }
  }
  
  public static void displayReverse (int[] num){
    System.out.print( "numbers in the reverse order they are entered: ");
    for (int i=MAX-1;i>=0;i--){
      System.out.print( num[i] + ", ");
    }
  }
  
  public static int sum (int[] num){
    int sum =0;
    for (int i=0;i<MAX;i++){
      sum += num [i];
    }
    return sum; 
  }
  
  public static void average (int [] num, int sum){
    double average = 0;
    sum = sum(num);
    average = sum/MAX;
    
    System.out.println(String.format( "%.1f", average ));
  }
  
  public static int findMax (int []num){
    int max = num[0];
    
    for (int i=0;i<MAX;i++){
      if (num [i] > max){
        max = num[i];
      }
    } 
    
    return max; 
  }
  
  public static int findMin (int []num){
    int min =num[0];
    
    for (int i=1;i<MAX;i++){
      if (min > num [i]){
        min = num[i];
      }
    }
    
    return min; 
  }
  
  public static void search (int []num){
    
    System.out.println("Please enter a number you want to search:");
    int searchNum = sc.nextInt();
    
    for (int i=0;i<MAX;i++){
      if (num[i] == searchNum){
        System.out.println("The number " + num[i]+" is found in the positions " + i);
      }
      else {
        System.out.println("The number you entered does not exit");
        
      }
    }
  }
  
  public static void sort (int [ ] num){
    
    for (int i=0;i<MAX-1;i++){
      for (int j=0;j<MAX-1-i;j++){
        
        if (num [j+1] < num [j]){
          int temp = num [j];
          num[j] = num[j+1];
          num [j+1] = temp; 
          
        }
        
      }

    
  }
  }
  public static void centralTendency (int []num, int sum){
    
    for (int i=0;i<MAX;i++){
      sum+=num[i];
    }
    
    double mean = sum/MAX;
    
    
    sort(num);
    double median = (num [5] + num[6])/2;
    
    int mode = num[0];
    int maxCount = 0;
    
    for (int i = 0; i < MAX; i++) {
      int value = num[i];
      int count = 1;
      for (int j = 0; j < num.length; j++) {
        if (num[j] == value) 
          count++;
        if (count > maxCount) {
          mode = value;
          maxCount = count;
        }
        else {
          
          mode = -1;
        }
      }
    }
    
    if (mode ==-1){
      System.out.println("There is no mode value.");
      System.out.println("The mean value is " + mean +", the median value is "+median+".");
    }
    
    else {  
      System.out.println("The mean value is " + mean +", the median value is "+median+", the mode value is "+ mode+".");
    }
  }
  
  
  public static void ImprovedBubble (int [ ] num){
    
    int i =0;
    boolean swapped = true;
    int temp = 0;
    while(swapped == true){
      
      swapped = false;
      i++;
      
      for (int j=0;j<num.length-1;j++){
        if (num [j+1] < num [j]){
          temp = num [j];
          num[j] = num[j+1];
          num [j+1] = temp; 
          
          swapped= true;
        }
      }
    }
  }
}

