import java.util.Arrays;

/**
 * 队列有front、rear
 * 判断长度需要判断rear是否大于front
 * add时判断满，尾头重叠且头非空
 * remove是判断空，尾头重叠且尾为空
 * toString方法也要判断rear是否大于front
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
		// 判断满，尾头重叠且头非空
		if (rear == front && elementData[front] != null)
		{
			throw new IndexOutOfBoundsException("队列已满");
		}
		elementData[rear++] = element;
		rear = rear == capacity ? 0 : rear;
	}

	public T remove()
	{
		if (empty())
		{
			throw new IndexOutOfBoundsException("队列已空");
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
			throw new IndexOutOfBoundsException("空队列");
		}
		return (T) elementData[front];
	}

	public boolean empty()
	{
		// 判断空：尾头重叠且尾为空
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
