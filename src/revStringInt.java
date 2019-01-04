
public class revStringInt {

	public static void main(String[] args) {
		int num = 2314023;
				String str = "Hello";
				StringBuilder sbld = new StringBuilder(str);
				System.out.println(sbld.reverse());

				StringBuffer sbfr = new StringBuffer(str);
				System.out.println(sbfr.reverse());

				String rev = "";

				for (int i = str.length() - 1; i >= 0; i--) {

					rev += str.charAt(i);
				}
				System.out.println("Reverse String :- " + rev);
			
				int revInt=0;
				while(num!=0) {
					revInt = revInt*10 + num%10;
					num=num/10;
					
				}
				System.out.println("ReverseInteger :" +revInt);
				
			}


	}


