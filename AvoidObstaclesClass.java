package CodeSignal;

import java.util.ArrayList;
import java.util.*;

public class AvoidObstaclesClass {
	static int avoidObstacles(int[] inputArray) {
		int jump=1;
		for(jump=1;jump<1000;jump++) {
			int i=0;
			for(;i<inputArray.length;i++) {
				if(inputArray[i]%jump==0) {
					System.out.println("broke:"+inputArray[i]);
					break;
				}
			}
			if(i==inputArray.length) {return jump;}
		}
		
		return jump;
	}
	
	
	public static void main(String[] args) {
		int[] inputArray= {5,3,6,7,9};
		int stepsRequired=avoidObstacles(inputArray);
		System.out.println(stepsRequired);
	}

}
