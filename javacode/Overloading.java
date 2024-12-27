/*overloading:->>in java it is possible to define two or more methods within the same class that share the same name as long as their parameter declarartion are different.when this the case then the method is overloaded and the process is known as method overloading.methodd overloading is one of the ways that java supports POLYMORPHISM. */
class Overloading
{
	void test()
	{
		System.out.println("no parameter");
	}
	
	void test (int n)
	{
		System.out.println("number :"+n);
	}
	
	void test(int a,int b)
	{
		System.out.println("a and b:"+a+" "+b);
	}
	
	double test(double a)
	{
		return a*a;
	}
}

class overload
{
	public static void main(String []k)
	{
		Overloading ob=new Overloading();
		double result;
		ob.test();
		ob.test(10);
		ob.test(10,20);
		result=ob.test(123.33);
		System.out.println("result:"+result);
	}
}
/* we can also overload constructor method, osometime there is a need of initialing an onbject in different ways.this can be done using constructor overloading.
using this() reference can be used during constructor overloading to call default  constructor implicitly from parameterized constructor and also this() should be the first line inside the constructor.*/
// Java program to illustrate role of this() in
// Constructor Overloading
class Box
{
	double width, height, depth;
	int boxNo;

	// constructor used when all dimensions and
	// boxNo specified
	Box(double w, double h, double d, int num)
	{
		width = w;
		height = h;
		depth = d;
		boxNo = num;
	}

	// constructor used when no dimensions specified
	Box()
	{
		// an empty box
		width = height = depth = 0;
	}

	// constructor used when only boxNo specified
	Box(int num)
	{
		// this() is used for calling the default
		// constructor from parameterized constructor
		this();

		boxNo = num;
	}

	public static void main(String[] args)
	{
		// create box using only boxNo
		Box box1 = new Box(1);

		// getting initial width of box1
		System.out.println(box1.width);
	}
}
/*->if we have defined any parameterized constructor then compiler will ot ceate defualt constructor and vice versa
-->>recursive constructor calling is invalid.
*/
// using objects as parameters
class test
{
	int a,b;
	test(int i,int j)
	{
		a=i;
		b=j;
	}
	
	boolean equal(test o) //arguement is a obect of class test
	{
		if(o.a==a && o.b==b)
		{
			System.out.println("yes they are equal");
			return true;
		}
		else
		{
			System.out.println("no  they are not equal");
			return false;
		}
	}
	
}
class pass
{
	public static void main(String []k)
	{
		test ob1=new test(100,22);
		test ob2=new test(100,22);
		test ob3=new test(18,23);
		
		System.out.println("ob1==ob2:"+ob1.equal(ob2));
		System.out.println("ob1 ==ob3:"+ob1.equal(ob3));
		}
}