package org.datastructure.array;

public class ThirdMinElement {

	public int thirdMinx(int[] nums) {
        int n=nums.length;
        long min1=Long.MAX_VALUE;
        long min2=Long.MAX_VALUE;
        long min3=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min1==nums[i] || min2==nums[i] || min3==nums[i] ){
                continue;
            }
            if(min1>nums[i]){
                min3=min2;
                min2=min1;
                min1=nums[i];
            }else if(min2>nums[i]){
            	min3=min2;
            	min2=nums[i];
            }else if(min3>nums[i]){
            	min3=nums[i];
            }
        }

        if(min3==Long.MAX_VALUE){
            return (int)min1;
        }else{
            return (int)min3;
        }

       
    }

    public static void main(String [] args){
        int [] nums={2,2,3,4};
        ThirdMinElement sol=new ThirdMinElement();
        int thirdMax=sol.thirdMinx(nums);
        System.out.println(thirdMax);
    }


}
