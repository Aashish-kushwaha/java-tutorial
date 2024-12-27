/*multi dimensional array are implimented as arrays of arrays 
Syntax:  type array_name[][];
		 array_name=new type[size][size];
					OR
		type array_name[][]=new int[size][size];
		
*/
class Multiarray
{
	public static void main(String []args)
	{
		
		int i,j,k=0;
		int ma[][];
		ma=new int[4][5];
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
			{
				ma[i][j]=k;
				k++;
			}
		}
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(ma[i][j]+" ");
			}
			System.out.println();
		}
	}
}