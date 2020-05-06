package com.kaustubh;

public class FirstUniqueChar {

	public static void main(String[] args) {
		FirstUniqueChar obj = new FirstUniqueChar();
		int res=obj.firstUniqChar("loveleetvtccodde");
		System.out.println(res);

	}
    public int firstUniqChar(String s) {
       	int i;
       	int res=0;
       	boolean flag=false;
	int[] arr = new int[128];
	for(i=0;i<s.length();i++)
	{			
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;

			
	}

	for(i=0;i<s.length();i++)
	{
		if(arr[s.charAt(i)]==1)
		{
			return i;
		}
	}
	return -1; 

}

}
