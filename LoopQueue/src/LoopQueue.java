import java.util.Arrays;

/**
 * ������front��rear
 * �жϳ�����Ҫ�ж�rear�Ƿ����front
 * addʱ�ж�����βͷ�ص���ͷ�ǿ�
 * remove���жϿգ�βͷ�ص���βΪ��
 * toString����ҲҪ�ж�rear�Ƿ����front
 * @author Lorin
 * 
 * @param <T>
 */

public class LoopQueue<T>
{
	private int DEFAULT_SIZE = 10;
	private int capacity;
	private Object[] elementData;

	private int front = 0;
	private int rear = 0;

	public LoopQueue()
	{
		capacity = DEFAULT_SIZE;
		elementData = new Object[capacity];
	}

	public LoopQueue(T element)
	{
		this();
		elementData[0] = element;
		rear++;
	}

	public LoopQueue(T element, int initSize)
	{
		this.capacity = initSize;
		elementData = new Object[capacity];
		elementData[0] = element;
		rear++;
	}

	public int length()
	{
		if (empty())
		{
			return 0;
		}
		return rear > front ? rear - front : rear + capacity - front;
	}

	public void add(T element)
	{
		// �ж�����βͷ�ص���ͷ�ǿ�
		if (rear == front && elementData[front] != null)
		{
			throw new IndexOutOfBoundsException("��������");
		}
		elementData[rear++] = element;
		rear = rear == capacity ? 0 : rear;
	}

	public T remove()
	{
		if (empty())
		{
			throw new IndexOutOfBoundsException("�����ѿ�");
		}
		T oldValue = (T) elementData[front];
		elementData[front++] = null;
		front = front == capacity ? 0 : front;
		return oldValue;
	}

	public T element()
	{
		if (empty())
		{
			throw new IndexOutOfBoundsException("�ն���");
		}
		return (T) elementData[front];
	}

	public boolean empty()
	{
		// �жϿգ�βͷ�ص���βΪ��
		return rear == front && elementData[rear] == null;
	}

	public void clear()
	{
		Arrays.fill(elementData, null);
		front = 0;
		rear = 0;
	}

	public String toString()
	{
		if (empty())
		{
			return "[]";
		}
		else
		{
			if (front < rear)
			{
				StringBuilder sb = new StringBuilder("[");
				for (int i = front; i < rear; i++)
				{
					sb.append(elementData[i].toString() + ", ");
				}
				int len = sb.length();
				return sb.delete(len - 2, len).append("]").toString();
			}
			else
			{
				StringBuilder sb = new StringBuilder("[");
				for (int i = front; i < capacity; i++)
				{
					sb.append(elementData[i].toString() + ", ");
				}
				for (int i = 0; i < rear; i++)
				{
					sb.append(elementData[i].toString() + ", ");
				}
				int len = sb.length();
				return sb.delete(len - 2, len).append("]").toString();
			}
		}
	}
}
