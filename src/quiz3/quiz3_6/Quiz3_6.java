package quiz3.quiz3_6;


import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Quiz3_6 {
    /**
     * 람다 표현식와 일치하는 메서드 참조를 구현하시오.
     *
     * 1. ToIntFUnction<String> stringToInt = (String s) -> Integer.parseInt(s);
     * 2. BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);
     * 3. Predicate<String> startsWithNumber = (String string) -> this.startsWithNumber(String);
     *
     */

    public static void main(String[] args) {
        // 1. 정적 메서드를 호출하는 람다 표현식을 이용하여 변경할 수 있다.
        Function<String, Integer> stringToInteger = Integer::parseInt;

        // 2
        BiPredicate<List<String>, String> contains = List::contains;

        // 3
//        Predicate<String> startWithNumber = this::startWithNumber;
    }


}
