/**
 * 双向链表和单链表相比：
 * 1.查找时候可以从后向前查找
 * 2.插入时想清楚
 * 3.删除时注意删除后继的前驱部分
 * 4.可以从后向前输出
 * @author Lorin
 *
 * @param <T>
 */
public class DuLinkList<T>
{

	private class Node
	{
		private T data;
		private Node prev;
		private Node next;

		public Node()
		{
		}

		public Node(T data, Node prev, Node next)
		{
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
	}

	private Node header;
	private Node tail;
	private int size;

	public DuLinkList()
	{
		header = null;
		tail = null;
	}

	public DuLinkList(T element)
	{
		header = new Node(element, null, null);
		tail = header;
		size++;
	}

	public int length()
	{
		return size;
	}

	public T get(int index)
	{
		return getNodeByIndex(index).data;
	}

	// 分类查找，按index分为向前和向后查找
	private Node getNodeByIndex(int index)
	{
		if (index < 0 || index > size - 1)
		{
			throw new IndexOutOfBoundsException("索引越界");
		}

		if (index < size / 2)
		{
			Node current = header;
			for (int i = 0; i < size / 2 && current != null; i++, current = current.next)
			{
				if (i == index)
				{
					return current;
				}
			}
		}
		else
		{
			Node current = tail;
			for (int i = size - 1; i >= size / 2 && current != null; i--, current = current.prev)
			{
				if (i == index)
				{
					return current;
				}
			}

		}
		return null;
	}

	public int locate(T element)
	{
		Node current = header;
		for (int i = 0; i < size && current != null; i++, current = current.next)
		{
			if (current.data.equals(element))
			{
				return i;
			}
		}
		return -1;
	}

	public void insert(T element, int index)
	{
		if (index < 0 || index > size)
		{
			throw new IndexOutOfBoundsException("索引越界");
		}
		if (header == null)
		{
			add(element);
		}
		else
		{
			if (index == 0)
			{
				addAtHeader(element);
			}
			else
			{
				Node prev = getNodeByIndex(index - 1);
				Node next = prev.next;
				Node newNode = new Node(element, prev, next);
				prev.next = newNode;
				next.prev = newNode;
				size++;
			}
		}
	}

	// 尾插法
	public void add(T element)
	{
		if (header == null)
		{
			header = new Node(element, null, null);
			tail = header;
		}
		else
		{
			Node newNode = new Node(element, tail, null);
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	// 头插法
	public void addAtHeader(T element)
	{
		header = new Node(element, null, header);
		if (tail == null)
		{
			tail = header;
		}
		size++;
	}

	public T delete(int index)
	{
		if (index < 0 || index > size - 1)
		{
			throw new IndexOutOfBoundsException("索引越界");
		}
		Node del = null;
		if (index == 0)
		{
			del = header;
			header = header.next;
			header.prev = null;// 释放作为头结点的原先第二位的元素前驱
		}
		else
		{
			Node prev = getNodeByIndex(index - 1);
			del = prev.next;
			prev.next = del.next;//因为删除节点的前驱必存在，所以直接让删除节点的前驱的后继指向删除节点的后继
			if (del.next != null)//因为删除节点的后继未必存在，所以先判断删除的节点有后继，然后把后继的前驱释放
			{
				del.next.prev = prev;
			}
			del.prev = null;
			del.next = null;
		}
		size--;
		return del.data;
	}

	public T remove()
	{
		return delete(size - 1);
	}

	public boolean empty()
	{
		return size == 0;
	}

	public void clear()
	{
		header = null;
		tail = null;
		size = 0;
	}

	public String toString()
	{
		if (empty())
		{
			return "[]";
		}
		else
		{
			StringBuilder sb = new StringBuilder("[");
			for (Node current = header; current != null; current = current.next)
			{
				sb.append(current.data.toString() + ", ");
			}
			int len = sb.length();
			return sb.delete(len - 2, len).append("]").toString();
		}
	}
	
	public String reverseToString()//前向
	{
		if (empty())
		{
			return "[]";
		}
		else
		{
			StringBuilder sb = new StringBuilder("[");
			for (Node current = tail; current != null; current = current.prev)
			{
				sb.append(current.data.toString() + ", ");
			}
			int len = sb.length();
			return sb.delete(len - 2, len).append("]").toString();
		}
	}

}
