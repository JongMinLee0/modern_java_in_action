package quiz5.quiz5_3;

import quiz4.Dish;

import java.util.Arrays;
import java.util.List;

import static quiz6.quiz6_1.Quiz6_1.getDishes;

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
        return getDishes();
    }
}
