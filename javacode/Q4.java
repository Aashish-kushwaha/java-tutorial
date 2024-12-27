import java.util.Scanner;
class Q4
{
	public static void main(String []k)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	
	String s=String.valueOf(a);
	
	String s2=s.replace('0','1');
	System.out.println(s2);
}
}