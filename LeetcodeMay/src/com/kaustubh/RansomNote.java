package com.kaustubh;

public class RansomNote {

	public static void main(String[] args) {
		RansomNote obj = new RansomNote();
		boolean res=obj.canConstruct("a", "b");
		System.out.println(res);

	}
	
    public boolean canConstruct(String ransomNote, String magazine) {
    	int magarr[] = new int[26];
    	for(int i=0;i<magazine.length();i++)
    	{
    		magarr[magazine.charAt(i)-'a']=magarr[magazine.charAt(i)-'a']+1;
    	}
    	
    	for(int i=0;i<ransomNote.length();i++)
    	{
    		if(magarr[ransomNote.charAt(i)-'a']>0)
    		{
    			magarr[ransomNote.charAt(i)-'a']=magarr[ransomNote.charAt(i)-'a']-1;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	return true;
        
    }

}
