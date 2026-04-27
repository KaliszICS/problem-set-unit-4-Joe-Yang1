/**

        * File: Problem set 4.0

        * Author: Joe Yang

        * Date Created: Apr 16, 2026

        * Date Last Modified: Apr 23, 2026

        */


import java.util.Scanner;
public class ProblemSet {

	public static void main(String args[]) {
	System.out.print("Welcome to the high - low guessing game ");
	
	Scanner input = new Scanner(System.in);
	System.out.print("How many rounds would you like to play?: ");

	int round = input.nextInt();
	int score = 0;

	for(int i = 1; i <= round; i++){
	System.out.print("\nCurrent rounds: " + i);

	System.out.println("Please select a Category: ");
	System.out.println("1.High (11 to 20)");
	System.out.println("2.Low (1 to 9)");
	System.out.println("3.Even (10)");


	int catChosen = input.nextInt();

	int num = (int)(Math.random()*20) + 1;
	String correct = "The number was " + num + "," + "You are correct.";
	String incorrect = "The number was " + num + "," + "You are incorrect";
	int option;

	if (num >= 11){
		option = 1;
	}
	else if (num <= 9){
		option = 2;
	}
	else {
		option = 3;
	}

	if (catChosen == option){
		System.out.println(correct);
		score++;
	}
	else {
		System.out.println(incorrect);
	}

	System.out.println("Current score: " + score);
	}


	System.out.println("\nTotal Score " + score);

	if (score >0 && score == round){
		System.out.println("Congratulations you won " + score + "out of " + round + " rounds right");
	}

	else {
		System.out.println("You didn't score all rounds this time, would you like to try again?");
	}


	}
	}



