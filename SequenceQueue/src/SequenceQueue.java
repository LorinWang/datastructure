import java.util.Arrays;
/**
 * ������front��rear
 * @author Lorin
 *
 * @param <T>
 */

public class SequenceQueue<T>
{
	private int DEFAULT_SIZE=10;
	private int capacity;
	private Object[] elementData;
	
	private int front=0;
	private int rear=0;
	
	public SequenceQueue()
	{
		capacity=DEFAULT_SIZE;
		elementData=new Object[capacity];
	}
	
	public SequenceQueue(T element)
	{
		this();
		elementData[0]=element;
		rear++;
	}
	
	public SequenceQueue(T element,int initSize)
	{
		this.capacity=initSize;
		elementData=new Object[capacity];
		elementData[0]=element;
		rear++;
	}
	
	public int length()
	{
		return rear-front;
	}
	
	public void add(T element)
	{
		if(rear>capacity-1)
		{
			throw new IndexOutOfBoundsException("��������");
		}
		elementData[rear++]=element;
	}
	
	public T remove()
	{
		if(empty())
		{
			throw new IndexOutOfBoundsException("�����ѿ�");
		}
		T oldValue=(T)elementData[front];
		elementData[front++]=null;
		return oldValue;
	}
	
	public T element()
	{
		if(empty())
		{
			throw new IndexOutOfBoundsException("�ն���");
		}
		return (T) elementData[front];
	}
	
	public boolean empty()
	{
		return rear==front;
	}
	
	public void clear()
	{
		Arrays.fill(elementData, null);
		front=0;
		rear=0;
	}
	
	public String toString()
	{
		if (empty())
		{
			return "[]";
		}
		else
		{
			StringBuilder sb= new StringBuilder("[");
			for (int i=front;i<rear;i++)
			{
				sb.append(elementData[i].toString()+", ");
			}
			int len=sb.length();
			return sb.delete(len-2, len).append("]").toString();
		}
	}
}
