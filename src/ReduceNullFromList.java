import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReduceNullFromList {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(null, 1, 2, null, 3, null);
        list.stream().filter(Objects::nonNull).forEach(System.out::println);


        // System.out.println(listWithoutNulls);


    }
}
