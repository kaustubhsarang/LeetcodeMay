package com.kaustubh;

public class JewlsInStone {

	public static void main(String[] args) {
		JewlsInStone obj = new JewlsInStone();
		int res= obj.numJewelsInStones("aA","aAAbbbb");
		System.out.println(res);
	}
    public int numJewelsInStones(String J, String S) {
        int[] arr = new int[256];
        int count=0;
        for(int i=0;i<J.length();i++)
        {
            arr[J.charAt(i)]=1;
        }
        for(int i=0;i<S.length();i++)
        {
            if(arr[S.charAt(i)]==1)
                count++;
        }
        return count;
    }

}
