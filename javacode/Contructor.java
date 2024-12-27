/* contructors:a constructor inintializes an object immediately upon ceation. it has the same name as the class in which it resides and is syntactically to a method
default constructor:once defined , the constructor is automatically called when the object is created, before the new operators completes.all non initialized instance variable will have their default values, which are zero.once you defined your own contructors the default contructors is no longer used.
paramterized contructor:contructor that take parameter as an arguement.
the implicit  return type of constructor is the class itself.
pra

*/
class Box1
{
	int width;
	int height;
	int depth;
	
	Box1(int w,int h,int d) //parameterized contructors
	{
		width=w;
		height=h;
		depth=d;
	}
	
	int volume()
	{
		return width*height*depth;
	}
}

class Box2
{
	public static void main(String []k)
	{
		Box1 ob=new Box1(10,20,30);
		int vol=ob.volume();
		System.out.println("volume is:"+vol);
	}
	
}
/*
garbage collection in java:as we know objects are dynamically alocated memory using new operator, so how such objects are destroyed and their memory is released for reallocation.
->> we don't need to take care of deallocation of memory java handles the deallocation for you atomatically. this technique is  called garbage collection.it works like that if no reference to an object exist, that object is assumed to be no longer neede, and the memor occupied can be reclaimed.
*/
	