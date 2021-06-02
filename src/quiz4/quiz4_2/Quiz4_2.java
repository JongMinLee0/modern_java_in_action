package quiz4.quiz4_2;

import quiz4.Dish;

import java.util.Arrays;
import java.util.List;

public class Quiz4_2 {

    // 스트림 파이프라인에서 중간 연산과 최종 연산을 구별하시오.
    public static void main(String[] args) {
        List<Dish> menu = getMenu();

        long count = menu.stream()
                .filter(d -> d.getCalories() > 300) // 중간 연산
                .distinct() // 중간 연산
                .limit(3) // 중간 연산
                .count(); // 최종 연산 -> 스트림이 아닌 long을 반환하므로 최종연산 이다.
    }


    /**
     *  중간연산
     *  filter, map, limit, sorted, distinct
     *
     *  최종연산
     *  forEach, count, collect
     */

    public static List<Dish> getMenu() {
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
