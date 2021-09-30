package oracleMessageDescriptionProblem;

import java.util.Arrays;

public class DescriptionMessageProblem {

    public static void main(String[] args) {
        System.out.println(decryption("Hell1o hi o"));
    }

    public static String decryption(String input) {
        String strArr[] = input.split(" ");
        int len = strArr.length;
        String[] finalArray = new String[len];
        for (int i = 0; i < len; i++) {
            char[] c = strArr[i].toCharArray();
            String alpha = "";
            int num = 0;
            for (int j = 0; j < c.length; j++) {
                if (Character.isDigit(c[j])) {
                    num = num + Integer.parseInt(String.valueOf(c[j]));
                } else if (Character.isAlphabetic(c[j])) {
                    alpha = alpha.concat(String.valueOf(c[j]));
                }
            }
            finalArray[num] = alpha;
        }
        String s = Arrays.toString(finalArray).replace("," ," ");

        return s.substring(1, s.length() - 1).trim();
    }


}
