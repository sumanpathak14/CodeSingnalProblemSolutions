package codesignal_interview;

public class IsCryptSolutionClass {
	static boolean isCryptSolution(String[] crypt, char[][] solution) {
		String[] values=new String[crypt.length];
		
		for(int i=0;i<crypt.length;i++) {
			char[] word=crypt[i].toCharArray();
			if (word.length==0) return false;
			values[i]="";
			for(int x=0;x<word.length;x++) {
				values[i]+=GetMappedCharacter(word[x], solution);
			}
			
		}
		
		if( HasLeadingZero(values[0])||HasLeadingZero(values[1])||HasLeadingZero(values[2]))return false;
		
		return Long.parseLong(values[0])+Long.parseLong(values[1])==Long.parseLong(values[2]);
	}
	
	static boolean HasLeadingZero(String value) {
		char[] chars=value.toCharArray();
		if(chars.length>1 && chars[0]=='0') return true;
		if(chars.length==0) return true;
		return false;
	}
	
	static char GetMappedCharacter(char c, char[][] map) {
		for(int i=0;i<map.length;i++) {
			if(map[i][0]==c) return map[i][1];
		}
		return '0';
	}
	
	public static void main(String[] args) {
		String[] crypt= {"SEND","MORE","MONEY"};
		char[][] solution = {{'O','0'},{'M','1'},{'Y','2'},{'E','5'},{'N','6'},{'D','7'}, 
				 {'R','8'}, 
				 {'S','9'}};
		
		boolean isSolution=isCryptSolution(crypt, solution);
		System.out.println(isSolution);
	}

}
