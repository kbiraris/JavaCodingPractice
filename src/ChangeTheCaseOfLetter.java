public class ChangeTheCaseOfLetter {

    public static void main(String[] args) {
        String inputString = "Hello World!";

        char[] data = inputString.toCharArray();
        StringBuilder result = new StringBuilder();

        for(char c : data){
            if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }else{
                result.append(c);
            }
        }
        System.out.println("Original String is " + inputString);
        System.out.println("Result is " + result);
    }
}
