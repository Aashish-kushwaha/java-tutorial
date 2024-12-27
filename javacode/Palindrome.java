import java.util.Scanner;
import java.lang.*;
class palindrome
{
	public static void main(String []k)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number:");
		int n=sc.nextInt();
		int no=n;
		int sum=0,rem;
		while(no>0)
		{
			rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		
		if(sum==n)
		{
			System.out.println("is palindrome");
		}else
		{
			System.out.println("not a palindrome");
		}
	}
}

		
		
		