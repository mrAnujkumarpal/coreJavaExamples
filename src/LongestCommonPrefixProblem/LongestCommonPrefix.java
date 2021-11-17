package LongestCommonPrefixProblem;

public class LongestCommonPrefix {

    public static void main(String[] args) {

       String[] str={"flower","flow","flop"};
       System.out.println(LCP(str));

        String[] str1={"dog","racecar","car"};
        System.out.println(LCP(str1));

        String[] str2={"a"};
       System.out.println(LCP(str2));
    }

    private static String LCP(String[] str) {
        String checkFor="";
        for(int i=0; i<str[0].length(); i++){
             checkFor=str[0].substring(0,i+1);
            //System.out.println(checkFor);
            for(int j=1; j<str.length;j++){
                if(! str[j].startsWith(checkFor) ){
                  return checkFor.substring(0,checkFor.length()-1);
                }
            }
        }
        return checkFor;
    }
}
