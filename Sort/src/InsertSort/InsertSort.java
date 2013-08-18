package InsertSort;

import Common.DataWrap;

/**
 *直接插入排序
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-18
 * Time: 下午5:12
 */
public class InsertSort
{
	public static void insertSort(DataWrap[] data)
	{
		System.out.println("开始排序");
		int arrayLength=data.length;
		for (int i=1;i<arrayLength;i++)
		{
			DataWrap tmp=data[i];
			if (data[i].compareTo(data[i-1])<0)//如果i处的值比i-1处的大，则已经有序
			{
				int j=i-1;
				for(;j>=0&&data[j].compareTo(tmp)>0;j--)//j从i-1开始向前找，找到头或者到比tmp小或相等为止，每找一个就后移一位
				{
					data[j+1]=data[j];
				}
				data[j+1]=tmp;//最后一次j移到j+1位置以后，j--，所以tmp的值放到j+1的位置
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
		insertSort(data);
		System.out.println("排序之后:\n"+java.util.Arrays.toString(data));
	}
}
