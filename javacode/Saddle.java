import java.util.Scanner;
class Saddle
{
	static boolean findSaddlePoint(int mat[][ ], int n)
	{
		for (int i = 0; i < n; i++)
		{
			int min_row = mat[i][0], col_ind = 0;
			for (int j = 1; j < n; j++)
			{
				if (min_row > mat[i][j])
				{
					min_row = mat[i][j];
					col_ind = j;
				}
			}
	
			
			int k;
			for (k = 0; k < n; k++)
	
				if (min_row < mat[k][col_ind])
					break;
	
			if (k == n)
			{
			System.out.println("Value of Saddle Point " + min_row);
			return true;
			}
		}
	
		return false;
	}
	
	public static void main(String[] args)
	{		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mat[][] = new int[n][n];
 
      System.out.println("Enter elements of  matrix");

      for (int c = 0; c < n; c++)
         for (int d = 0; d < n; d++)
            mat[c][d] = sc.nextInt();
		
		if (findSaddlePoint(mat, n) == false)
			System.out.println("No Saddle Point ");
	}
}
