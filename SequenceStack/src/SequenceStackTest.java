
public class SequenceStackTest
{

	public static void main(String[] args)
	{
		SequenceStack<String> stack=new SequenceStack<String>();
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		stack.push("ddd");
		System.out.println(stack);
		System.out.println("Õ»¶¥"+stack.peek());
		System.out.println("µ¯³öÕ»¶¥"+stack.pop());
		System.out.println("¶þµ¯"+stack.pop());
		System.out.println("Õ»"+stack);
	}

}
