import java.util.Arrays;
import java.util.Scanner;

class StrinK
{
	public static void main(String []k)
	{
		Scanner sc=new Scanner(System.in);
		
		String str1,str2;
		str1=sc.nextLine();
		str2=sc.nextLine();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()==str2.length())
		{
			char array1[]=str1.toCharArray();
			char array2[]=str2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			boolean result=Arrays.equals(array1,array2);
			
			if(result)
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("no");
			}
		}
		else
		{
							System.out.println("no");
		}
	}
}
			