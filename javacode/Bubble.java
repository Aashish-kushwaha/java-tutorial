class bubble
{
	public static void main(String []k)
	{
		int a[];
		a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(k[i]);
		}
		System.out.println("before sorting");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("after sorting");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}
	