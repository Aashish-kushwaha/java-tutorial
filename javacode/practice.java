import java.util.*;
class Practice
{
			
	public static void main(String []args)
	{
		Scanner k=new Scanner(System.in);
		String s=k.nextLine();
		StringBuffer str=new StringBuffer(s);
		int i=0;
		
		while(i<str.length())
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				str.deleteCharAt(i);
			}
			else
			{
				i++;
			}
		}
		System.out.println("new string:"+str);
	}
}
		