
import java.util.Scanner;

public class Q1_RemoveDuplicate1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str1 = scan.nextLine();
		String str2="";
		String str3="";
		int i;
		int j;
		
		for( i=0; i<str1.length(); i++) {
			if(str1.charAt(i)>=97&&str1.charAt(i)<122) {
				str2 = str2 + (char)(str1.charAt(i)-32);
			}
			else {
				str2 = str2 + (char)(str1.charAt(i));
			}
		}
		System.out.println("String is "+ str2);
		
		 
		
		for( i=0; i<str2.length(); i++) {
			for( j= 0; j<i; j++) { 
				if(str2.charAt(i)==(str2.charAt(j))) {
					  break;
				}
				}
			 if(j==i){           
	             str3=str3+str2.charAt(i);         
	            } 
				
			}
		System.out.println(str3);
			
			
		}
		

	}



