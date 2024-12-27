/* ARRAYS-->> an array is a group of like-typed variables that are referred to by  a common name.arrays of any type can be created.
one-dimensional arrays:
		Syntax: type array_name[];  // with this declaration we have array no array actually exist
		to link array_name with actual ,physical arrays of integers you must allocate one using "new".
what is "new"-->>the new operator is used in java to crete new objects. it can also be used to crete an array object.it is a special operator that allocates memory.

CORRECT SYNTAX:     type array_name[];
					array_name=new type[size];
						OR
					type array_name[][]=new type[size][size];

*/	
//WAP to calculte the sum of array;
class Arrays
{
	public static void main(String args[])
	{
		int sum=0;
		int arr[];
		arr=new int[4];
		arr[0]=12;
		arr[1]=32;
		arr[2]=14;
		arr[3]=62;
		
		for (int i=0;i<4;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array:"+sum);
	}
}
/*if we initiallize the array at a same time when we declare it then we do not need to write that extra line as given in below program*/
class Arrays1
{
	public static void main(String k[])
	{
		int sum=0;
		int a[]={12,23,34,56};
		for(int i=0;i<4;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of array:"+sum);
	}
}
	
	
