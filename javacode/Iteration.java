/* 1.while
2. do-while
3. for
while: syntax: while(condition)
                {
					//body of loop
				}
			the condition can be any boolean expression
			
*/
class While
{
	public static void main(String []k)
	{
		int n=10;
		while(n>0)
		{
			System.out.println("tick "+n);
			n--;
		}
	}
}
/* do-while
	Syntax:  do{
				// body of loop
	           } while(condition);
*/
class Dowhile
{
	public static void main(String []k)
	{
		int n=10;
		do{
			System.out.println("tick "+n);
			n--;
		}while(n>0);
	}
}

/* 
Syntax: for(initializatin;condition;iteration)
        {
			//body
		}
*/

class ForLoop
{
	public static void main(String []k)
	{
		int  n;
		for( n=10;n>0;n--)
		{
			System.out.println("tick "+n);
		}
	}
}

/* 
for-each version of the for loop
Syntax :
for(type itr-var:collectiom) statement-block
 here type specifies the the data types
 and itr-var is a iteration variable specifies the name
 ** with each iteration of the loop the next element in the collection is retrieved and stored in itr-var.Loop repeats untill all the elemnet in the collection have been obtained
 **
*/
class ForEach
{
	public static void main(String []k)
	{
		int nums[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		for(int x:nums)
		{
			System.out.println("value is "+x);
			sum=sum+x;
		}
		System.out.println("sum :"+sum);
	}
}
// however the loop can be terminated the loop early by using BREAK
class ForEach1
{
	public static void main(String []k)
	{
		int sum=0;
		int nums[]={1,2,3,4,5,6,7,8,9,10};
		
		for(int x:nums){
			System.out.println("value is :" +x);
		sum+=x;
		if(x==5)
			break;
		}
		System.out.println("sum:"+sum);
	}
}
//iteration variables is "read only" as it relates to the underlying array
class Nochange
{
	public static void main(String []k)
	{
		int nums[]={1,2,3,4,5,6,7,8,9,10};
		
		for(int x:nums)
		{
			System.out.println(x +" ");
			x=x*10;
		}
	}
}
/*
iterating over Multidimensional arrays
in java multidimensional array consist of arrays of array. we can understand the concept with the example: in two dimensional array, the iteration variable must be a reference variable to a one dimensional array.
*/

class ForEach3
{
	public static void main(String []k)
	{
		int sum=0;
		int nums[][]= new int[3][5];
		
		for(int i=0;i<3;i++)
			for(int j=0;j<5;j++)
			{
				nums[i][j]=(i+1)*(j+1);
			}
			
		for(int x[]: nums)
		{
			for(int y: x)
			{
				System.out.println("value is : "+y);
				sum=sum+y;
			}
		}
		System.out.println("sum:"+sum);
	}
}

		
				