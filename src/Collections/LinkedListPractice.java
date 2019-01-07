package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {

		Student s = new Student("S1");

		LinkedList<Student> studentRegList = new LinkedList<>();

		// Adding elements to LinkedList
		studentRegList.add(s);

		System.out.println(studentRegList.size());

		// Adding elements at first and last location
		studentRegList.addFirst(new Student("S2"));
		studentRegList.addLast(new Student("S3"));

		// Iterating through the list
		Iterator<Student> itr = studentRegList.iterator();

		System.out.println("###############################################");
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		System.out.println("###############################################");

		// Fetching first and last elements in list
		System.out.println(studentRegList.getFirst());
		System.out.println(studentRegList.getLast());

		// Removing first and last Element
		studentRegList.removeFirst();
		studentRegList.removeLast();

		// Iterating though the list
		System.out.println("###############################################");
		Iterator<Student> itr1 = studentRegList.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("###############################################");

		//Adding some values to the list
		for (int i = 0; i < 10; i++) {
			studentRegList.add(new Student("S" + i));
		}

		// Iterating though the list
		System.out.println("###############################################");
		Iterator<Student> itr2 = studentRegList.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("###############################################");

		/*Peek() is similar to get() method.
		 * peekFirst() amd peekLast() are similar to getFirst() and getLast()
		 */
		System.out.println(studentRegList.peek());
		System.out.println(studentRegList.peekFirst());
		System.out.println(studentRegList.peekLast());
		
		
		/*poll() works similar to remove()
		 *pollFirst() and pollLast() is equivalent to removeFirst(),removeLast() */
		studentRegList.poll();
		studentRegList.pollLast();
		studentRegList.pollFirst();
		// Iterating though the list
		System.out.println("###############################################");
		Iterator<Student> itr3 = studentRegList.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("###############################################");
		
	}
}

