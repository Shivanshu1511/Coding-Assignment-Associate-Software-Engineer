import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        
        boolean result = checkAnagram(str1, str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + result);
        
     
    }
    
    public static boolean checkAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase for more accurate comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}