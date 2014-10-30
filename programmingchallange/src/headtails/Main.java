package headtails;

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
	public static void playGame(Scanner scanner){
		
		HeadsTails coin;
		boolean rand = ThreadLocalRandom.current().nextBoolean();
		if(rand){
			coin = new HeadsTails("head");
		} else {
			coin = new HeadsTails("tail");
		}
		while(true){
		System.out.println("Is it head or tail? (head/tail)");
		String input = scanner.nextLine();
		if(coin.isRight(input)){
			System.out.println("You are right!");
			break;
		} else {
			System.out.println("You are wrong!");
			break;
		}
		}
	}
}
