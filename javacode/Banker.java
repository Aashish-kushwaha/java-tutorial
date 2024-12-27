import java.util.Scanner;
class Banker
{
	banker(String st,
	public static void main(String []k)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter number of account holder:");
		n=sc.nextInt();
		
		
		Bank obj[]=new Bank[n];
		for(int i=0;i<n;i++)
		{
			Sc.nextLine();
			System.out.println("_________________________________________");
			System.out.println("enter user"+(i+1)+"details);
			System.out.println("enter Address");
			String add=sc.nextLine();
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter account number");
			int acc_no=sc.nextInt();
			System.out.println("enter balance amount");
			int bal=sc.nextInt();
			obj[i]=
			System.out.println("_________________________________________");
		}
		
		char c='y';
		
		while(c==y)
		{
			System.out.println("enter choice");
			System.out.println("1->print informatio of user");
			System.out.println("2->add amount");
			System.out.println("3->withdraw amount");
			System.out.println("change address");
			
			int c=sc.nextInt();
			
			switch(ch)
			{
				case 1: 
					System.out.println("enter user id");
					int id=sc.nextInt();
					obj[id-1001].get_info();
					