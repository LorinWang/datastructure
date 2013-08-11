package QuickSort;

import Common.DataWrap;

public class QuickSort
{
	/*
	 * 把data数组里i和j的元素位置调换
	 */
	private static void swap(DataWrap[] data, int i, int j)
	{
		DataWrap tmp;
		tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

	// 对data数组中从start到end的子序列进行快排
	private static void subSort(DataWrap[] data, int start, int end)
	{
		if (start < end)
		{
			DataWrap base = data[start]; //key元素
			int i = start;
			int j = end + 1;
			while (true)
			{
				while (i < end && data[++i].compareTo(base) <= 0)//i循环到end或者比base大的
					;
				while (j > start && data[--j].compareTo(base) >= 0)//j循环到start或者比base小的
					;
				if(i<j)
				{
					swap (data,i,j);
				}
				else
				{
					break;
				}
			}
			swap(data,start,j);
			
			subSort(data,start,j-1);
			subSort(data,j+1,end);
		}
	}
	
	/*
	 * quickSort将数组data进行快速排序，
	 * 调用子排序将data从0到length-1进行排序。
	 */
	public static void quickSort(DataWrap[] data)
	{
		subSort(data,0,data.length-1);
	}
	
	public static void main(String[] args)
	{
		DataWrap[] data={
			new DataWrap(9,""),	
			new DataWrap(-16,""),	
			new DataWrap(21,"*"),	
			new DataWrap(23,""),	
			new DataWrap(-30,""),	
			new DataWrap(-49,""),	
			new DataWrap(21,""),	
			new DataWrap(30,"*"),
			new DataWrap(13,"*")
		};
		
		System.out.println("排序之前:\n"+java.util.Arrays.toString(data));
		quickSort(data);
		System.out.println("排序之后:\n"+java.util.Arrays.toString(data));
	}

}
