package InsertSort.BinaryInsertSort;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-9-20
 * Time: 下午10:56
 */
public class BinaryInsertSort
{
	public static void main(String[] args)
	{
		int [] array=new int[]{1,2,3,4,5,4,3,2,1};
		BinaryInsertSort binaryInsertSort=new BinaryInsertSort();
		binaryInsertSort.binaryInsertSort(array);
		System.out.println(java.util.Arrays.toString(array));
	}

	private void binaryInsertSort(int[] array)
	{
		for (int i=1;i<array.length;i++)
		{
			if (array[i]<array[i-1])
			{
				int key=array[i];
			    int low=0;
				int high=i-1;
				int mid=(low+high)/2;
				while(array[mid]!=key)
				{
					if (key<array[mid])
						{
							high=mid-1;
						}
					else if(key>array[mid])
						{
							low=mid+1;
						}
					mid=(low+high)/2;
				}
				for (int j=i;j>mid;j--)
				{
					array[j]=array[j-1];
				}
				array[mid]=key;
			}
		}
	}
}
