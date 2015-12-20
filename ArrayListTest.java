public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list);
		

		list.add(1);
		list.add(2);
		System.out.println(list);

		list.remove(0);
		System.out.println(list);

		System.out.println(list.get(0));
		
		list.add(3);
		list.set(100, 0);

		System.out.println(list);

	}
}
