class ScannerDemo
{
	public static void main(String []k)
	{
		
		Scanner sc=new Scanner(System.in);
		//enter string
		String name=sc.nextLine();
		//enter  character
		char c=sc.next().charAt(0);
		//enter int (age)
		int age=sc.nextInt();
		//enter double
		double cgpa=sc.nextDouble();
		
		System.out.println("name:"+name);
		System.out.println("gender:"+c);
		System.out.println("age:"+age);
		System.out.println("cgpa:"+cgpa);
		
	}
	
}

		