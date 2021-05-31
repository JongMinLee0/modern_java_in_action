package quiz4.quiz4_1;

import quiz4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz4_1 {
    /**
     * 다음 코드를 스트림으로 변환하라
     * List<String> highCaloricDishes = new ArrayList<>();
     * Iterator<String> iterator = menu.iterator();
     * while(iterator.hasNext()){
     *     Dish dish = iterator.next();
     *     if(dish.getCalories() > 300){
     *         highCaloricDishes.add(d.getName());
     *     }
     * }
     */
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
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

        List<String> nameList = menu.stream()
                .filter(dish -> dish.getCalories() > 300).map(Dish::getName).collect(Collectors.toList());
    }
}
