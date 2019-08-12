package CodeSignal;

import java.util.*;

public class DifferentSymbolsNaiveClass {
	static int differentSymbolsNaive(String s) {
		List<Character> charList=new ArrayList<Character>(); 
		int differntSymCount=0;
		for(char c : s.toCharArray()) {
			if(!charList.contains(c)) {
				charList.add(c);
				differntSymCount++;
			}
		}
		return differntSymCount;
	}
	
	public static void main(String[] args) {
		String s="cabca";
		int differntSymCount=differentSymbolsNaive(s);
		System.out.println(differntSymCount);
	}

}
