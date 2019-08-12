package CodeSignal;

public class KnapSackLightClass {

	static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
		int maxValue=0;
		
		if(weight1+weight2<=maxW) {
			maxValue=value1+value2;
		}else if (weight1<=maxW && value1>value2) {
			maxValue=value1;
		}else if (weight2<=maxW && value2>value1){maxValue=value2;}
		else if(value1==value2) {
			maxValue=value1;
		}else if(weight1<=maxW && weight2<=maxW) {
			if(value1>value2) {
				maxValue=value1;
			}
			else {
				maxValue=value2;
			}
		}else if(weight1>maxW&& weight2<=maxW){maxValue=value2;}
        else if(weight2>maxW&& weight1<=maxW){maxValue=value1;}
        else if(weight1>maxW && weight2>maxW){maxValue=0;}
		
		return maxValue;
	}
	
	public static void main(String[] args) {
		int value1= 10;
		int weight1= 5;
		int value2= 6;
		int weight2= 4;
		int maxW= 8;
		
		int maxValue=knapsackLight(value1, weight1, value2, weight2, maxW);
		System.out.println(maxValue);
		
	}

}
