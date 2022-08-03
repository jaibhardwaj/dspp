package dev.jaib.ds.pep.beginner.string;

public class StringMain
{
	public static void main(String[] args)
	{
		printSubsetsOfString("abc");
	}

	public static void printSubsetsOfString(String str)
	{
		int length = str.length();
		int limit = (int) Math.pow(2, length);

		for( int i = 0; i < limit; i++ )
		{
			StringBuilder set = new StringBuilder();
			int temp  = i;

			for( int j = length - 1; j >= 0 ; j-- )
			{
				int r = temp % 2;
				temp = temp / 2;

				if( r == 0 )
				{
					set.insert(0, "-" + "\t");
				}
				else
				{
					set.insert(0, str.charAt(j) + "\t");
				}
			}

			System.out.println(set);
		}
	}
}
