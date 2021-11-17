import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadFromfileAndgetWordCount {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("abc.txt");
        String content = fis.toString();
        countWordWise(content);
    }

    private static void countWordWise(String content) {
        HashMap<String, Integer> hm = new HashMap();
        for (int i = 0; i < content.length(); i++) {
            hm.put(String.valueOf(content.charAt(i)), hm.get(content.charAt(i)) == null ? 1 : hm.get(content.charAt(i)) + 1);

        }
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }









}
