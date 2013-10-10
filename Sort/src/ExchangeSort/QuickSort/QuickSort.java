package ExchangeSort.QuickSort;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-9-21
 * Time: 上午12:23
 */
public class QuickSort
{
	private void quickSort(int[] array)
	{
	  	subSort(array,0,array.length-1);
	}

	private void subSort(int[] array,int start,int end)
	{
	 	if(start<end)
	    {
		    int pivot =partition(array, start, end);
		    subSort(array, start, pivot-1 );
		    subSort(array,pivot+1,end);
	    }
	}

	private int partition(int[] array, int start, int end)
	{
		 int key=array[start];
		 while(start<end)
		 {
			 while(end>start&&array[end]>=key)
			 {
				 end--;
			 }
			 array[start]=array[end];
			 while(end>start&&array[start]<=key)
			 {
				 start++;
			 }
			 array[end]=array[start];
		 }
		 array[start]=key;
		 return start;
	}

	public static void main(String[] args)
	{
		int[] array=new int[]{1,2,3,4,5,4,3,2,1};
		QuickSort quickSort=new QuickSort();
		quickSort.quickSort(array);
		System.out.println(java.util.Arrays.toString(array));
	}
}
