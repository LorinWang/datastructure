
public class SequenceQueueTest
{
	public static void main(String[] args)
	{
		SequenceQueue<String> queue=new SequenceQueue<String>();
		queue.add("aaa");
		queue.add("bbb");
		queue.add("ccc");
		queue.add("ddd");
		System.out.println(queue);
		System.out.println("∑√Œ front"+queue.element());
		System.out.println("remove"+queue.remove());
		System.out.println(queue);
		
	}

}
