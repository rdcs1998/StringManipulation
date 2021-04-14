
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int VowelCount(String sentence) {
		int count =0;
		sentence=sentence.toLowerCase();
		for(int i = 0; i<sentence.length();i++) {
			if(sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || 
					sentence.charAt(i)=='i' || sentence.charAt(i)=='o' || sentence.charAt(i)=='u') {
				count++;
			}
		}
		
		return count;
	}

}
