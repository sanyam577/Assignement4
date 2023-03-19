import java.util.Scanner;

public class Q4_Count4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String in lower case ");
		String str1=scan.nextLine();
		 int vCount=0;
		 int cCount=0;
		 int sCCount=0;
		 
		 for(int i=0; i<str1.length(); i++) {
			 if(str1.charAt(i)==97 || str1.charAt(i)==101 || str1.charAt(i)==105 || str1.charAt(i)==111 ||
					 str1.charAt(i)==117)  {
				 vCount++;
			 }
			 else if(str1.charAt(i)>=97&&str1.charAt(i)<122) {
				 cCount++;
			 }
			 else {
				 sCCount++;
			 }
		 }
		 
		 System.out.println("vowels are :: "+vCount);
		 System.out.println("consonants are :: "+cCount);
		 System.out.println("special character :: "+sCCount);
		 
		

	}

}
