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

class Marks extends Student
{
	Scanner s = new Scanner(System.in);

	int m1, m2, m3;
	
	void M_Details()
	{
		m1 = s.nextInt();
		m2 = s.nextInt();
		m3 = s.nextInt();
		s.nextLine();
	}
}

class Result extends Marks
{
	void display()
	{
		System.out.println("NAME :" + name);
		System.out.println("AGE :" + age);
		System.out.println("ROLL NO. :" + rollno);
		System.out.println("MARKS 1 :" + m1);
		System.out.println("MARKS 2 :" + m2);
		System.out.println("MARKS 3 :" + m3);
	}

	public static void main(String []args)
	{
		Result r = new Result();
		
		r.S_Details();
		r.M_Details();
		r.display();
	}

	
}
