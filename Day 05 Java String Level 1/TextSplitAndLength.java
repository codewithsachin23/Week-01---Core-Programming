import java.util.Scanner;

public class TextSplitAndLength {

    // Method to split text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        // Count the number of words first
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (inWord) {
                    wordCount++;
                    inWord = false;
                }
            } else {
                inWord = true;
            }
        }
        if (inWord) {
            wordCount++;
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (word.length() > 0) {
                    words[wordIndex++] = word.toString();
                    word.setLength(0); // Clear the StringBuilder
                }
            } else {
                word.append(ch);
            }
        }

        // Add the last word if present
        if (word.length() > 0) {
            words[wordIndex] = word.toString();
        }

        return words;
    }

    // Method to find and return the length of a string without using length()
    public static int getStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D String array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String inputText = input.nextLine();

        // Split text into words
        String[] words = splitTextIntoWords(inputText);

        // Get words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display results in a tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println(wordWithLength[0] + "\t" + Integer.parseInt(wordWithLength[1]));
        }

        input.close();
    }
}
