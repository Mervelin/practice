package namegenerator;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class NameGenerator {
	public static void main(String[] args){
		
	String[] list1 = new String[] {"Ciecho","Miro","S³awo","Dobro"};
	String[] list2 = new String[] {"s³aw", "mir", "bor", "wit"};
	
	List<String> listone = Arrays.asList(list1);
	List<String> listtwo = Arrays.asList(list2);
	
	NameGenerator obj = new NameGenerator();
	
	System.out.println(obj.getRandomList(listone,listtwo));
	}
	
	public String getRandomList(List<String> listone, List<String> listtwo){
		int index1 = ThreadLocalRandom.current().nextInt(listone.size());
		int index2 = ThreadLocalRandom.current().nextInt(listtwo.size());
		String name = listone.get(index1)+listtwo.get(index2);
		return name;
	}
}