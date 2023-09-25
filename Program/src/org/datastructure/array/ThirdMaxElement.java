package org.datastructure.array;

import org.datastructure.array.ThirdMaxElement;

public class ThirdMaxElement {
	public int thirdMax(int[] nums) {
        int n=nums.length;
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max1==nums[i] || max2==nums[i] || max2==nums[i] ){
                continue;
            }
            if(max1<nums[i]){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }else if(max2<nums[i]){
                max3=max2;
                max2=nums[i];
            }else if(max3<nums[i]){
                max3=nums[i];
            }
        }

        if(max3==Long.MIN_VALUE){
            return (int)max1;
        }else{
            return (int)max3;
        }

       
    }

    public static void main(String [] args){
        int [] nums={2,2,3,1};
        ThirdMaxElement sol=new ThirdMaxElement();
        int thirdMax=sol.thirdMax(nums);
        System.out.println(thirdMax);
    }

}
