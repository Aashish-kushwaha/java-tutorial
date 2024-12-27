import java.util.Scanner;
import java.util.Arrays;
class ZigZag
{
	public static void main(String args[])
	{
		Scanner k = new Scanner(System.in);
		int n=k.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;++i)
			ar[i]=k.nextInt();
		Arrays.sort(ar);
		int a=0;
		int b=n-1;
		while(a<b)
		{
			System.out.print(ar[a++]+ " "+ ar[b--] + " ");
		}
			
	}
}