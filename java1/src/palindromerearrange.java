
public class palindromerearrange {
	public static void main(String args[])
	{
		int i=411,a,s=0;
		int[] b=new int[10];
		while(i>0)
		{
			a=i%10;
			b[a]++;
			i=i/10;
		}
		for(i=0;i<10;i++)
		{
	        if((b[i]&1)==1)
	        	s++;
	        if(s>1)
	        {
	        	System.out.print("NO");	
	        	System.exit(0);
	        }
	        
		}
		System.out.print("YES");
		
	}

}
