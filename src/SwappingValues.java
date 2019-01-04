
public class SwappingValues {

	public static void main(String[] args) {

		int a = 123;
		int b = 321;

		// using 3rd var
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapped values using 3 variables:\n a: " + a + "\n b: " + b);

		// using addition and substraction
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swapped values using addition and substraction:\n a: " + a + "\n b: " + b);

		// using multiplication and division
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("Swapped values using multiplication and division:\n a: " + a + "\n b: " + b);
		
		//Using XOR operations
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Swapped values using XOR operations:\n a: " + a + "\n b: " + b);
		
		
		String str1="Vivek";
		String str2="Kumar";
		
		str1=str1.concat(str2);
		str2=str1.substring(0,str1.indexOf('K'));
		str1=str1.substring(str2.length());
		System.out.println("Swapped Strings are:\n str1: " + str1 + "\n str2: " + str2);

	}
}
