package quiz5.quiz5_1;

import quiz4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static quiz6.quiz6_1.Quiz6_1.getDishes;

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
        return getDishes();
    }
}
