import java.util.*;
class Prime
{
	public static void main(String []k)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<num/2;i++)
		{
			if((num%i)==0)
			{
				flag=1;
			}			
		}
		if(flag==1)
				System.out.println("not a prime number");
		else
			System.out.println("is a prime number");


	}
}

				
		