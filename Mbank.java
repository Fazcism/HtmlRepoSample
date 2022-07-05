package demopro;

public class Mbank {

	public static void main(String[] args)
	{ int pin =2004;
	if (pin== 2004)
	{
		double accbal = 5000,amt=1000;
		if(amt<accbal&&amt>0)
		{ 
			System.out.println("Amount widrawing "+ amt);
			accbal=accbal -amt;
			System.out.println("Balance "+accbal);
			
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
	else
	{
		System.out.println("Invalid pIn");
	}
		

	}

}
