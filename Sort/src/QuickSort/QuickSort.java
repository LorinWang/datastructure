package QuickSort;

import Common.DataWrap;

public class QuickSort
{
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
		
		System.out.println("排序前\n"+java.util.Arrays.toString(data));
		quickSort(data);
		System.out.println("排序后\n"+java.util.Arrays.toString(data));
	}

	private static void quickSort(DataWrap[] data)
	{
		subSort(data,0,data.length-1);
	}

	private static void subSort(DataWrap[] data, int start, int end)
	{
		if(start<end)
		{
			int pivot=partition(data,start,end);
			subSort(data,start,pivot-1);
			subSort(data,pivot+1,end);
		}
	}

	private static int partition(DataWrap[] data, int start, int end)
	{
		DataWrap dataWrap=data[start];
		while(start<end)
		{
			while(start<end&&data[end].compareTo(dataWrap)>=0)
			{
				end--;
			}
			data[start]=data[end];
			while(start<end&&data[start].compareTo(dataWrap)<=0)
			{
				start++;
			}
			data[end]=data[start];
		}
		data[start]=dataWrap;
		return start;

	}

}
