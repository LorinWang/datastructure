
public class LinkStackTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		LinkStack<String> stack=new LinkStack<String>();
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		stack.push("ddd");
		System.out.println(stack);
		System.out.println("pop"+stack.pop());
		System.out.println("peep"+stack.peep());
		System.out.println("pop"+stack.pop());
		System.out.println(stack);
	}

}
