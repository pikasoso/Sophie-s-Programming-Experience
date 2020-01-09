//package com.test;

/*Name:Sophie DU
 * Teacher: Mr.chu;
 * Description: This program records score for baseball games in two ways:
1. Direct User Input and print the final score onto console
2. Print the final scoreboard into a text file for convenient downloading 
 */

import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;

public class BaseBall {
	private String nameAway, nameHome;
	private Scanner sc = new Scanner(System.in);
	private int[] homeScore = new int[6];
	private int[] awayScore = new int[6];
	private int homeError, sumHomeError, homeHit, sumHomehit, sumHomescore = 0;
	private int awayError, sumAwayError, awayHit, sumAwayhit, sumAwayscore = 0;
	private int countHome, countAway = 0;
	private final int GAMEFRAME = 6;
	private boolean skipTurn = false;
	private PrintWriter output;
	private String format6 = "%-6s";
  private String format10 = "%-10s";

	public BaseBall(PrintWriter output) {
		this.output = output;
	}

	public void printMsg(String msg) {
		output.print(msg);
		System.out.print(msg);
	}

	public void printlnMsg(String msg) {
		output.println(msg);
		System.out.println(msg);
	}

	public void startGame() throws IOException {
		printMsg("Please enter the name of the away team: ");
		nameAway = sc.nextLine();

		printMsg("Please enter the name of the home team: ");
		nameHome = sc.nextLine();

		printlnMsg(nameAway + " and " + nameHome + " are ready to start the game!! "); // enter smth to start

		for (int i = 0; i < GAMEFRAME; i++) {
			awayTeam();
			if (i == GAMEFRAME - 1 && sumAwayscore < sumHomescore) {
				printlnMsg("The away team already has a lower score, the next inning for the hometeam will be skipped.");
				printlnMsg(nameHome + "won the game!");
			} else {
				homeTeam();
			}

			if ((sumAwayscore + 10) < sumHomescore || (sumHomescore + 10) < sumAwayscore) {
				skipTurn = true;
				printlnMsg("The game will end here, since one team has more than 10 scores than its opponent.");
				break;
			}

		}
		displayHome();
		if (sumAwayscore < sumHomescore) {
			printlnMsg(nameHome + " team, congratuation, you guys won the game!");
		} else if (sumAwayscore == sumHomescore) {
			printlnMsg(nameHome + " team and " + nameAway + " you guys tied in the game!");
		} else {
			printlnMsg(nameAway + " team, congratuation, you guys win the game!");
		}
	}

	public int getInteger() {
		while (true) {
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				printMsg("Please enter an integer: ");
			}
		}
	}

	public void awayTeam() throws IOException {
		printMsg("Please enter the runs scored of the " + nameAway + " team: ");

		awayScore[countAway] = getInteger();

		for (int i = countAway; i < awayScore.length; i++) {
			sumAwayscore = sumAwayscore + awayScore[i];
		}
		countAway++;

		printMsg("Please enter the hits of the " + nameAway + " team: ");
		awayHit = getInteger();
		sumAwayhit += awayHit;

		printMsg("Please enter the hits of the " + nameHome + " team: ");
		homeError = getInteger();
		sumHomeError += homeError;

		displayAway();
	}

	public void homeTeam() {
		printMsg("Please enter the runs scored of the " + nameHome + " team: ");
		homeScore[countHome] = getInteger();

		for (int i = countHome; i < homeScore.length; i++) {
			sumHomescore = sumHomescore + homeScore[i];
		}
		countHome++;

		printMsg("Please enter the hits of the " + nameHome + " team: ");
		homeHit = getInteger();
		sumHomehit += homeHit;

		printMsg("Please enter the hits of the " + nameAway + " team: ");
		awayError = getInteger();
		sumAwayError += awayError;

		if (skipTurn == false) {
			displayHome();
		}
	}

	public void displayAway() throws IOException {
    // Display header
    printlnMsg("-------------------------------------------------------------------------");
		printMsg(String.format(format10, "Name"));
		for (int x = 1; x < GAMEFRAME + 1; x++) {
			printMsg(String.format(format6, x));
		}
		printMsg(String.format(format10, "Final"));
		printMsg(String.format(format10, "Hits"));
		printlnMsg(String.format(format10, "Errors"));
    printlnMsg("-------------------------------------------------------------------------");

    // Display away score
		printMsg(String.format(format10, nameAway));
		for (int i = 0; i < awayScore.length; i++) {
			if (i < countAway) {
				printMsg(String.format(format6, awayScore[i]));
			} else {
				printMsg(String.format(format6, " "));
			}
		}
		if (countAway == 1) {
			printMsg(String.format(format10, sumAwayscore));
			printlnMsg(String.format(format10, sumAwayhit));
		} else {
			printMsg(String.format(format10, sumAwayscore));
			printMsg(String.format(format10, sumAwayhit));
			printlnMsg(String.format(format10, sumAwayError));
		}

    // Display home score
		printMsg(String.format(format10, nameHome));
		for (int i = 0; i < homeScore.length; i++) {
			if (i < countHome) {
				printMsg(String.format(format6,homeScore[i]));
			} else {
				printMsg(String.format(format6, " "));
			}
		}
		if (countAway == 1) {
      printMsg(String.format(format10, " "));
      printMsg(String.format(format10, " "));
			printlnMsg(String.format(format10, sumHomeError));
		} else {
			printMsg(String.format(format10, sumHomescore));
			printMsg(String.format(format10, sumHomehit));
			printlnMsg(String.format(format10, sumHomeError));
		}
		printlnMsg("");
	}

	public void displayHome() {
    // Display header
    printlnMsg("-------------------------------------------------------------------------");
		printMsg(String.format(format10, "Name"));
		for (int x = 1; x < GAMEFRAME + 1; x++) {
			printMsg(String.format(format6, x));
		}
		printMsg(String.format(format10, "Final"));
		printMsg(String.format(format10, "Hits"));
		printlnMsg(String.format(format10, "Errors"));
    printlnMsg("-------------------------------------------------------------------------");
    // Display away score
		printMsg(String.format(format10, nameAway));
		for (int i = 0; i < awayScore.length; i++) {
			if (i < countHome) {
				printMsg(String.format(format6, awayScore[i]));
			}
			else {
				if (skipTurn == true) {
					printMsg(String.format(format6, "X"));

				} else {
					printMsg(String.format(format6, " "));
				}
			}
		}
		printMsg(String.format(format10, sumAwayscore));
		printMsg(String.format(format10, sumAwayhit));
		printlnMsg(String.format(format10, sumAwayError));

    // Display home score
		printMsg(String.format(format10, nameHome));
		for (int i = 0; i < homeScore.length; i++) {
			if (i < countHome) {
				printMsg(String.format(format6, (homeScore[i])));
			} else {
				if (skipTurn == true) {
					printMsg(String.format(format6, "X"));

				} else {
					printMsg(String.format(format6, " "));
				}
			}
		}
		printMsg(String.format(format10, sumHomescore));
		printMsg(String.format(format10, sumHomehit));
		printlnMsg(String.format(format10, sumHomeError));
		printlnMsg("");
	}

	public static void main(String[] args) throws IOException {
		File myFile = new File("game_result.txt");
	  PrintWriter output = new PrintWriter(myFile, "UTF-8");
		BaseBall bb = new BaseBall(output);
		bb.startGame();
		output.close();
	}
}
