package higherlower;

public class HigherLower {

	private int number;
	
	public HigherLower(int number){
		this.number = number;
	}
	public boolean isEqual(int guess){
		return guess == number;
	}
	public boolean isHigher(int guess){
		return guess > number;
	}
	public boolean isLower(int guess){
		return guess < number;
	}
}