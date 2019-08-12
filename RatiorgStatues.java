package CodeSignal;


public class RatiorgStatues {

	public static void main(String[] args) {
		
	int[] arr= {6,2,3,8};
	int temp=0;
	//first sort the elements
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
		
	//find the missing elements
	int start=arr[0];
	int statue_count=0;
	for(int i=1;i<arr.length;i++) {
		if(arr[i]-start!=1) {
			statue_count=statue_count+(arr[i]-start-1);
			
		}
		start=arr[i];
	}
	System.out.println("Statues required:"+statue_count);
	}

}
