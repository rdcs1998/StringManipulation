import java.util.Scanner;
public class Words {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your sentence");
		String str = scan.nextLine();
		
		System.out.println("Word Count:"+WordCount(str));
	}
	
	public static int WordCount(String str) {
		int count=0;
		if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
			
			for(int i=0;i<str.length();i++) 
			{
				if (str.charAt(i) == ' ') {
					count++;
				}
			}
			count = count+1;
		}
		
		return count;
	}
}
