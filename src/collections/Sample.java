package collections;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Nitesh");
		al.add("c");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add(10);
		al.add(10);
		System.out.println(al);
		ArrayList a2 = new ArrayList();
		a2.add("Samit");
		a2.add(7);
		a2.add("pinki");

		al.addAll(a2);
		System.out.println(al);
		al.add(a2);
		System.out.println(al);
		al.add(3, "Jannu");
		System.out.println(al);
		al.get(5);
		System.out.println(al);
		System.out.println(al.contains("pinki"));

		System.out.println(al.isEmpty());

		System.out.println(al.size());
		System.out.println(al.remove(8));
		System.out.println(al.size());

		System.out.println("----------");
		System.out.println(al);
		System.out.println(a2);

		al.removeAll(a2);
		System.out.println(al);
		System.out.println(al.remove(1));
		al.add(1, "Chanchu");
		System.out.println(al);

	}

}
