package dev.jaib.ds.pep.gettingstarted;

public class PatternMain
{
	public static void main(String[] args)
	{
		printZ();
	}

	public static void printZ()
	{
		for( int i = 1; i <= 5; i++ )
		{
			if( i == 1 || i ==5 )
			{
				for( int j = 1; j <= 5; j++ )
				{
					System.out.print("*");
				}
			}
			else
			{
				for( int j = 1; j <= 5 - i ; j++ )
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
