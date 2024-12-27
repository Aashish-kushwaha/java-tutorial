import java.util.Scanner;
class Factorial
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("eneter a number");
		int n=sc.nextInt();
		int sum=1;
		for(int i=n;i>0;i--)
		{
			sum=sum*i;
		}
		System.out.println("factorial:"+sum);
	}
}
