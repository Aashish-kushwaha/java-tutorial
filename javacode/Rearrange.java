import java.util.Scanner;
class Rearrange
{
	public static void main(String args[])
	{
		Scanner k = new Scanner(System.in);
		int n=k.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;++i)
			ar[i]=k.nextInt();
		int a=0,b=0;
		for(int i=0;i<n;++i)
		{
			while(a<n&&ar[a]<0) 
				++a;
			while(b<n&&ar[b]>=0) 
				++b;
			if(a>=n||b>=n) 
				break;
			int copy=ar[a];
			ar[a]=ar[b];
			ar[b]=copy;
		
		
		}
		for(int i=0;i<n;++i) 
			System.out.print(ar[i]+ " ");
	}
}