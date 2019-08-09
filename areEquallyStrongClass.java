package CodeSignal;

public class areEquallyStrongClass {

	static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		boolean isEquallyStrong=false;
		
		if(yourLeft==friendsLeft||yourLeft==friendsRight) {
			if(yourRight==friendsLeft||yourRight==friendsRight) {
				isEquallyStrong=true;
			}
			else {
				isEquallyStrong=false;
			}
		}
		
		
		return isEquallyStrong;
	}
	
	public static void main(String[] args) {
		int yourLeft=10;
		int yourRight=15;
		int friendsLeft=15;
		int friendsRight=10;
		
		boolean isEquallyStrong=areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight);
		System.out.println(isEquallyStrong);
	}

}
