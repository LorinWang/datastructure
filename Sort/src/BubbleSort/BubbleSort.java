package BubbleSort;

import Common.DataWrap;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-18
 * Time: 下午4:48
 */
public class BubbleSort
{
	public static void bubbleSort(DataWrap[] data)
	{
		System.out.println("开始排序");
		int arrayLength=data.length;
		for(int i=0;i<arrayLength-1;i++)
		{
			boolean flag=false;
			for (int j=0;j<arrayLength-1-i;j++)
			{
				if (data[j].compareTo(data[j+1])>0)
				{
					DataWrap tmp=data[j+1];
					data[j+1]=data[j];
					data[j]=tmp;
					flag=true;
				}
			}
			System.out.println(java.util.Arrays.toString(data));
			if (!flag)
			{
				break;
			}
		}
	}

	public static void main(String[] args)
	{
		DataWrap[] data={
				new DataWrap(21,""),
				new DataWrap(30,""),
				new DataWrap(50,""),
				new DataWrap(30,"*"),
				new DataWrap(9,"")
		};
		System.out.println("排序之前:\n"+java.util.Arrays.toString(data));
		bubbleSort(data);
		System.out.println("排序之后:\n"+java.util.Arrays.toString(data));
	}
}