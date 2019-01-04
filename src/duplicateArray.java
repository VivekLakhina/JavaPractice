import java.util.HashSet;
import java.util.*;

public class duplicateArray {

	public static void main(String[] args) {
		String[] test = { "java", "c", "python", "java", "javascript","python" };

		for (int i = 0; i < test.length; i++) {
			for (int j = i + 1; j < test.length; j++) {
				if (test[i].equalsIgnoreCase(test[j]))
					System.out.println("Duplicate element is :" + test[i]);
			}

		}

		Set<String> setTest = new HashSet<>();
		for (String str : test) {
			if (!setTest.add(str)) {
				System.out.println("Duplicate element is : " + str);
			}
		}

		Map<String, Integer> mapTest = new HashMap<>();
		for (String str : test) {
			if (mapTest.containsKey(str)) {
				System.out.println("Duplicate element is : " + str);
			} else
				mapTest.put(str, 1);
		}

	}

}
