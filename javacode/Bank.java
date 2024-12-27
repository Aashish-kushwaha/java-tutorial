import java.util.Scanner;
 public class Bank
{
	public static void main(String []k)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for term deposit and 2 for recurring deposit");
		
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("enter principle amount");
				int p=sc.nextInt();
				System.out.println("enter rate of interest");
				int r=sc.nextInt();
				System.out.println("enter time period in years");
				int t=sc.nextInt();
				float mat=p*(1+(r/100))*t;
				System.out.println("maturity amount:"+ mat);
				break;
			case 2:
				System.out.println("enter monthly installment:");
				int n=sc.nextInt();
				System.out.println("enter rate of interest:");
				int rt=sc.nextInt();
				System.out.println("enter time period in months");
				int ti=sc.nextInt();
				float mat2=(n*ti)+(n*ti)*(ti*(ti+1)/2)*(rt/100)*(1/12);
				
				System.out.println("maturity amount:"+ mat2);
				break;
		}
	}
}

