import java.util.Scanner;
class FriendlyPair
{
	public static void main(String args[])
	{
		Scanner k = new Scanner(System.in);
		System.out.println("enter first number");
		int n1=k.nextInt();
		System.out.println("enter second number");
		int n2=k.nextInt();
		int sum1=n1;int sum2=n2;
		for(int i=1;i<=n1/2;++i)
		{
			sum1+=(n1%i==0?i:0);
		}
		for(int i=1;i<=n2/2;++i)
		{
			sum2+=(n2%i==0?i:0);
		}
		sum1/=n1;
		sum2/=n2;
		if(sum1==sum2) 
			System.out.println("Abundant Numbers");
		else 
			System.out.println("Not Abundant Numbers");
	
		
	}
}