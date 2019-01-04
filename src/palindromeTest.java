
public class palindromeTest {

	public static void main(String [] myArg) {
		String str= "12321";
		String revStr = "";
		
		for(int i=str.length();i>0;i--) {
			
			revStr = revStr + str.charAt(i-1);
		}
		if(revStr.equalsIgnoreCase(str)) 
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
			
		
	}
}
