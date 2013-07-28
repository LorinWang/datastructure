public class SequenceListTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SequenceList<String> list = new SequenceList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.insert("ddd", 1);
		System.out.println(list);
		System.out.println(list.locate("ddd"));
		list.delete(1);
		System.out.println(list);
	}

}
