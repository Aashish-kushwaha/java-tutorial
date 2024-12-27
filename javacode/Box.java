/* class :->>the class is at the core of java. the class forms the basis for the oop in java.
->>main() method encapsulated in the class 
the most imported thing is that it defines a new data types.Thus a class is a template for an object, and an object is an instance of a class. 
A class is declared by use of the class keyword.
->the data or variables, defined within a class are called instance variables.
->the methods and variables defined within a class are called memebers of the class.
->> java classes do not need to have a  mani() method.
e.g class Box{
	double width;
	double height;
	double depth;
}
object creation: Box ob= new Box;
	ob.width=100;
	ob.height=89;
	ob.depth=78;
	
	new operator: it dynamically allocates(allocation is done in runtime) memory for an object and returns a refrenece to it. this reference is essentially, the address in memory of the object allocated by new.this reference is then stored in the variable.
	SYntax:  class_name object_name; //declare reference to oject
			 object_name=new class_name();  //allocate a box object
			 
			 class_name is the name of the class that is being intantiated the class_name followed by the parentesis specifies the constructor for the class.
			 -->> contructors defines what occurs when an object of a class is created. however if no explicit constructor is specified, then java will automatically supply a default contructor.
	
	
*/
class Box
{
	double width;
	double height;
	double depth;
	void volume()
	{
		System.out.print("volume is:");
		System.out.println(width*height*depth);
	}
	
	
}

class BoxDemo
{
	public static void main(String []k)
	{
		Box ob=new Box();
		ob.width=10;
		ob.height=30;
		ob.depth=15;
		ob.volume();
	}
}
