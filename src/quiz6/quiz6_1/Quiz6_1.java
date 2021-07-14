package quiz6.quiz6_1;

import quiz4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.reducing;

public class Quiz6_1 {

    // joing 컬렉터를 reducing 컬렉터로 올바르게 바꾼 코드를 모두 선택하시오.
    public static void main(String[] args) {
        List<Dish> menu = getMenu();
        // 문제
        String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining(", "));

        // 1.
        String shortMenu1 = menu.stream().map(Dish::getName).collect(reducing((s1, s2) -> s1 + s2)).get();

        // 2. compile error로 인해 주석 처리 진행
//        String shortMenu2 = menu.stream().collect(reducing((d1, d2) -> d1.getName() + d2.getName())).get();

        // 3.
        String shortMenu3 = menu.stream().collect(reducing("", Dish::getName, (s1, s2)->s1+s2));
    }

    /*
        정답 : 1, 3
        1. 원래의 joining 컬렉터 처럼 각 요리를 요리명으로 변환한 다음에 문자열을 누적자로 사용해서 문자열 스트림을 리듀스 하면서 요리명을 하나씩 연결한다.

        2. reducing은 BinaryOperator<T>, 즉 BiFunction<T, T, T>를 인수로 받는다. 즉, reducing은 두 인수를 받아
            같은 형식을 반환하는 함수를 인수로 받는다. 하지만 2번 람다 표현식은 두 개의 요리를 인수로 받아 문자열을 반환한다.

        3. 빈 문자열을 포함하는 누적자를 이용해서 리듀싱 과정을 시작하며, 스트림의 요리를 방문하면서 각 요리를 요리명으로 변환한 다음에 누적자로 추가한다.
            이전에도 설명한 것 처럼 세 개의 인수를 갖는 reducing은 누적자 초깃값을 설정할 수 없으므로 Optional을 반환할 필요가 없다

         1, 3번은 joining을 reducing으로 구현할 수 있는 것을 보여주나 실무에서는 joining을 사용하는 것이 가독성과 성능에 좋다.
     */

    public static List<Dish> getMenu() {
        return getDishes();
    }

    public static List<Dish> getDishes() {
        return Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.MEAT),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
    }
}
