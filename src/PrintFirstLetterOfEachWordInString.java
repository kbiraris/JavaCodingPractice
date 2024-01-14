public class PrintFirstLetterOfEachWordInString {

    public static void main(String[] args) {
        String str = "My name is Kunal";
        printFirstLetter(str);

    }
    public static void printFirstLetter(String str){
        System.out.println("Given String is : "+ str);
        String [] stringSplitArray = str.split(" ");
        /* to print the stringArray
        for(String s : stringArray){
            System.out.println(s);
        }
        */
        String temp="";
        for(int i=0;i<stringSplitArray.length;i++){
            //System.out.println(stringArray[i]);
            //System.out.print(stringSplitArray[i].charAt(0));
            temp = temp + stringSplitArray[i].charAt(0);
        }
        System.out.print("First Letter Of Each Word In String is - " + temp);
    }
}
