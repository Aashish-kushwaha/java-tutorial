import java.util.Scanner;

class Student
{
	Scanner s = new Scanner(System.in);	

	String name;
	int age, rollno;

	void S_Details()
	{
		name = s.nextLine();
		age = s.nextInt();
		rollno = s.nextInt();
		s.nextLine();
	}
}

class cse extends Student
{
	Scanner s = new Scanner(System.in);
	String s1, s2, s3;
	
	void cse_Details()
	{
		s1 = s.nextLine();
		s2 = s.nextLine();
		s3 = s.nextLine();
		s.nextLine();
	}

	void display()
	{
		System.out.println("NAME :" + name);
		System.out.println("AGE :" + age);
		System.out.println("ROLL NO. :" + rollno);
		System.out.println("SUB 1 :" + s1);
		System.out.println("SUB 2 :" + s2);
		System.out.println("SUB 3 :" + s3);
	}

	public static void main(String []args)
	{
		cse ob = new cse();
		
		ob.S_Details();
		ob.cse_Details();
		ob.display();
	}
}

class civil extends Student
{
	Scanner s = new Scanner(System.in);
	String s1, s2, s3;
	
	void civil_Details()
	{
		s1 = s.nextLine();
		s2 = s.nextLine();
		s3 = s.nextLine();
		s.nextLine();
	}

	void display()
	{
		System.out.println("NAME :" + name);
		System.out.println("AGE :" + age);
		System.out.println("ROLL NO. :" + rollno);
		System.out.println("SUB 1 :" + s1);
		System.out.println("SUB 2 :" + s2);
		System.out.println("SUB 3 :" + s3);
	}

	public static void main(String []args)
	{
		civil ob = new civil();
		
		ob.S_Details();
		ob.civil_Details();
		ob.display();
	}
}
