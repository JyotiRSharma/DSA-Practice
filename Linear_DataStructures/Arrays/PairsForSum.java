import java.util.HashSet;

class Test
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 4, 45, 6, 10, 8};

		/**
			Using Brute Force
		**/
		// for (int i = 0; i < arr.length; i++)
		// {
		// 	for (int j = i+1; j < arr.length; j++)
		// 	{
		// 		if (arr[i] + arr[j] == 16)
		// 		{
		// 			System.out.println(arr[i] + " " + arr[j]);
		// 		}
		// 	}
		// }

		/**
		Using HashSet
		**/

		HashSet<Integer> set = new HashSet<Integer>();
		int temp = 0;
		for (int i = 0; i < arr.length; i++)
		{
			temp = 10 - arr[i];
			if (set.contains(temp))
			{
				System.out.println(arr[i] + " " + temp);
			}

			set.add(arr[i]);
		}

	}

}
