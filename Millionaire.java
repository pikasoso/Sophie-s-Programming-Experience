import java.util.Random;
import java.util.Scanner;

public class Millionaire {
	public static String[][] questions = {
			{ "What is the 13th element on the periodic table?\na) Na\nb) K\nc) Mg\nd) Al",
					"What is the 15th element on the periodic table?\na) Na\nb) K\nc) P\nd) Al " },
			{ "What is an example of ionic compound?\na) H2O\nb) P2O5\nc) NaCl\nd) PCl4",
					"What is an example of molecule?\na) H2O\nb) MgCl2\nc) NaCl\nd) KOH" },
			{ "What is an example of diatomic molecule?\n a)Cl2\n b)H2O\n c)HCl\n d)P2O5",
					"What is not an example of diatomic molecule?\n a)Cl2\n b)H2\n c)N2\n d)P2O5" },
			{ "What is an example of a compound/molecule that has a pH > 7?\n a)KCl\n b)NaOH\n c)H2SO4\n d)Cl2",
					"What is an example of a compound/molecule that has a pH = 7?\n a)KCl\n b)NaOH \n c)H2SO4\n d)HCl" },
			{ "What is the chemical symbol of hydrogen peroxide?\n a)H2O2\n a)H2O\n c)HO2\n d)HO3",
					"What is the chemical symbol of hypochlorous acid?\n a)HClO2\n b)HClO3\n c)HClO\n d)HClO4" },
			{ "What is the chemical name of MnO4-?\n a)Manganate\n b)Magnesium tetroxide\n c) Manganese tetroxide\n d)Permanganate",
					"What is the chemical name of HCH3COO?\n a) Hydrogen acetic acid\n b)Hydrogen carbonate\n c) Acetic acid\n d)Acetate" },
			{ "Which of the following molecules has a tetrahedral e- distribution and a bent molecular shape?\n a)NH3\n b)PCl4\n c)H2O\n d)SiO2",
					"Which of the following molecules has a trigonal planar e- distribution and a bent molecular shape?\n a)NH3\n b)PCl4\n c)H20 \n d)SO2" },
			{ "Who is the scientist that designed the gold foil experiment to prove the existence of nucleus in an atom?\n a)Thomson\n b)Bohr\n c)Rutherford\n d)Dalton",
					"Who is the scientist that designed the cathode ray experiment to prove the existence of electrons in an atom?\n a)Thomson [Answer]\n b)Bohr\n c)Rutherford\n d)Dalton" },
			{ "What is the molar mass of H2O?\n a)10.00g/mol\n b)22.01g/mol\n c)18.02g/mol\n d)44.02g/mol",
					"What is the molar mass of CO2?\n a)10.00g/mol\n b)22.01g/mol\n c)18.01g/mol \n d)44.01g/mol" },
			{ "Which of the following are factors can increase the proportion of effective collisions of a reaction?\n a)Increase in concentration of reactants\n b)Increase in pressure of reactants\n c)Increase in surface area of reactants\n d)Increase in temperature.",
					"Which of the following are factors can increase the frequency of effective collisions of a reaction?\n a) Increase in concentration of solid reactants\n b) Addition of an  intermediate\n c) Addition of a catalyst.\n d) Increase in pressure of gaseous reactants." },
			{ "What is the purpose of a calorimeter?\n a) It is used to measure the enthalpy, the heat energy absorbed or emitted of a reaction.\n b)It is used to measure the heat gained of a reaction only chemical changes occur.\n c)It is used to measure the energy released by a reaction only physical changes occur.\n d)It is used measure the colour change of a reaction.",
					"What is the purpose of the equation Q = mc?t?\n a) It calculates the energy needed to complete a reaction.\n b) It calculates the energy needed to change the temperature of a substance.\n c) It calculates the energy needed to be released from a reactant of a reaction.\n d) It calculates the energy needed to be gained by a product of a reaction. " },
			{ "How many wavelengths can a hydrogen atom emit in a visible region of a spectrum?\n a)1\n b)3\n c)4\n d)2",
					"How many  wavelengths can a hydrogen atom emit in the infrared red region of a spectrum?\n a)1\n b)3\n c)4\n d)2" },
			{ "What is the formula that shows the relationship between the change in total reaction enthalpy and the energy gained/released by the solution?\n a) ?H = total energy - final energy\n b) ?H = - m c ?T\n c) ?H = m c ?T\n d) ?H = m n ?T ",
					"What is the formula that shows the relationship between the change in total reaction enthalpy (?H) and the molar enthalpy (?Hr) of a specific reactant/product?\n a) ?Hr = ?H/n\n b) ?Hr = ?H/(n-1)\n c) ?Hr = ?H x n\n d) ?Hr = ?H x n(n-1)" } };
	public static int[] wages = { 100, 200, 500, 1000, 2000, 5000, 10000, 20000, 50000, 100000, 200000, 500000,
			100000 };
	public static String[][] answers = { { "d", "c" }, { "c", "a" }, { "a", "d" }, { "b", "a" }, { "a", "c" },
			{ "d", "c" }, { "c", "d" }, { "c", "a" }, { "c", "d" }, { "d", "d" }, { "a", "b" }, { "c", "b" },
			{ "b", "a" } };
	public String[] lifelines = { "Audience: you can get the answer from the audience, accuracy about 75 percent.",
			"Friend: you can get the answer from your friend, accuracy about 50 percent.",
			"50/50: remove 2 incorrect answers." };
	public int lifelineCount = 0;

