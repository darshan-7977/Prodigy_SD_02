package com.task2.RandomNumberGame;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int randomNumber = random.nextInt(100) + 1;
		int userGuess;
		int attempts = 0;

		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("Try to guess the number between 1 and 100.");

		do {
			System.out.print("Enter your guess: ");
			userGuess = sc.nextInt();
			attempts++;

			if (userGuess < randomNumber) {
				System.out.println("Too low! Try again.");
			} else if (userGuess > randomNumber) {
				System.out.println("Too high! Try again.");
			} else {
				System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
			}

		} while (userGuess != randomNumber);

		sc.close();
	}
}
