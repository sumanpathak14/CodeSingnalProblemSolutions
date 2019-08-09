package CodeSignal;

public class ArrayChangeClass {

	static int arrayChange(int[] inputArray) {
		int stepsReq=0;
		
		for(int i=0;i<inputArray.length;i++) {
			if(i+1<inputArray.length) {
				if(inputArray[i]>=inputArray[i+1]) {
					while(inputArray[i+1]<=inputArray[i]) {
						stepsReq++;
						inputArray[i+1]++;
						
					}
				}
			}
		}
		
		return stepsReq;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,1,1};
		int stepsRequired=arrayChange(arr);
		System.out.println(stepsRequired);
	}

}
