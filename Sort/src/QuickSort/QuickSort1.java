package QuickSort;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-9-15
 * Time: 下午10:58
 */
public class QuickSort1
{
	public static void main(String[] args)
	{
		QuickSort1 qs=new QuickSort1();
		qs.test();
	}

	public void test()
	{
		int[] a={2,5,1,2,3,4,6,8,9};
		int b[]=a;
		quickSort(a,0,a.length-1);
		nonRecursionQuickSort(b);
		printArray(a);
		printArray(b);
	}
	private void printArray(int[] a)
	{
		for (int i :a)
		{
			System.out.println(i+" ");
		}
	}

	public void quickSort(int[] a,int start,int end)
	{
		if(start<end)
		{
			int pivot=partition(a, start, end);
			quickSort(a,start,pivot-1);
			quickSort(a,pivot+1,end);
		}
	}

	private void nonRecursionQuickSort(int[] a)
	{
		if(a==null||a.length<0)
		{
			return;
		}
		Stack<Integer> startStack=new Stack<Integer>();
		Stack<Integer> endStack=new Stack<Integer>();

		int start=0;
		int end=a.length-1;
		int pivot=0;

		startStack.push(start);
		endStack.push(end);

		while (!startStack.isEmpty())
		{
			start=startStack.pop();
			end=endStack.pop();
			pivot=partition(a,start,end);

			if (start<pivot-1)
			{
				startStack.push(start);
				endStack.push(pivot-1);
			}
			if (end>pivot+1)
			{
				startStack.push(pivot+1);
				endStack.push(end);
			}
		}
	}

	private  int partition(int[] a, int start, int end)
	{
		int pivot=a[start];
		while (start<end)
		{
			while(start<end&&a[end]>=pivot)
			{
				end--;
			}
			a[start]=a[end];
			while(start<end&&a[start]<=pivot)
			{
				start++;
			}
			a[end]=a[start];
		}
		a[start]=pivot;
		return start;
	}

}
