package CodeSignal;

public class ArrayReplaceClass {

	static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
		int[] result=new int[inputArray.length];
		
		for(int i=0;i<inputArray.length;i++) {
			result[i]=inputArray[i];
			if(inputArray[i]==elemToReplace) {
				result[i]=substitutionElem;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] inputArray= {1,2,1};
		int elemToReplace=1;
		int substitutionElem=3;
		int[] result=arrayReplace(inputArray, elemToReplace, substitutionElem);
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}

}
