public class scase
{
public static void main(String args[])
	{
				
		int i,n;
		double sum=0,avg;		
		n=Integer.parseInt(args[1]);
		switch(args[0])
		{
				
				
			case "sum":
			for(i=0;i<=n;i++)
			{
				sum=sum+i;
			}
			System.out.println(""+sum);
			break ;	
		
			case "avg":
			for(i=0;i<=n;i++)
			{
				sum=sum+i;
				
			}avg=sum/n;
			
			System.out.println(""+avg);
		        break;	
		
			case "odd":
			for(i=0;i<=n;i++)
			{
				if(i%2!=0)
				{System.out.println(""+i);}
			}
			break;	

			case "even":
			for(i=0;i<=n;i++)
			{
				if(i%2==0)
				{System.out.println(""+i);}
			}
			break;		
		}

	}
	
}
