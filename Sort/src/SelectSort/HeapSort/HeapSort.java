package SelectSort.HeapSort;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-9-21
 * Time: 上午1:41
 */
public class HeapSort
{
	private void heapSort(int[] array)
	{
		for (int i=0;i<array.length-1;i++)
		{
			buildMaxHeap(array,array.length-1-i);
			swap(array,0,array.length-1-i);
		}
	}

	private void swap(int[] array, int i, int i1)
	{
		int temp=array[i];
		array[i]=array[i1];
		array[i1]=temp;
	}

	private void buildMaxHeap(int[] array, int lastIndex)
	{
		int key=(lastIndex-1)/2;
		int bigIndex=0;
		if (key*2+1<=lastIndex)
		{
			bigIndex=key*2+1;
			if(bigIndex+1<=lastIndex&&array[bigIndex]<array[bigIndex+1])
			{
				bigIndex++;
			}
		}
		if(array[key]<array[bigIndex])
		{
			swap(array,key,bigIndex);
		}


	}

	public static void main(String[] args)
	{

	}
}
