package CodeSignal;

public class almostIncreasingSequence {

	static boolean almostIncreasingSequence(int[] sequence) {
	    int occur=0;
	    int first=0;
	    if(sequence.length==1){return true;}
	    
	    for(int j=0;j<sequence.length;j++){
	        	if(j+1<sequence.length) {
	        		if(sequence[j]>=sequence[j+1]){
		            	System.out.println("j>j+1:"+j);
		            	if(occur==0) {
			            	first=j;
			    	    }
		            	occur=occur+1;
		            }
	            
	        	}
	     }
	        
	    if(occur==1) {
	    	if(first-1>=0 && first+1<sequence.length-1) {
	    		//System.out.println("first:"+first);
	    		if(sequence[first-1]>=sequence[first+1] && sequence[first]>=sequence[first+2]) {
	    			return false;
	    		}
	    		else return true;
	    	}
	    }
	    if(occur>1){
	        return false;
	    }
	    else return true;
	}
	
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 3, 6};
		//int[] arr= {3, 5, 67, 98, 3};
		boolean test=almostIncreasingSequence(arr);
		
		System.out.println("Result is:"+test);

	}

}
