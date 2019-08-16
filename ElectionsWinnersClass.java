package CodeSignal;

public class ElectionsWinnersClass {

	static int electionsWinners(int[] votes, int k) {
		int max = 0, n = 0;
	    
		for(int v:votes) {
	        if(v > max){
	            max = v;
	            n = 1;
	        }
	        else if(max == v)
	            n++;
	    }
	    if(k == 0 && n == 1)    
	        return 1;
	    else
	        n = 0;
	    for(int v:votes)
	        if(v + k > max)
	            n++;
	    return n;
	}
	
	public static void main(String[] args) {
		int[] votes= {2, 3, 5, 2};
		int k=3;
		int numberOfWinners=electionsWinners(votes, k);
		System.out.println(numberOfWinners);
	}

}
