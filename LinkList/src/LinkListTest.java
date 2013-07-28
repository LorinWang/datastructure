public class LinkListTest
{
	public static void main(String[] args)
	{
		LinkList<String> list = new LinkList<String>();
		list.insert("aaa", 0);
		list.add("bbb");
		list.add("ccc");
		list.insert("ddd", 1);
		System.out.println(list);
		list.delete(2);
		System.out.println(list);
		System.out.println("ccc is at" + list.locate("ccc"));
		System.out.println("2 is" + list.get(2));

	}

}
