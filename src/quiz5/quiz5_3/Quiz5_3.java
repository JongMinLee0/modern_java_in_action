package quiz5.quiz5_3;

import quiz4.Dish;

import java.util.Arrays;
import java.util.List;

public class Quiz5_3 {

    public static void main(String[] args) {
        // map과 reduce를 이용해서 스트림의 요리 개수를 계산하시오.
        List<Dish> dishes = getMenu();
        int countMenu = dishes.stream()
                                .map(r -> 1)
                                .reduce(0, Integer::sum);
        long countMenu2 = dishes.stream().count();
        System.out.println(countMenu);
        System.out.println(countMenu2);
    }

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
