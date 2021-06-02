package quiz4.quiz4_1;

import quiz4.Dish;
import quiz4.quiz4_2.Quiz4_2;

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
        List<Dish> menu = Quiz4_2.getMenu();

        List<String> nameList = menu.stream()
                .filter(dish -> dish.getCalories() > 300).map(Dish::getName).collect(Collectors.toList());
    }
}
