package CodeSignal;

public class CircleofNumbersClass {

	static int circleOfNumbers(int n, int firstNumber) {
		int radialOpposite=0;
		
		radialOpposite= n/2 + firstNumber;

		if(radialOpposite>=n)
		{
			radialOpposite = radialOpposite- n;
		}  
		
		return radialOpposite;
	}
	public static void main(String[] args) {
		int n=10;
		int firstNumber=2;
		
		int radialOpposite=circleOfNumbers(n, firstNumber);
		System.out.println(radialOpposite);
	}

}