	public int choiceLifeline() {
		String lifelineType = "";
		int selectedLifeline = -1;
		System.out
				.print("You have " + (3 - lifelineCount) + " lifelines opportunity, do you want to use it? [Yes/No]: ");
		Scanner sc1 = new Scanner(System.in);
		String input = sc1.nextLine();
		if ("Yes".equals(input) || "yes".equals(input) || "Y".equals(input) || "y".equals(input)) {
			while (true) {
				System.out.println("Choice a lifeline way: ");
				int lifelineIndex = 1;
				for (int j = 0; j < 3; j++) {
					if (!"".equals(lifelines[j])) {
						System.out.println(lifelineIndex + ") " + lifelines[j]);
						lifelineIndex++;
					}
				}
				if (lifelineCount == 0) {
					System.out.print("Input lifeline index [1, 2, 3]: ");
				} else if (lifelineCount == 1) {
					System.out.print("Input lifeline index [1, 2]: ");
				} else if (lifelineCount == 2) {
					System.out.print("Input lifeline index [1]: ");
				}

				Scanner sc2 = new Scanner(System.in);
				lifelineType = sc2.nextLine();
				if ("1".equals(lifelineType) || "2".equals(lifelineType) || "3".equals(lifelineType)) {
					int selected = Integer.valueOf(lifelineType);
					for (int j = 0; j < 3; j++) {
						if (!"".equals(lifelines[j])) {
							selected--;
							if (selected == 0) {
								selectedLifeline = j;
								lifelines[j] = "";
							}
						}
					}
					break;
				} else {
					if (lifelineCount == 0) {
						System.out.print("Choice a correctly lifeline way, only 1 or 2 or 3 for your choice.");
					} else if (lifelineCount == 1) {
						System.out.print("Choice a correctly lifeline way, only 1 or 2 for your choice.");
					} else if (lifelineCount == 2) {
						System.out.print("Choice a correctly lifeline way, only 1 for your choice.");
					}

					System.out.println("");
					continue;
				}
			}
			lifelineCount++;
		}
		return selectedLifeline;
	}

