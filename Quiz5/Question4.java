/**
 * Question4
 */
public class Question4 {

    public static void main(String[] args) {
        String text = "hELLO mOHAMED";
        int numberOfVowels = countVowels(text);
        System.out.println("There are " + numberOfVowels + " vowels in \"" + text + "\"");
    }

    // private static int countVowels(String text) {
    // final String vowels = "AEIOU";

    // text = text.toUpperCase();

        int vowelsCount = 0;
        for (int i = 0; i < text.length(); i++) {
            vowelsCount = 
            vowels.contains(text.charAt(i) + "") ? ++vowelsCount : vowelsCount;
        }

    private static int countVowels(String text) {
        text = text.toLowerCase();
        int numofVowels = 0;
        for (int position = 0; position < text.length(); position++) {
            char vow;
            vow = text.charAt(position);
            if (vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u') {
                numofVowels++;
            }
        }
        return numofVowels;
    }
}