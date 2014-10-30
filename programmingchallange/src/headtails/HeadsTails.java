package headtails;

public class HeadsTails {
	
	private String coin;
	
	public HeadsTails(String coin){
		this.coin=coin;
	}
	public boolean isRight(String guess){
		return coin.equals(guess);
	}
}
