import java.util.*;

interface abc
{
	void accept_data();
	void calculate_data();
	void display_data();
}

abstract class Bank2 implements abc
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
	
	public void display_data()
	{
		System.out.println("account number:"+ac);
		System.out.println("name:"+name);
		System.out.println("contact number:"+cno);
		System.out.println("balance amount"+bal);
	}
	
}
class deposit extends Bank1{
	public void calculate_data()
	{
		bal=bal+add;
	}
	 public static void main(String []k)
	 {
		 deposit d=new deposit();
		 d.accept_data();
		 d.calculate_data();
		 d.display_data();
	 }
}




		
		