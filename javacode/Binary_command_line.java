class Command_line
{
	public static void main(String []k)
	{
		int a[];
		a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(k[i]);
		}
		for(int j=0;j<5;j++)
		{
			System.out.println(a[j]);
		}
	}
}
