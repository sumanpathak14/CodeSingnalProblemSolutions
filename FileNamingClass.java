package CodeSignal;

import java.util.HashSet;
import java.util.Set;

public class FileNamingClass {

	static String[] fileNaming(String[] names) {
		Set<String> set = new HashSet<>();
		String[] fileNames = new String[names.length];
		
		
		for(int i = 0; i < names.length; i++) {
			String name = names[i];
			if(!set.contains(name)) {
				set.add(name);
				fileNames[i] = name;
			}
			else {
				int k = 0;
				String newName = name;
				while(set.contains(newName)) {
					k++;
					newName = name + "(" + k + ")";
				}
				
				set.add(newName);
				fileNames[i] = newName;
	
			}
	
		}
		
		
		return fileNames;
	}
	
	public static void main(String[] args) {
		String[] names= {"doc","doc","image","doc(1)","doc"};
		String[] fileNames=fileNaming(names);
		for(String name:fileNames) {
			System.out.println(name);
		}
	}

}
