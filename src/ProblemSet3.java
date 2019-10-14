/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
      System.out.print("\nEnter an integer: ");
      int integer = in.nextInt();

      if (integer == 0){
        System.out.println("\nZero.");
      } else if (integer < 0) {
        System.out.println("\nNegative.");
      } else if (integer > 0) {
        System.out.println("\nPositive.");
      }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
      System.out.print("\nEnter an integer: ");
      int evenOrOdd = in.nextInt();

      if ((evenOrOdd % 2) == 0){
        System.out.println("\nEven.");
      } else if ((evenOrOdd % 2) != 0){
        System.out.println("\nOdd.");
      }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
      System.out.println("\nEnter three integers. ");

      System.out.print("\nEnter integer: ");
      int int1 = in.nextInt();
      System.out.print("Enter integer: ");
      int int2 = in.nextInt();
      System.out.print("Enter integer: ");
      int int3 = in.nextInt();
      in.nextLine();

      if (int1 > int2 && int2 > int3){
        System.out.println("\nStrictly decreasing.");
      } else if (int1 < int2 && int2 < int3){
        System.out.println("\nStrictly increasing.");
      } else if (int1 >= int2 && int2 >= int3 && int1 != int3){
        System.out.println("\nDecreasing.");
      } else if (int1 <= int2 && int2 <= int3 && int1 != int3){
        System.out.println("\nIncreasing.");
      } else if (int1 == int2 && int2 == int3){
        System.out.println("\nSame.");
      } else {
        System.out.println("\nUnordered.");
      }
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {
      final double A = 4.00;
      final double B = 3.00;
      final double C = 2.00;
      final double D = 1.00;
      final double F = 0.00;
      final double PLUS_MINUS = 0.33;

      System.out.print("\nEnter a letter grade: ");
      String letterGrade = in.nextLine();

      String letter = letterGrade.substring(0, 1);
      String plusMinus = letterGrade.substring(1);
      letter = letter.toUpperCase();

      double letterToGrade = 0;
      if (letter.equals("A")){
        letterToGrade = A;
      } else if (letter.equals("B")){
        letterToGrade = B;
      } else if (letter.equals("C")){
        letterToGrade = C;
      } else if (letter.equals("D")){
        letterToGrade = D;
      } else if (letter.equals("F")){
        letterToGrade = F;
      } else {
        System.out.println("\nThat's not a valid letter grade.\n");
      }

      double finalGrade = 0;
      if (plusMinus.equals("+") && letterToGrade != A){
        finalGrade = letterToGrade + PLUS_MINUS;
        System.out.printf("\n%s %.2f%s\n\n", "Your GPA is", finalGrade, ".");

      } else if (plusMinus.equals("-") && letterToGrade != A){
        finalGrade = letterToGrade - PLUS_MINUS;
        System.out.printf("\n%s %.2f%s\n\n", "Your GPA is", finalGrade, ".");

      } else if (plusMinus.equals("") || letterToGrade == A){
        finalGrade = letterToGrade;
        System.out.printf("\n%s %.2f%s\n\n", "Your GPA is", finalGrade, ".");

      } else {
        System.out.println("\nThat's not a valid letter grade.\n");
      }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
      System.out.print("\nEnter a grade: ");
      double pointGrade = in.nextInt();

      final double A_HIGHEST = 100;
      final double A_LOWEST = 90;
      final double B_HIGHEST = 89;
      final double B_LOWEST = 80;
      final double C_HIGHEST = 79;
      final double C_LOWEST = 70;
      final double D_HIGHEST = 69;
      final double D_LOWEST = 60;
      final double F_HIGHEST = 59;
      final double F_LOWEST = 0;

      String gradeLetter = "";
      if (pointGrade <= A_HIGHEST && pointGrade >= A_LOWEST){
        gradeLetter = "A";
      } else if (pointGrade <= B_HIGHEST && pointGrade >= B_LOWEST){
        gradeLetter = "B";
      } else if (pointGrade <= C_HIGHEST && pointGrade >= C_LOWEST){
        gradeLetter = "C";
      } else if (pointGrade <= D_HIGHEST && pointGrade >= D_LOWEST){
        gradeLetter = "D";
      } else if (pointGrade <= F_HIGHEST && pointGrade >= F_LOWEST){
        gradeLetter = "F";
      } else if (pointGrade > A_HIGHEST){
        System.out.println("\nGrades above 100 are invalid.\n");
      } else if (pointGrade < F_LOWEST){
        System.out.println("\nGrades below 0 are invalid.\n");
      }

      if (!gradeLetter.equals("")){
        String condition = (gradeLetter.equals("A")||gradeLetter.equals("F")) ? "an " + gradeLetter : "a " + gradeLetter;
        System.out.println("\nYou received " + condition + ".\n");
      }
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {
      System.out.print("\nEnter a card: ");
        String cardInput = in.nextLine().toUpperCase();
        String suit = String.valueOf(cardInput.charAt(1));
        String rank = String.valueOf(cardInput.charAt(0));

        switch (suit) {
            case "C":
                suit = "Clubs";
                break;
            case "D":
                suit = "Diamonds";
                break;
            case "H":
                suit = "Hearts";
                break;
            case "S":
                suit = "Spades";
                break;
        }

        switch (rank) {
            case "2":
                rank = "Two";
                break;
            case "3":
                rank = "Three";
                break;
            case "4":
                rank = "Four";
                break;
            case "5":
                rank = "Five";
                break;
            case "6":
                rank = "Six";
                break;
            case "7":
                rank = "Seven";
                break;
            case "8":
                rank = "Eight";
                break;
            case "9":
                rank = "Nine";
                break;
            case "T":
                rank = "Ten";
                break;
            case "J":
                rank = "Jack";
                break;
            case "Q":
                rank = "Queen";
                break;
            case "K":
                rank = "King";
                break;
            case "A":
                rank = "Ace";
                break;
        }
        System.out.printf("\n%s of %s.\n\n", rank, suit);
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
        System.out.print("\nEnter a year: ");
        long year = in.nextLong();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
          System.out.println("\n" + year + " is a leap year.");
        } else {
          System.out.println("\n" + year + " is not a leap year.\n");
        }
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {
      final int F_FREEZING_POINT = 32;
      		final int F_BOILING_POINT = 212;
      		final int C_FREEZING_POINT = 0;
      		final int C_BOILING_POINT = 100;

      		System.out.print("\nEnter a temperature: ");
      		double temperature = in.nextDouble();
      		System.out.print("Enter a scale: ");
      		in.nextLine();
      		String tempuratureScale = in.nextLine().toUpperCase();

      		if (!(tempuratureScale.equals("C")) && !(tempuratureScale.equals("F"))) {
      			System.out.println("\nThat's not a valid scale.");
      		}

      		if (tempuratureScale.equals("F")) {
      			if (temperature >= F_BOILING_POINT) {
      				System.out.println("\nGas.");
      			} else if (temperature <= F_FREEZING_POINT) {
      				System.out.println("\nSolid.");
      			} else if (temperature < F_BOILING_POINT && temperature > F_FREEZING_POINT) {
      				System.out.println("\nLiquid.");
      			}
      		}

      		if (tempuratureScale.equals("C")) {
      			if (temperature >= C_BOILING_POINT) {
      				System.out.println("\nGas.\n");
      			} else if (temperature <= C_FREEZING_POINT) {
      				System.out.println("\nSolid.\n");
      			} else if (temperature < C_BOILING_POINT && temperature > C_FREEZING_POINT) {
      				System.out.println("\nLiquid.\n");
      			}
      		}
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {
        System.out.print("\nEnter a month: ");
        String month = in.nextLine().toUpperCase();

    		switch (month) {
    			case "JANUARY":
    			case "JANU":
    			case "JAN":
    				System.out.println("\n31 days.");
    				break;
    			case "FEBRUARY":
    			case "FEBR":
    			case "FEB":
    				System.out.println("\n28 or 29 days.");
            break;
    			case "MARCH":
    			case "MARC":
    			case "MAR":
    				System.out.println("\n31 days.");
    				break;
    			case "APRIL":
    			case "APRI":
    			case "APR":
    				System.out.println("\n30 days.");
    				break;
    			case "MAY":
    				System.out.println("\n31 days.");
    				break;
    			case "JUNE":
    			case "JUN":
    				System.out.println("\n30 days.");
    	      break;
    			case "JULY":
    			case "JUL":
            System.out.println("\n31 days.");
            break;
    			case "AUGUST":
    			case "AUGU":
    			case "AUG":
	          System.out.println("\n31 days.");
	          break;
    			case "SEPTEMBER":
    			case "SEPT":
    			case "SEP":
            System.out.println("\n30 days.");
            break;
    			case "OCTOBER":
    			case "OCTO":
    			case "OCT":
            System.out.println("\n31 days.");
            break;
    			case "NOVEMBER":
    			case "NOVE":
    			case "NOV":
            System.out.println("\n30 days.");
            break;
    			case "DECEMBER":
    			case "DECE":
    			case "DEC":
            System.out.println("\n31 days.");
            break;
    			default:
            System.out.println("\nThat's not a valid month.");
            break;
    		}
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {
        final double OT_THRESHOLD = 40;
        final double OT_PAY_MULTIPLIER = 1.5;
    		double pay;
        double otHours;

        System.out.print("\nWage: ");
        double wage = in.nextDouble();
        System.out.print("Hours: ");
        double hours = in.nextDouble();

    		 if (wage < 0.00) {
             System.out.println("Your wage must be greater than or equal to $0.00/hour.");
         }
         if (hours < 0.0) {
             System.out.println("Your hours must be greater than or equal to 0.0.");
         }

         if (hours > OT_THRESHOLD) {
             otHours = hours - OT_THRESHOLD;
             pay = 40 * wage + otHours * OT_PAY_MULTIPLIER * wage;
             System.out.printf("\nYou'll make $%,.2f this week.\n\n\n", pay);
         } else {
             pay = hours * wage;
             System.out.printf("\nYou'll make $%,.2f this week.\n\n\n", pay);
         }
     }
}
