package com.kaustubh;

public class PerfectSquare {

	public static void main(String[] args) {
		PerfectSquare obj = new PerfectSquare();
		System.out.println(obj.isPerfectSquare(4));

	}
	
    public boolean isPerfectSquare(int num) {
        
        int left = 2;
        int right = num/2;
        if(num<left)
        	return true;
        while(left<=right)
        {
        	int x= (left+right)/2;
        	if(x*x==num)
        		return true;
        	else if(x*x<num)
        		left++;
        	else
        		right--;
        }
        return false;
    }

}
