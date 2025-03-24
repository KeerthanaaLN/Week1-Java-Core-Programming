import java.util.*;

class CharacterExtractor {

    static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = in.next();

        char[] userDefinedCharacters = getCharacters(str);

        char[] builtInCharacters = str.toCharArray();

        boolean areEqual = compareArrays(userDefinedCharacters, builtInCharacters);

        System.out.println("Characters using user-defined method: " + Arrays.toString(userDefinedCharacters));
        System.out.println("Characters using toCharArray(): " + Arrays.toString(builtInCharacters));
        System.out.println("Comparison result: " + areEqual);

        if (areEqual) {
            System.out.println("Both methods return the same characters.");
        } else {
            System.out.println("Methods return different results.");
        }

        in.close();
    }
}
