public class ReverseString {

    public static void main(String[] args) {

        String str = "Reverse String Program";
        System.out.println("Reverse string is - " + printReverseString(str));
        reverseStringUsingStringBuffer(str);
        reverseStringUsingStringBuilder(str);
    }

    public static String printReverseString(String string) {
        System.out.println("Original string is - " + string);
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            //System.out.println(string.charAt(i));
            reverseString = reverseString + string.charAt(i);
        }
        return reverseString;
    }

    public static void reverseStringUsingStringBuffer(String string) {
        System.out.println("Original string is - " + string);

        StringBuffer str = new StringBuffer(string);
        System.out.println("Reverse string is - " + str.reverse());
    }

    public static void reverseStringUsingStringBuilder(String string) {
        System.out.println("Original string is - " + string);

        StringBuilder str = new StringBuilder(string);
        System.out.println("Reverse string is - " + str.reverse());
    }
}