import java.util.Scanner;

public class CompareTwoStrings{
	// declaring a toComapre method
	public static boolean toComapre(String str1,String str2){
		// checking a str1 and str2 using charAt method
		if(str1.length()!=str2.length()){
			return false;
		}else{
			for(int i=0;i<str1.length();i++){
				if(str1.charAt(i)!=str2.charAt(i)){
					return false;
				}
			}
		}
		//return a boolean value
		return true;
	}
	public static void main (String [] args){
		// declaring a Scanner class to take a input
		Scanner input= new Scanner(System.in);
		
		// take input from the user for string 1
		System.out.println("Enter a first String ");
		String str1=input.next();
		// take input from the user for string 2
		System.out.println("Enter a second String ");
		String str2=input.next();
		
		//removing extra space from string
		str1=str1.trim();
		str2=str2.trim();
		
		// call a toComapre methods for checking string are same or not
		boolean resultUsingCharAt=toComapre(str1,str2);
		// checking strings using In Build method of java string equals methods
		boolean resultUsingEquals=str1.equals(str2);
		
		// displaying result
		if(resultUsingCharAt == resultUsingEquals){
			System.out.println("String one "+str1+" String two " +str2+ " are same ");
		}else{
			System.out.println("String one "+str1+" String two " +str2+ " are not same ");

		}
	}
	
}