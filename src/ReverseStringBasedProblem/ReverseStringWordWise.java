package ReverseStringBasedProblem;


public class ReverseStringWordWise {
    public static void main(String[] args) {


        String s = "This is office laptop";

        System.out.println(s.toString());
        //System.out.println();
        String word[] = s.split(" ");
        System.out.println(word.length);
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(reverseStr(word[i])+ " ");
        }


    }

    private static String reverseStr(String str) {

        String reverseWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseWord += str.charAt(i);
        }
        return reverseWord;

    }
}
