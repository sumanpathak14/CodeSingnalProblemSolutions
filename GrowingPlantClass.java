package CodeSignal;

public class GrowingPlantClass {
	static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
		int daysNeeded=1;
		int currentHeight=0;
		while(currentHeight<desiredHeight) {
			currentHeight=currentHeight+upSpeed;
            if(currentHeight>=desiredHeight){
                return daysNeeded;
            }
			currentHeight=currentHeight-downSpeed;
			daysNeeded++;
		}
				
		return daysNeeded;
	}
	
	public static void main(String[] args) {
		int upSpeed= 10;
		int downSpeed= 9;
		int desiredHeight= 4;
		
		int daysNeeded=growingPlant(upSpeed, downSpeed, desiredHeight);
		
		System.out.println(daysNeeded);
	}

}
