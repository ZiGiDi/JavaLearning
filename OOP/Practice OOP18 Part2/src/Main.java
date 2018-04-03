import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

//        Optional<Integer> opt = Optional.ofNullable(25);
//
//        Integer a = opt.orElse(10);
//
//        System.out.println(a);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 9, 8,5, 10));
        Optional<Integer> result = list.stream()
                .filter(n -> n%2==0)
                .max((a,b) -> a-b);
        System.out.println(result.get());



    }
}
