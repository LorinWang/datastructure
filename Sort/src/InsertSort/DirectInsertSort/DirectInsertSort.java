package InsertSort.DirectInsertSort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-9-20
 * Time: 下午9:21
 */
public class DirectInsertSort
{
	public static void main(String[] args)
	{
		int[] array=new int[]{1,3,2,5,4,2,6,4};
		DirectInsertSort directInsertSort=new DirectInsertSort();
		directInsertSort.directInsertSort(array);
		System.out.println(Arrays.toString(array));
	}



	private void directInsertSort(int[] array)
	{
		for (int i=1;i<array.length;i++)
		{
			int key=array[i];
			if(array[i]<array[i-1])
			{
				int j=i-1;
				for(;j>=0&&array[j]>key;j--)
				{
					array[j+1]=array[j];
				}
				array[j+1]=key;
			}
        }
	}
}