
public class FirstBadVersion {

	public static void main(String[] args) {
		FirstBadVersion obj = new FirstBadVersion();
		int res=obj.firstBadVersion(2126753390,1702766719);
		System.out.println(res);

	}
	
    public int firstBadVersion(int n, int bad) {
        long l=1;
        long r = n;
        long m = 0;
        boolean flag = false;
    	while(l<r)
    	{
    		m = (l+r)/2;
    		if(isBadVersion(m,bad))
    		{
    			r=m;
    			flag= true;
    		}
            else
            {
                l=m+1;
                if(flag)
                {
                    //return m+1;
                }
            }
    	}
        return (int)l;
    }
    
   public boolean isBadVersion(long m,long bad)
   {
	   if(m>=bad)
	   {
		   return true;
	   }
	   else {
		   return false;
	   }
   }

}
