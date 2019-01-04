
public class StringManipulation {

	public static void main(String[] args) {
		String str = "	Hello World!! How are you?	";

		System.out.println(str.toLowerCase());//changes all characters to lower case
		System.out.println(str.toUpperCase());//changes all characters to upper case	
		System.out.println(str.charAt(1));//prints the character at index 1.Note:- Indices start from 0
		System.out.println(str.indexOf("World"));//Finds index of String "World"

		System.out.println(str.indexOf('W'));//Finds index of char 'W'
		System.out.println(str.indexOf('z'));//Tries to find index of 'z' in string and if not available, prints -1
		System.out.println(str.substring(str.indexOf('H'), str.indexOf('o')));//creates substring between indices given
																			//First index is inclusive and second is exclusive.

		System.out.println((str.substring(str.indexOf('r') + 1)).indexOf('r') + str.indexOf('r') + 1);//Finds second occurance of r
		System.out.println(str.length());//provides length of completee string	
		System.out.println(String.valueOf('A'));//provides String representation of char'A'
		String[] strArr = str.trim().split("[! ?]+");//Splits the string based on  regex provided as args into String Array
														//trim() removes white spaces at the begining and end of String and not the middle spaces.

		for (String str1 : strArr) {
			System.out.println(str1);
		}
	}

}
