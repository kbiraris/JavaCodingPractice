public class ReverseSentence {

    public static void main(String[] args) {
        String str = "Hello I am Kunal Biraris";
        printReverseSentence(str);
    }

    private static void printReverseSentence(String str)
    {
        String [] strSplit = str.split(" ");
        //System.out.println(strSplit[1]);

        for(int i=strSplit.length-1; i>=0; i--)
        {
            System.out.print(strSplit[i]+" ");
        }
    }
}
