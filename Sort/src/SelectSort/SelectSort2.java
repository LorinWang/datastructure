package SelectSort;

import Common.DataWrap;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-18
 * Time: 下午4:28
 */
public class SelectSort2
{
	public static void selectSort(DataWrap[] data)
	{
		System.out.println("开始排序");
		int arrayLength=data.length;
		for (int i=0;i<arrayLength-1;i++)
		{
			int minIndex=i;
			for (int j=i+1;j<arrayLength;j++)
			{
				if(data[minIndex].compareTo(data[j])>0)
				{
					minIndex=j;
				}
			}
			if(minIndex!=i)
			{
				DataWrap tmp=data[i];
				data[i]=data[minIndex];
				data[minIndex]=tmp;
			}
			System.out.println(java.util.Arrays.toString(data));
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
		selectSort(data);
		System.out.println("排序之后:\n"+java.util.Arrays.toString(data));
	}
}
