import java.util.Scanner;
public class Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Put in your word\n");
		String sentence = scan.nextLine().toString();
		
		int result;
		
		result = ConsonantCount(sentence);
		
		System.out.println("This many consonants:" + result);
		
		
	}
		
	public static int ConsonantCount(String sentence) {
		int count =0;
		StringBuilder strBuild = new StringBuilder(sentence);
		char ch = '*';
		sentence=sentence.toLowerCase();
		for(int i = 0; i<sentence.length();i++) {
			if(sentence.charAt(i)!='a' && sentence.charAt(i)!='e' && 
					sentence.charAt(i)!='i' && sentence.charAt(i)!='o' &&
					sentence.charAt(i)!='u'&&sentence.charAt(i)!=' ') {
				count++;
				strBuild.setCharAt(i, ch);
				
			}
		}
		
		System.out.println("Modified String:"+ strBuild);
		
		return count;
	}

}
