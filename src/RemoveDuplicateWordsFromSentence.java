import java.util.*;

public class RemoveDuplicateWordsFromSentence {
    public static void main(String[] args) {

        String originalString = "Remove duplicate word word Remove";
        System.out.println("Original String -> " + originalString);
        System.out.println("After removing duplicates -> " + removeDuplicateFromString(originalString));
    }

    static String removeDuplicateFromString(String originalString) {

        String[] splitString = originalString.split(" ");

        HashSet<String> setString = new HashSet<>();

        StringBuilder resultBuffer  = new StringBuilder();

        for(String word : splitString){
            if(setString.add(word)){
                resultBuffer.append(word).append(" ");
            }
        }
        return resultBuffer.toString();
    }
}