package SelectSort.SimpleSelectSort;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-9-21
 * Time: 上午1:12
 */
public class SimpleSortSelect
{
	private void simpleSortSelect(int[] array)
	{
		int min=0;
		for (int i=0;i<array.length;i++)
		{
			min=i;
			for (int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp=array[i];
				array[i]=array[min];
				array[min]=temp;
			}

		}

	}

	public static void main(String[] args)
	{
		int[] array=new int[]{1,2,3,4,3,2,1};
		SimpleSortSelect simpleSortSelect=new SimpleSortSelect();
		simpleSortSelect.simpleSortSelect(array);
		System.out.println(java.util.Arrays.toString(array));
	}
}
