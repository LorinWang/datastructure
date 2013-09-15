package QuickSort;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-9-16
 * Time: 上午1:01
 */
public class QuickSort2
{
	public static void main(String[] args)
	{
		QuickSort2 quickSort2=new QuickSort2();
		quickSort2.test();
	}

	private void test()
	{
		int a[]={2,1,3,4,5,7,4,6,7,2,0};
		QuickSort(a,0,a.length-1);
		printArray(a);
		nonRecursionQuickSort(a);
		printArray(a);
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

		while(!startStack.isEmpty())
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

	private void printArray(int[] a)
	{
		for (int i:a)
		{
			System.out.println(i+" ");
		}
	}

	private void QuickSort(int[] a,int start,int end)
	{
		if(start<end){
            int pivot=partition(a,start,end);
			QuickSort(a,start,pivot-1);
			QuickSort(a,pivot+1,end);
		}
	}

	private int partition(int[] a, int start, int end)
	{
		int key=a[start];
		while(start<end)
		{
			while(start<end&&a[end]>=key)
			{
				end--;
			}
			a[start]=a[end];
			while(start<end&&a[start]<=key)
			{
				start++;
			}
			a[end]=a[start];
		}
		a[start]=key;
		return start;
	}

}
