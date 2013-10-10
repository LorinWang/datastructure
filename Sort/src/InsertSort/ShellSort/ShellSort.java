package InsertSort.ShellSort;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-10-9
 * Time: 下午11:50
 */
public class ShellSort
{
	public static void shellSort(int[] data)
	{
		System.out.println("start sorting");
		int arrayLength = data.length;
		int h = 1;
		while (h <= arrayLength / 3)
		{
			h = h * 3 + 1;
		}
		while (h > 0)
		{
			System.out.println("===h value:" + h + "=====");
			for (int i = h; i < arrayLength; i++)
			{
				int temp = data[i];
				if (data[i] < data[i - h])
				{
					int j = i - h;
					for (; j >= 0 && data[j] > 0; j = j - h)
					{
						data[j + h] = data[j];
					}
					data[j + h] = temp;
				}
				System.out.println(java.util.Arrays.toString(data));
			}
			h = (h - 1) / 3;
		}
	}

	public static void main(String[] args)
	{
		int[] array = {9, -10, 8, 2, 4, 1, 7};
		shellSort(array);
		System.out.println(java.util.Arrays.toString(array));
	}
}