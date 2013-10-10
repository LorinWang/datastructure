package ExchangeSort.BubbleSort;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-9-20
 * Time: 下午11:42
 */
public class BubbleSort
{

	private void bubbleSort(int[] array)
	{
		for (int i=0;i<array.length;i++)
		{
			boolean isSwap=false;
			for (int j=array.length-1;j>i;j--)
			{
				if(array[j]<array[j-1])
				{
					isSwap=true;
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
			if(!isSwap)
			{
				break;
			}

		}
	}

	public static void main(String[] args)
	{
		int[] array= new int[]{1,2,3,4,5,4,3,2,1};
		BubbleSort bubbleSort=new BubbleSort();
		bubbleSort.bubbleSort(array);
		System.out.println(java.util.Arrays.toString(array));
	}
}
