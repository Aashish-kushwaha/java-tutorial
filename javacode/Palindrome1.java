import java.util.Scanner;
class Palindrome1
{
	public static void main(String []k)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		int i=0,j,n,c=0;
		n=str1.length();
		String str2;
		str2=str1.substring(0,n);
		
		for(i=0,j=n;i<n;i++,j--)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				c++;
				break;
			}
		}
		if(c==0)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}
}
				