package org.datastructure.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {
		
		int[] arr = {4, 3, 1, 2};
		
		Arrays.sort(arr);
        int mnDiff = Integer.MAX_VALUE, n = arr.length;
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<n-1;i++){
            mnDiff = Math.min(mnDiff, arr[i+1] - arr[i]);
            
            h.add(arr[i]);
        }
        h.add(arr[n-1]);
       
        System.out.println(h);
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            if(h.contains(arr[i]-mnDiff)){
            	output.add(new ArrayList<Integer>(Arrays.asList(arr[i]-mnDiff, arr[i])));
            }
        }
        System.out.println(output);
	    
	    for(List<Integer> x: output){
	      System.out.println(x);
	    }
	}

}
