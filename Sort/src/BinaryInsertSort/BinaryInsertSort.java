package BinaryInsertSort;

import Common.DataWrap;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-29
 * Time: 下午10:56
 */
public class BinaryInsertSort
{
	public static void binaryInsertSort(DataWrap[] data)
	{
		System.out.println("开始排序:\n");
		int arrayLength=data.length;
		for (int i=1;i<arrayLength;i++)
		{
			DataWrap tmp=data[i];//data[i]在后移处被赋值，所以这里先存储下来
			int low=0;
			int high=i-1;//要插入第i个元素，则判断0到i-1的元素
			while(low<=high)//直到high=low
			{
		        int mid=(high+low)/2;
				if(tmp.compareTo(data[mid])>0)
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
			for (int j=i;j>low;j--)
			{
				data[j]=data[j-1];
			}
			data[low]=tmp;
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
		binaryInsertSort(data);
		System.out.println("排序之后:\n"+java.util.Arrays.toString(data));
	}
}
