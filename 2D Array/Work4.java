import java.util.Scanner;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;

public class Work4 {
 static Scanner sc = new Scanner (System.in);
 public static void main(String args[]) {
  try {
   int inputNum[] = new int[4];
   String countNum[] = {"", "", "", ""};
   String pathname = "input.txt";


   for (int i = 0; i < inputNum.length; i++) {
    System.out.println("Enter 4 unique numbers:");
    inputNum[i] = sc.nextInt();
   }

   File filename = new File(pathname);
   InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
   BufferedReader br = new BufferedReader(reader);
   String line = "";
   line = br.readLine();
   
   while (line != null) {
    for (int i = 0; i < inputNum.length; i++) {
     if (Integer.parseInt(line) == inputNum[i]) {
      countNum[i] = countNum[i] + "*";
     }
    }
    line = br.readLine();
   }
   int mostNum = inputNum[0];
   int mostCount = countNum[0].length();
   
   for (int i = 0; i < inputNum.length; i++) {
    System.out.println(inputNum[i] + ": " + countNum[i]);
    if (countNum[i].length() > mostCount) {
     mostNum = inputNum[i];
     mostCount = countNum[i].length();
    }
   }
   System.out.println("The most common number chosen was " + mostNum);

  } catch (Exception e) {
   e.printStackTrace();
  }
 }
}
