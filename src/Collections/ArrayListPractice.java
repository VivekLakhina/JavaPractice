package Collections;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		Student s = new Student("H1");
		
		//Created a List reference to ArrayList Class
		ArrayList<Student> studentList = new ArrayList<>();
		
		//added a Student Class object to the list
		studentList.add(s);
		
		/*printing content of list. In this case when SOP will call 
		to_String() method of Object class which basically prints 
		the <packageName>.<className>.hex(hashCode<ClassObject>)
		To avoid that, we override to_string method in our class*/
		
		System.out.println(studentList);
		
		//size()-----> gets size of list
		System.out.println(studentList.size());

		//adding some data to list
		for (int i = 0; i < 10; i++) {
			studentList.add(new Student("H" + i));
		}
		//add(int index,Object o)
		studentList.add(4, new Student("H12"));

		//Iterating through the List
		for (Student s1 : studentList) {
			System.out.println(s1);
		}
		
		/*contains(Object o)
		 *this method uses equals() and hoashcode() internally to compare 2 objects
		 *and equals() and hashcode() methods from Object class compares 2 objects based on their memory location rather than content of object
		 *To OverCome this, we need to override these methods in our class too*/
		System.out.println(studentList.contains(new Student("H1")));
		
		//colne()---> this method will clone whole of arrayList into another arrayList
		@SuppressWarnings("unchecked")
		ArrayList<Student> studentListCopy = (ArrayList<Student>)studentList.clone();
		
		for (Student s1 : studentListCopy) {
			System.out.println("---"+s1);
		}
		
		//indexOf(Object o)----> gives us index of any object
		System.out.println(studentList.indexOf(new Student("H12")));
		
		//get(int index)---> returns the object at that index
		System.out.println(studentList.get(10));
		
		//Checks list.size()==0
		System.out.println(studentList.isEmpty());
	}
}
