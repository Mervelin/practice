package higherlower;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	
	public static void main(String ... args){
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			playGame(scanner);
			
			System.out.println("Do you want to play again? (y/n)");
			String input = scanner.nextLine();
			if(input.equals("n")){
				break;
			}
		}
		scanner.close();
	}
	
	public static void playGame(Scanner scanner) {
		
		int guesses = 0;
		int rand = ThreadLocalRandom.current().nextInt(10);
		HigherLower model = new HigherLower(rand+1);
		
		while(true){
			System.out.println("Guess a number between 1 and 10!");
		
			String input = scanner.nextLine();
			int guess = 0;
			try{
				guess = Integer.valueOf(input);
			
			if(model.isEqual(guess)){
				System.out.println("You guessed!");
				break;
			}
			else if(model.isHigher(guess)){
				System.out.println("Too high!");
			}
			else if(model.isLower(guess)){
				System.out.println("Too low!");
			}
			}
			catch(NumberFormatException e){
				System.out.println("Enter number next time!");
			}
			

		
		}
	}
}
