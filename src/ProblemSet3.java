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

        // ps.sign();          // executes Exercise 1
        // ps.parity();        // executes Exercise 2
        // ps.ordered();       // executes Exercise 3
        // ps.gpa();           // executes Exercise 4
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

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

    }
}
