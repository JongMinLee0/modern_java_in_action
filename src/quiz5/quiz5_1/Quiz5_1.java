package quiz5.quiz5_1;

import quiz4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz5_1 {

    public static void main(String[] args) {
        // 처음 등장하는 두가지  고기요리를 필터링 하시오
        List<Dish> dishList = getMenu();
        List<Dish> filteringList = dishList.stream()
                                            .filter(d -> d.getType() == Dish.Type.MEAT)
                                            .limit(2)
                                            .collect(Collectors.toList());
        for(Dish dish : filteringList){
            System.out.println(dish.toString());
        }


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
