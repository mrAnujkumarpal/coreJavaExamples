import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {

    public static void main(String[] args) {
        String str = "This is my laptop";
        char[] word = str.toCharArray();

        Set set = new HashSet();
        for (Character c : word) {
            if (c!=' ' && !set.contains(c)) {
                set.add(c);
            }
        }
        System.out.println(set);

    }

}
