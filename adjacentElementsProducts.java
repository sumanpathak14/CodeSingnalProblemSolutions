package CodeSignal;

import java.util.*;

public class adjacentElementsProducts {

	static int adjacentElementsProduct(int[] inputArray) {
		
		int len=inputArray.length;
		int maxProduct=0;
		int product=0;
		int k=0;
		maxProduct=inputArray[0]*inputArray[1];
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-1;j++) {
				product=inputArray[j]*inputArray[j+1];
				if(product>maxProduct) {
					maxProduct=product;
				}
			}
		}
				
		return maxProduct;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int highest_prod=adjacentElementsProduct(arr);
		System.out.println("Highest Product:"+highest_prod);
		sc.close();
	}

}
