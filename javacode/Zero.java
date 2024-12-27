import java.util.Scanner;
class Zero
{
	public static void main(String []k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		String s;
		s=sc.nextLine();
		String s2=s.replace('0','1');
		System.out.println(s2);
	}
}