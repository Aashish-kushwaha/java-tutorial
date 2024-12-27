/*java conversions
an automatic conversions take place if the following  conditions are met:
-->>the two type are comptible: we will follow thi heirarchy  BYTE->SHORT->INT ->LONG->FLOAT->DOUBLE
-->>the destination type is larger than the sorce type:there is no automatic conversion from the numeric types to CHAR or BOOLEAN.
*casting imcompatible types:to crete a conversion between two incompitable types,we must use casting
SYNTAX: (target-type) value
eg: int a;
	byte b;
	b=(byte)a;
*/
class Conversion
{
	public static void main(String []k)
	{
		byte b;
		int a=256;
		double d=323.142;
		
		System.out.println("conversion of int to byte:");
		b=(byte)a;
		System.out.println("a="+a+"b="+b);
		
		System.out.println("conversion of double to int:");
		a=(int)d;
		System.out.println("a="+a+"d="+d);
		
		System.out.println("conversion of double to byte:");
		b=(byte)d;
		System.out.println("b="+b+"d="+d);
	}
}
