
public class LoopQueueTest
{
	public static void main(String[] args)
	{
		LoopQueue<String> queue=new LoopQueue<String>("aaa",3);
		queue.add("bbb");
		queue.add("ccc");
		System.out.println(queue);
		System.out.println("∑√Œ front"+queue.element());
		System.out.println("remove"+queue.remove());
		System.out.println(queue);
	}

}
