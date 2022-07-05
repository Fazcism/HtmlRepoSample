package demopro;

public class Simple 
{

	public static void main(String[] args) 
	{
		int n = 8,a=0,b=1,c=0;
		if (n==1)
		{
			System.out.println(a);
		}
		else 
		{
			System.out.println(a);
			System.out.println(b);
		 n=n-2;
		while(n>1)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			n--;
		}
		}

	}

}
