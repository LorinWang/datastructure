package QuickSort;

import Common.DataWrap;

public class QuickSort
{
	/*
	 * ��data������i��j��Ԫ��λ�õ���
	 */
	private static void swap(DataWrap[] data, int i, int j)
	{
		DataWrap tmp;
		tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

	// ��data�����д�start��end�������н��п���
	private static void subSort(DataWrap[] data, int start, int end)
	{
		if (start < end)
		{
			DataWrap base = data[start]; //keyԪ��
			int i = start;
			int j = end + 1;
			while (true)
			{
				while (i < end && data[++i].compareTo(base) <= 0)//iѭ����end���߱�base���
					;
				while (j > start && data[--j].compareTo(base) >= 0)//jѭ����start���߱�baseС��
					;
				if(i<j)
				{
					swap (data,i,j);
				}
				else
				{
					break;
				}
			}
			swap(data,start,j);
			
			subSort(data,start,j-1);
			subSort(data,j+1,end);
		}
	}
	
	/*
	 * quickSort������data���п�������
	 * ����������data��0��length-1��������
	 */
	public static void quickSort(DataWrap[] data)
	{
		subSort(data,0,data.length-1);
	}
	
	public static void main(String[] args)
	{
		DataWrap[] data={
			new DataWrap(9,""),	
			new DataWrap(-16,""),	
			new DataWrap(21,"*"),	
			new DataWrap(23,""),	
			new DataWrap(-30,""),	
			new DataWrap(-49,""),	
			new DataWrap(21,""),	
			new DataWrap(30,"*"),
			new DataWrap(13,"*")
		};
		
		System.out.println("����֮ǰ:\n"+java.util.Arrays.toString(data));
		quickSort(data);
		System.out.println("����֮��:\n"+java.util.Arrays.toString(data));
	}

}
