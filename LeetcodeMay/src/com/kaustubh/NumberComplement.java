package com.kaustubh;

import java.util.ArrayList;

public class NumberComplement {

	public static void main(String[] args) {
		NumberComplement obj = new NumberComplement();
		int res= obj.findComplement(5);
		System.out.println(res);

	}
	
    public int findComplement(int num) {
    	int result=0;

    	int i=0;
    	while(num!=0)
    	{	
    		if(num%2==1)
    			result = (int) (result+ (0*Math.pow(2, i)));
    		else
    			result = (int) (result+ (1*Math.pow(2, i)));
    		i++;
    		num=num/2;
    	}
        return result;
    }

}
