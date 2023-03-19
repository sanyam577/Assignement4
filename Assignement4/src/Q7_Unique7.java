import java.util.Scanner;

public class Q7_Unique7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str1 = scan.nextLine();
		boolean flag = false;
		String str2="";
		
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)>=97&&str1.charAt(i)<122) {
				str2 = str2 + (char)(str1.charAt(i)-32);
			}
			else {
				str2 = str2 + (char)(str1.charAt(i));
			}
		}
		System.out.println("String is "+ str2);
		
		for(int i=0; i<str2.length(); i++) {
			for(int j= i+1; j<str2.length()-1; j++) {
				if(str2.charAt(i)==(str2.charAt(j))) {
					flag = true;  
				}
			}	
		}
		if(flag==false) {
			System.out.println(" unique character string");
		}
		else {
			System.out.println("not  unique character string");
		}

	}

}