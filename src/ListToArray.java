import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc", "xyz", "amzi", "ldp", "axy");
        List<String> subList = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("a")) {
                subList.add(s);
            }
        }
        System.out.println(subList);

    }
}
