import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Put in your word\n");
		String sentence = scan.nextLine().toString();
		
		int result;
		
		result = Palindrome(sentence);
		
		if (result==0) {
			System.out.println("Not Palindrome");
		}
		if (result==1) {
			System.out.println("Palindrome");
		}
	}
	
	public static int Palindrome(String str) {
		
		int i, len = str.length();
	    StringBuilder strb = new StringBuilder(len);

	    for (i = (len - 1); i >= 0; i--){
	        strb.append(str.charAt(i));
	    }
		
		if (str.equals(strb.toString())){
			return 1;
		}
		return 0;
		
	}

}
