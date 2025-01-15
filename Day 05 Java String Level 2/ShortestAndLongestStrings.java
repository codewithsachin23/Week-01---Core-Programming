import java.util.Scanner;

public class ShortestAndLongestStrings{
	  

	public static String getInpotFromUser(Scanner input,String message){
		System.out.println(message);
		return input.nextLine();
	}
	// Method to split text into words using charAt() method
	public static String[] splitTheTextIntoWords(String text){
		int length = calculateLength(text);
		int wordCount=1;
		    // Counting the number of words

		for(int i=0;i<length;i++){
			if(text.charAt(i)== ' '){
				wordCount++;
			}
		}
		// Spliting the text into words
		String [] word=new String[wordCount];
		int wordIndex=0;
		int start=0;
		
		for(int i=0;i<length;i++){
			if(text.charAt(i)==' '){
				word[wordIndex]=text.substring(start,i);
				wordIndex++;
				start=i+1;
			}
		}
		
		word[wordIndex]=text.substring(start);
		return word;
	}
	  // Method to create a 2D array with words and their lengths

	
	public static String[][] wordAndItsLength(String [] word){
		String [][]wordAndLength=new String[word.length][2];
		for(int i=0;i<word.length;i++){
			wordAndLength[i][0]=word[i];
			wordAndLength[i][1]=String.valueOf(calculateLength(word[i]));
		}
		
		return wordAndLength;
	}
	
	  // Method to calculate the length of a string without using length() method

	public static int calculateLength(String text){
		int count=0;
		for(char ch:text.toCharArray()){
			count++;
		}
		return count;
	}
	
  // Method to find the shortest and longest words
	
	public static int[] shortestAndLongest(String[][] wordAndLength) {
    int shortestLength = calculateLength(wordAndLength[0][0]);
    int longestLength = calculateLength(wordAndLength[0][0]);

    for (String[] wordLength : wordAndLength) {
        int currentLength = calculateLength(wordLength[0]);

        if (currentLength < shortestLength) {
            shortestLength = currentLength;
        }
        if (currentLength > longestLength) {
            longestLength = currentLength;
        }
    }

    return new int[]{shortestLength, longestLength};
}

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		String text=getInpotFromUser(input,"Enter a String");
		
		text=text.trim();
		String [] customMethod=splitTheTextIntoWords(text);
		
		String [] buildInMethod=text.split(" ");
		
		String [][]wordAndLength=wordAndItsLength(customMethod);
		
		int result[]=shortestAndLongest(wordAndLength);
		// Display the results
        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);

        input.close();
	}	
}