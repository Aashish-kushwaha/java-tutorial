import java.util.Scanner;

class Pattern
{
	public static void main(String []k)
	{
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		int i=0;
		int count=0;
		int len=s.length();
		for(i=0;i<len;i++)
		{
			if(i<len && s.charAt(i)=='0')
			{
				i++;
				
				if(i<len && s.charAt(i)=='1')
				{
					i++;
					while(i<len &&s.charAt(i)=='1')
					{
						i++;
					}
					if(i<len && s.charAt(i)=='0')
					{
						count++;
						i--;
					}
				}
			}
		}
		System.out.println("count:"+count);
	}
}
	
				
			