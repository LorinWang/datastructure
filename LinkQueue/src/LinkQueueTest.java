
public class LinkQueueTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		LinkQueue<String> queue=new LinkQueue<String>();
		queue.add("aaa");
		queue.add("bbb");
		queue.add("ccc");
		queue.add("ddd");
		System.out.println(queue);
		queue.remove();
		System.out.println("remove"+queue);
		System.out.println("element"+queue.element());
		queue.add("eee");
		System.out.println(queue);
	}

}
