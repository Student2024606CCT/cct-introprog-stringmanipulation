public class Main {

    public static void main(String[] args) {
        InputUtilities input = new InputUtilities();
        String name = input.askUserForText("Enter your name, please:");
        System.out.println(reverse3FirstLetters(name));
        System.out.println(capitalizeFirstAndLast(name));
        System.out.println(replaceVowels(name));

    }

    /**
     * Method to reverse the 3 first letters
     *
     * @param str String original
     * @return String
     */
    public static String reverse3FirstLetters(String str) {
        //Str must have at least 3 letters
        if(str.length()<3) return str;
        // Get 3 first letters
        String firstLetters = str.substring(0, 3);
        // Reverse
        StringBuilder reverso = new StringBuilder(firstLetters).reverse();
        // Join
        return reverso.toString() + str.substring(3);
    }

    /**
     * Method to capitalize the first and last letters of a string.
     *
     * @param str The input string
     * @return
     */
    public static String capitalizeFirstAndLast(String str) {
        // Convert the entire string to lowercase
        String strLowerCased = str.toLowerCase();
        // Get the first letter
        String first = String.valueOf(strLowerCased.charAt(0)).toUpperCase();
        // Get the last letter
        String last = String.valueOf(strLowerCased.charAt(strLowerCased.length() - 1)).toUpperCase();
        // Join
        String middle = strLowerCased.substring(1, strLowerCased.length() - 1);
        return first + middle + last;
    }

    /**
     * Method to replace all vowels with '0'
     *
     * @param str The input string
     * @return
     */
    public static String replaceVowels(String str) {
        // Replace all vowels (a, e, i, o, u) using regex, ignoring case
        return str.replaceAll("(?i)[aeiou]", "0");
    }
}