import java.util.Random;
import java.util.Scanner;

public class Work5{
   static Scanner sc = new Scanner (System.in);
   public static void main (String []args){
     Work5 work5 = new Work5();
     String diverNames[] = new String[5];
     int diverOrder[] = new int[5];
     boolean unique;
     for (int i = 0; i < diverNames.length; i++) {
       System.out.println("Enter the name of diver:");
       diverNames[i] = sc.nextLine();
     }
     
     for(int i=0;i<5;i++){
       unique =false;
       
       while(unique==false){
          Random random = new Random();
         diverOrder[i] = random.nextInt(5);
         unique =true;
         
         for(int j=0;j<i;j++){
           
           if (diverOrder[j] == diverOrder[i]){
             unique=false;
             break;
           }
         }
       }
     }
     ;
     System.out.println("Diving order as following:");
     for (int i = 0; i < diverOrder.length; i++) {
       System.out.println(diverNames[diverOrder[i]]); // minus 1 to the order number in order to get the index of diver's namme
     }

   }

   public int[] randomCommon(int n){
  Random random = new Random();
     int[] result = new int[n];
     int count = 0;
     while(count < n) {
         int num = (int) random.nextInt(n) + 1;
         boolean flag = true;
         for (int j = 0; j < n; j++) {
             if(num == result[j]){
                 flag = false;
                 break;
             }
         }
         if(flag){
             result[count] = num;
             count++;
         }
     }
     return result;
 }

 }
