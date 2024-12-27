package pack;
public class my_pack
{
	public void show()
	{
		System.out.println("user defined package"); 
	}
	
	void show1()  // cannot access
	{
		System.out.println("hello");
	}
	
	protected void read()
	{
		System.out.println("c++ is better");
	}
	
	public static void main(String []k)
	{
		System.out.println("main method of package");
	}
}
class another
{
	public static void main(String []k)
	{
		System.out.println("this is another class");
	}
}

class pocket extends my_pack
{
	public void read1()
	{
		System.out.println("this extends my_class");
	}
}



