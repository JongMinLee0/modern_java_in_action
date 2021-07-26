package quiz6.quiz6_2;

import quiz4.Dish;
import java.util.List;
import static java.util.stream.Collectors.*;
import static quiz6.quiz6_1.Quiz6_1.getMenu;

public class Quiz6_2 {

    public static void main(String[] args) {
        /*
            groupingBy 컬렉터와 마찬가지로 partitioningBy 컬렉터도 다른 컬렉터와 조합해서 사용할 수 있다.
            특히 두 개의 partitioningBy 컬렉터를 이용해서 다수준 분할을 수행할 수 있다. 다음 코드의 다수준 분할 결과를 예측해보자.
         */

        List<Dish> menu = getMenu();

        // 1.
        menu.stream().collect(partitioningBy(Dish::isVegetarian, partitioningBy(d -> d.getCalories() > 500)));

        // 2.
//        menu.stream().collect(partitioningBy(Dish::isVegetarian, partitioningBy(Dish::getType)));

        // 3.
        menu.stream().collect(partitioningBy(Dish::isVegetarian, counting()));


        /*
        1. 유효한 다수준 분할 코드며, 다음과 같은 두 수준의 맵을 반환한다
        {false = {false = [chicken, prawns, salmon]. true[port, beef]},
        true = {false = [rice, season fruit], true = [french fries, pizza]}}

        2. partitioningBy는 불리언을 반환하는 함수, 즉 프리디케이트를 요구하므로 컴파일 되지 않는 코드다.
        Dish::getType은 프리디케이트로 사용할 수 없는 메서드 참조이다.

        3. 분할된 각 항목의 개수를 계산하는 코드로 다음과 같은 맵을 반환한다.
        {false = 5, true = 4}
         */
    }
}
