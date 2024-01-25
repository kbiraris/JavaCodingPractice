import java.util.HashMap;
import java.util.Map;

public class PrintVowelFrequencyInString {

    public static void main(String[] args) {
        String inputString = "Print Vowel Frequency In String";
        printVowelFrequency(inputString);
    }
    private static void printVowelFrequency(String inputString) {
        //convert the String to lowercase to make the comparison case-insensitive
        inputString = inputString.toLowerCase();
        //System.out.println(printVowelFrequency);

        //Create a map to store the frequency of each vowel
        Map<Character, Integer> vowelFrequency = new HashMap<>();

        // Define the vowels
        char[] vowels = {'a','e','i','o','u'};

        // Initialize the frequency map
        for(char vowel :vowels){
            vowelFrequency.put(vowel,0);
        }

        // Iterate through the input string and calculate the frequency
        for(char ch : inputString.toCharArray()) {
            // Check if the character/Key contains in the Map
            if (vowelFrequency.containsKey(ch)) {
                // Increment the frequency count for the vowel/key
                vowelFrequency.put(ch, vowelFrequency.get(ch) + 1);
                //System.out.println(vowelFrequency);
            }
        }

        // Print the Map key-value which shows the frequency of each vowel
        for(Map.Entry<Character,Integer> entry: vowelFrequency.entrySet()) {
            System.out.println("Frequency of the Vowel " + entry.getKey() + " found " + entry.getValue() + " times in given string");
        }

        //One more way to print map key-value as get() method returns the value to which the specified key is mapped
        for(Object key : vowelFrequency.keySet()){
            System.out.println("Vowel " + key + " Frequency " + vowelFrequency.get(key));

        }
    }
}
