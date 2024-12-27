import java.util.*;

interface abc
{
	void accept_data();
	
}
interface xyz extends abc
{
	void calculate_data();
	void display_data();
}

class Bank4 implements xyz
{
	int ac;
	String name;
	int cno;
	int bal;
	int add;
	
	
	public void accept_data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter account number");
		ac=sc.nextInt();
		System.out.println("enter contact number:");
		cno=sc.nextInt();
		System.out.println("enter balance:");
		bal=sc.nextInt();
		System.out.println("enter amount :");
		add=sc.nextInt();
	}
	public void calculate_data()
	{
		bal=bal+add;
	}
	
	public void display_data()
	{
		System.out.println("account number:"+ac);
		System.out.println("name:"+name);
		System.out.println("contact number:"+cno);
		System.out.println("balance amount"+bal);
	}
	
	public static void main(String []k)
	 {
		  Bank4 d=new Bank4();
		 d.accept_data();
		 d.calculate_data();
		 d.display_data();
	 }
}





		
		
