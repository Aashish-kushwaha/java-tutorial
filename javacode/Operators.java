class Operators
{
	public static void main(String []k)
	{
		//arithmatic operator on  integer
		System.out.println("integer srithmatic");
		int a=1+1;
		int b=a*3;
		int c=b/4;
		int d=c-a;
		int e=-d;
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("c ="+c);
		System.out.println("d ="+d);
		System.out.println("e ="+e);
		
		//arithamtic operator on floating
		System.out.println("floating point arithmatic");
		double da=1+1;
		double db=da*3;
		double dc=db/4;
		double dd=dc-da;
		double de=-dd;
		System.out.println("da ="+da);
		System.out.println("db ="+db);
		System.out.println("dc ="+dc);
		System.out.println("dd ="+dd);
		System.out.println("de ="+de);
		// Modulus operator
		int x=32;
		double y=45.23;
		System.out.println("x mod 10:"+ x%10);
		System.out.println("y mod 10:"+ y%10);
	}
}