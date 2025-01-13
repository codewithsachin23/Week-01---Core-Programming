import java.util.Scanner;

public class CreateASubString{
	
	public static String getUserInput(Scanner input,String message){
		System.out.println(message);
		return input.next();
	} 
	// declaring a substring method
	public static String findSubString(String str,int startIndex,int endIndex){
		
		StringBuilder subString=new StringBuilder();
		
		// substring using charAt method
			for(int i=startIndex;i<endIndex;i++){
				subString.append(str.charAt(i));
			}
		
		//return a boolean value
		return subString.toString();
	}
	// declaring a toComapre method
	public static boolean toCompare(String str1,String str2){
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
	try{
		// call a getUserInput method for take input from the user for string 1
		
		String str=getUserInput(input, "Enter a  String");
		
		// call a getUserInput method for take input from the user for start index
		int startIndex=Integer.parseInt(getUserInput(input, "Enter a start index"));
		
		// call a getUserInput method for take input from the user for end index
		int endIndex=Integer.parseInt(getUserInput(input, "Enter a end index"));
		
		//removing extra space from string
		str=str.trim();
		
	    // call a subString method to get result using charAt method
		String resultUsingCharAt=findSubString(str,startIndex,endIndex);	
		
		
		// checking strings using In Build method of java string subString methods
		String resultUsingSubString=str.substring(startIndex,endIndex);
		
		
		// call a toComapre methods for checking string are same or not
		boolean resultUsingToCampare=toCompare(resultUsingCharAt,resultUsingSubString);
		
		// displaying result
		if(resultUsingToCampare){
			System.out.println("sub String Using CharAt "+resultUsingCharAt+" sub String using build-in method " +resultUsingSubString+ " are same ");
		}else{
			System.out.println("sub String Using CharAt "+resultUsingCharAt+" sub String using build-in method " +resultUsingSubString+ " are not same ");
		}
	}catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric indices.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred Please enter valid numeric indices : " + e.getMessage());
        } finally {
            input.close();
        }
	}
}