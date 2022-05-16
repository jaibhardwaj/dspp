package dev.jaib.ds.pep.beginner.multidimensionarrays;

public class MultiDimensionArrayMain
{
	public static void main(String[] args)
	{
		System.out.println("########### print2DArray ###########");
		print2DArray(3,4);
	}

	public static void print2DArray(int m, int n)
	{
		int[][] arr = new int[m][n];
		for( int i = 0; i < arr.length; i++ )
		{
			for( int j = 0; j < arr[i].length; j++ )
			{
				arr[i][j] = i + j;
			}
		}

		for( int[] ints : arr )
		{
			for( int anInt : ints )
			{
				System.out.print(anInt + " ");
			}
			System.out.println();
		}
	}
}
