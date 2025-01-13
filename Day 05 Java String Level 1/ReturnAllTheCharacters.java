import java.util.Scanner;

public class ReturnAllTheCharacters{
	
	public static String getUserInput(Scanner input,String message){
		System.out.println(message);
		return input.next();
	} 
	// declaring a substring method
	public static char[] findAllCharacters(String text){	
		char [] charArray=new char[text.length()];	
		// substring using charAt method
			for(int i=0;i<text.length();i++){
				charArray[i]=text.charAt(i);
			}
		
		//return a boolean value
		return charArray;
	}
	// declaring a toComapre method
	public static boolean toCompare(char [] arr1,char[] arr2){
		// comparing a arr1 and arr2 using charAt method
		if(arr1.length!=arr2.length){
			return false;
		}else{
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]!=arr2[i]){
					return false;
				}
			}
		}
		//return a boolean value
		return true;
	}
	// Method to print char array in a readable format
    public static void printCharArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println(); // for new line after printing characters
    }

	public static void main (String [] args){
		
		// declaring a Scanner class to take a input
		Scanner input= new Scanner(System.in);
	
		// call a getUserInput method for take input from the user for string 
		String text=getUserInput(input, "Enter a  String");
		
		//removing extra space from string
		text=text.trim();
		
	     // Get characters using the user-defined method
		char [] resultGetCharacters=findAllCharacters(text);	
		
		
		// Get characters using the built-in toCharArray() method
		char []resultUsingToCharArray=text.toCharArray();
		
		
		// call a toComapre methods for checking string are same or not
		boolean resultUsingToCampare=toCompare(resultGetCharacters,resultUsingToCharArray);
		
		// displaying result
		if(resultUsingToCampare){
			 System.out.println("Characters using user-defined method: ");
            printCharArray(resultGetCharacters);

            System.out.println("Characters using built-in method: ");
            printCharArray(resultUsingToCharArray);
			System.out.println("are same");
			
		}else{
			System.out.println("Characters using user-defined method and characters using build-in method are not same ");
		}
	
	}
}