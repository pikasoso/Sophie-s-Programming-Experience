import java.util.Random;
import java.util.Scanner;

public class ClackerSimple {
    public static void main(String[] args) {
        while(true) {
            int[] initNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            Random random = new Random();
            Scanner sc = new Scanner(System.in);
            int dice1, dice2 = 0;
            String playerName = "";
            int playRounds = 1;
            int coveredNum = 0;
            int coverChoice = 1;
            // Start game
            System.out.println("Starting new game!!!");
            System.out.print("Please enter your username: ");
            playerName = sc.nextLine();
            System.out.println("");
            System.out.println("1. Manually choosing values to cover up.");
            System.out.println("2. Randomly choosing value to cover up by computer.");
            System.out.println("---------------------------------------------------------------");
            while(true) {
                System.out.print("Choose a way to cover up [1 or 2]: ");
                coverChoice = sc.nextInt();
                if(coverChoice != 1 && coverChoice != 2) {
                    System.out.println("Your choice a invalid value, try again.");
                    continue;
                }
                break;
            }

            do {
                
                System.out.println("");
                System.out.println("Round: " + playRounds);
                System.out.println("===============================================================");
                System.out.println("");
                // Display number which is not covered
                System.out.println("Uncovered Numbers");
                System.out.println("---------------------------------------------------------------");
                for (int i = 0; i < initNum.length; i++) {
                    if(initNum[i] != 0) {
                        System.out.print(initNum[i] + " ");
                    } else {
                        System.out.print("* ");
                    }
                    if(i == 5) System.out.println("");
                }
                System.out.println("");

                // Roll dice, general 2 random numbers [1-6] to mock roll dice.
                dice1 = random.nextInt(6) + 1;
                dice2 = random.nextInt(6) + 1;
                System.out.println("");
                System.out.println("Dice Roll Result");
                System.out.println("---------------------------------------------------------------");
                System.out.println(" Individual values: [" + dice1 + ", " + dice2 + "]");
                System.out.println(" Sum value: " + (dice1 + dice2));

                if(coverChoice == 1) {
                    System.out.println("");
                    System.out.println("1. Use individual values");
                    System.out.println("2. Use sum value ");
                    System.out.println("---------------------------------------------------------------");
                    int coverValueChoice = 1;
                    while(true) {
                        System.out.print("Choose a value  [1 or 2]: ");
                        coverValueChoice = sc.nextInt();
                        if(coverValueChoice != 1 && coverValueChoice != 2) {
                            System.out.println("Your choice an invalid value, try again.");
                            continue;
                        } else {
                            if(coverValueChoice == 1) {
                                initNum[dice1 - 1] = 0;
                                initNum[dice2 - 1] = 0;
                                break;  
                            } else if(coverValueChoice == 2) {
                                if(dice1 + dice2 < 7) {
                                    System.out.println("The sum value is less than 7, please use individual values to cover up.");
                                    continue;   
                                } else {
                                    initNum[dice1 + dice2 - 1] = 0;
                                    break;
                                }
                            }  
                        }
                    }
                } else if(coverChoice == 2) {
                    if(initNum[dice1 - 1] == 0 && initNum[dice2 - 1] == 0) {
                        if(dice1 + dice2 >= 7) {
                            initNum[dice1 + dice2 - 1] = 0;
                        }
                    } else {
                        initNum[dice1 - 1] = 0;
                        initNum[dice2 - 1] = 0; 
                    }
                }

                playRounds++;
                // count covered number
                coveredNum = 0;
                for(int i = 0; i < 12; i++) {
                    if(initNum[i] == 0) {
                        coveredNum++;
                    }
                }
            } while(coveredNum<12);           

            System.out.println("");
            System.out.println("Hi " + playerName + ", game over, your score is " + playRounds);
            System.out.print("Do you want to play again? [Yes/No]: ");
            if (sc.hasNext()) {
                String input  = sc.next();
                if(! "Yes".equals(input) &&
                   ! "yes".equals(input) &&
                   ! "Y".equals(input) &&
                   ! "y".equals(input)) {
                    sc.close();
                    break;
                }
            }
        }
    }
}
