
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
		System.out.println("ջ��"+stack.peek());
		System.out.println("����ջ��"+stack.pop());
		System.out.println("����"+stack.pop());
		System.out.println("ջ"+stack);
	}

}
