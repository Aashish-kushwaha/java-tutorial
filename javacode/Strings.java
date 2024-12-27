/* string is neither is a primitive datatype nor it is a simply an array of characters.
-->>rather, STRING defines an obeject that ar backed by a carh. since array are immutable ,strings are also immutable as well. whenever a change to astring is made, an entirely new string is created.
SYNTAX:  String str="this is a string";
here str is an object of type string.

string can also be also be declared using "new" operator i.e.dynamically allocated. in case of string they are assigned a new memory location in heap.
*/
class Strings
{
	public static void main(String []k)
	{
		//declare the string without using new operator
		String str="aashish ";
		//printing the string
		System.out.println("string:"+str);
		
		//declaring string using new operator
		String s=new String("aashish kushwaha");
		//printing the string
		System.out.println("string:"+s);
	}
}