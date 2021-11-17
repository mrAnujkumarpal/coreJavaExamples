package CharCountOfString;

public class LengthOfLastWord {

    public static void main(String[] args) {

        int i = lengthOfLastWord("  day");
        System.out.println(i);
    }
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        return s.length()-s.lastIndexOf(" ")-1;
    }
    private static int  lastWordlength(String str) {
        str = str.trim();
        int len = str.length();
        if(len==1 || (!str.contains(" "))){
            return len;
        }else {
            String rev = "";
            for (int i = len - 1; i >= 0; i--) {
                if (String.valueOf(str.charAt(i)).equals(" ")) {
                    return len - (1 + i);
                }
            }
        }
        return 0;
    }
}