	public static void main(String[] args) {

		String topName = "";
		int maxScore = 0;
		while (true) {
			Millionaire mill = new Millionaire();
			String[] answerIndex = { "a", "b", "c", "d" };
			int correctAnswers = 0;
			// Start game
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			int choicedQuestion = 0;



			System.out.println("Starting Millionaire game!!!");
			System.out.print("Please enter your username: ");
			String playerName = sc.nextLine();
			for (int i = 0; i < 13; i++) {
				choicedQuestion = random.nextInt(2);
				System.out.println("");
				System.out.println("-------------------Question[" + (i + 1) + "]-------------------");
				System.out.println(questions[i][choicedQuestion]);

				String lifelineType = "";
				int selectedLifeline = mill.choiceLifeline();

				if (selectedLifeline == 0) {
					boolean[] bool = new boolean[4];
					boolean lifelineSucceed = false;
					int randInt = 0;
					for (int j = 0; j < 3; j++) {
						do {
							randInt = random.nextInt(4);
						} while (bool[randInt]);
						bool[randInt] = true;
						if (answerIndex[randInt].equals(answers[i][choicedQuestion])) {
							correctAnswers++;
							lifelineSucceed = true;
							System.out.println("Answer correctly!");
							break;
						}
					}
					if (lifelineSucceed) {
						continue;
					} else {
						if (mill.lifelineCount < 3) {
							System.out.println("Emmm, answer incorrectly!");
							i--;
							continue;
						} else {
							correctAnswers = 0;
							System.out.println("Emmm, answer incorrectly!");
							System.out.println("Game over, you don't win Millionaire, you got nothing.");
							break;
						}
					}
				} else if (selectedLifeline == 1) {
					boolean[] bool = new boolean[4];
					boolean lifelineSucceed = false;
					int randInt = 0;
					for (int j = 0; j < 2; j++) {
						do {
							randInt = random.nextInt(4);
						} while (bool[randInt]);
						bool[randInt] = true;
						if (answerIndex[randInt].equals(answers[i][choicedQuestion])) {
							correctAnswers++;
							lifelineSucceed = true;
							System.out.println("Answer correctly!");
							break;
						}
					}
					if (lifelineSucceed) {
						continue;
					} else {
						if (mill.lifelineCount < 3) {
							System.out.println("Emmm, answer incorrectly!");
							i--;
							continue;
						} else {
							correctAnswers = 0;
							System.out.println("Emmm, answer incorrectly!");
							System.out.println("Game over, you don't win Millionaire, you got nothing.");
							break;
						}
					}
				} else if (selectedLifeline == 2) {
					boolean[] bool = new boolean[4];
					boolean lifelineSucceed = false;
					int randInt = 0;
					System.out.print("Incorrect answers [ ");
					for (int j = 0; j < 2; j++) {
						do {
							randInt = random.nextInt(4);
						} while (bool[randInt] || answerIndex[randInt].equals(answers[i][choicedQuestion]));
						bool[randInt] = true;
						System.out.print(answerIndex[randInt] + " ");
					}
					System.out.print("] have removed, choice a correct answer: ");
					Scanner sc7 = new Scanner(System.in);
					String choicedAnswer = sc7.nextLine();
					if (choicedAnswer.equals(answers[i][choicedQuestion])) {
						lifelineSucceed = true;
						correctAnswers++;
						System.out.println("Answer correctly!");
					}
					if (lifelineSucceed) {
						continue;
					} else {
						if (mill.lifelineCount < 3) {
							System.out.println("Emmm, answer incorrectly!");
							i--;
							continue;
						} else {
							correctAnswers = 0;
							System.out.println("Emmm, answer incorrectly!");
							System.out.println("Game over, you don't win Millionaire, you got nothing.");
							break;
						}
					}
				}
				// No lifeline
				System.out.println("");
				System.out.print("Choice a correct answer for question: ");
				Scanner sc8 = new Scanner(System.in);
				String choicedAnswer = sc8.nextLine();
				if (choicedAnswer.equals(answers[i][choicedQuestion])) {
					correctAnswers++;
					System.out.println("Answer correctly!");
					if (correctAnswers >= 6 && correctAnswers != 13) {
						System.out.print(
								"You have got $" + wages[correctAnswers - 1] + ", do you want continue?[Yes/No]:");
						Scanner sc9 = new Scanner(System.in);
						String input = sc9.nextLine();
						if ("No".equals(input) || "no".equals(input) || "N".equals(input) || "n".equals(input)) {
							System.out.println("Game over, you don't win Millionaire.");
							break;
						} else {
							continue;
						}
					}
				} else {
					if (mill.lifelineCount < 3) {
						continue;
					} else {
						correctAnswers = 0;
						System.out.println("Emmm, answer incorrectly!");
						System.out.println("Game over, you don't win Millionaire, you got nothing.");
						break;
					}
				}
			}

			int totalWage = 0;
			if (correctAnswers > 0) {
				totalWage = wages[correctAnswers - 1];
				if (correctAnswers == 13) {
					System.out.println("Congratinuelation, you are win the Millionaire, total wage is " + totalWage);
				} else {
					System.out.println(playerName + ", you got $" + totalWage);
				}
			}

			if (totalWage > maxScore) {
				maxScore = totalWage;
				topName = playerName;
				System.out.println(topName + ", you are the top 1 winner!");
			} else if (totalWage == maxScore) {
				maxScore = totalWage;
				topName = playerName;
				System.out.println(topName + ", you are the top 1 winner!");
				System.out.println(playerName + ", you also the top 1 winner along with " + topName + "."); // topName??

			} else {
				System.out.println("Sorry you are not the top 1 winner.");
				System.out.println("The top one winner is " + topName + " who won $" + maxScore + ".");
			}

			System.out.print("Do you want to play again? [Yes/No]: ");
			if (sc.hasNext()) {
				String input = sc.next();
				if (!"Yes".equals(input) && !"yes".equals(input) && !"Y".equals(input) && !"y".equals(input)) {
					sc.close();
					break;
				}
			}
		}
	}
}
