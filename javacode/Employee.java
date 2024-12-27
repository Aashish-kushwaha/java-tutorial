import java.util.*;

interface abc
{
	void accept_data();
	void calculate_data();
	void display_data();
}

class Bank1 implements abc
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
	
}

class Employee1 implements abc
{
	int bs;
	String name;
	int hra;
	int da;
	int pf;
	int cno;
	
	
	public void accept_data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter basic salary");
		bs=sc.nextInt();
		System.out.println("enter contact number:");
		cno=sc.nextInt();
		System.out.println("enter hra");
		hra=sc.nextInt();
		System.out.println("enter da:");
		da=sc.nextInt();
		System.out.println("enter pf:");
		pf=sc.nextInt();
				
	}
	
	public void calculate_data()
	{
		bs=bs+hra+da-pf;
	}
	
	public void display_data()
	{
		System.out.println(" total salary"+bs);
		System.out.println("name:"+name);
		System.out.println("hra"+hra);
		System.out.println("da"+da);
		System.out.println("contact number:"+cno);
		System.out.println("pf"+pf);
	}
	public static void main(String []k)
	{
		Bank1 ob=new Bank1();
		ob.accept_data();
		ob.calculate_data();
	    ob.display_data();
		Employee1 ob1=new Employee1();
		ob1.accept_data();
		ob1.calculate_data();
	    ob1.display_data();
	}
}
		
		
		