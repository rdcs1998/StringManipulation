import java.util.ArrayList;
import java.util.Scanner;

public class LastLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
		
		System.out.print("Put in your sentence\n");
		String sentence = scan.nextLine();
		
		System.out.println("Fixed it :"+ LastLetterCount(sentence));
	}
	
	public static String LastLetterCount(String sentence) {
		ArrayList<String> ArrList = new ArrayList<String>();
		String swappedString = "";
		for(String word : sentence.split(" ")) {
			ArrList.add(word);
		}
		
		int firstYindex=0;
		int firstSindex=0;
		int flagS=0;
		int flagY=0;
		
		for(int i = 0; i<ArrList.size();i++) {
			if(ArrList.get(i).charAt(ArrList.get(i).length()-1) == 'y') {
				if(flagY==0) {
					firstYindex=i;
					flagY=1;
				}
			}
			if(ArrList.get(i).charAt(ArrList.get(i).length()-1) == 's') {
				if(flagS==0) {
					firstSindex=i;
					flagS=1;
				}
			}
		}
		
		String firstS = ArrList.get(firstSindex);
		String firstY = ArrList.get(firstYindex);
		
		ArrList.set(firstSindex, firstY);
		ArrList.set(firstYindex, firstS);
		
		for (String string : ArrList) {
			swappedString += string + "\t";
		}
		
		return swappedString;
	}

}
