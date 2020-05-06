package com.kaustubh;

import java.util.Arrays;

public class MajorityElem {

	public static void main(String[] args) {
		MajorityElem obj = new MajorityElem();
		int arr[] = {3,2,3};
		int res=obj.majorityElement(arr);
		System.out.println(res);
		

	}
	
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
return nums[nums.length/2];
}

}
