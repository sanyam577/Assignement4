import java.util.Scanner;

public class Q2_DuplicateChar2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string in lowercase :: ");
		String str1 = scan.nextLine();
		
		for(int i=0; i<str1.length(); i++) {
			for(int j= i+1; j<str1.length()-1; j++) {
				if(str1.charAt(i)==(str1.charAt(j))) {
					System.out.println("Duplicate Character is ::"+str1.charAt(i));
				    break;
				}
			
			}
		}

	}

}
