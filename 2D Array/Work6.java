import java.util.Random;
import java.util.Scanner;

public class Work6{
   static Scanner sc = new Scanner (System.in);
   public static void main (String []args){
     Work6 work6 = new Work6();
     String diverNames[] = new String[5];
     int diverOrder[][] = new int[3][5];
     for (int i = 0; i < diverNames.length; i++) {
       System.out.println("Enter the name of diver:");
       diverNames[i] = sc.nextLine();
     }
     diverOrder[0] = work6.randomCommon(5);
   do {
    diverOrder[1] = work6.randomCommon(5);
    if (diverOrder[1][0] != diverOrder[0][0] && diverOrder[1][4] != diverOrder[0][4]) {
     break;
    }
   } while (true);
   do {
    diverOrder[2] = work6.randomCommon(5);
    if (diverOrder[2][0] != diverOrder[0][0] &&
      diverOrder[2][4] != diverOrder[0][4] &&
      diverOrder[2][0] != diverOrder[1][0] &&
      diverOrder[2][4] != diverOrder[1][4]) {
     break;
    }
   } while (true);
     System.out.println("Diving order as following:");
     for (int i = 0; i < 3; i++) {
    System.out.println("Order for round " + (i + 1));
    for (int j = 0; j < diverNames.length; j++) {
     System.out.print(diverNames[diverOrder[i][j]-1] + "    ");
    }
    System.out.println("");

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
