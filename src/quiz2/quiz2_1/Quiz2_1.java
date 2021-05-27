package quiz2.quiz2_1;

import quiz2.quiz2_1.impl.AppleFancyFormatter;
import quiz2.quiz2_1.impl.AppleSimpleFormatter;

import java.util.ArrayList;
import java.util.List;

public class Quiz2_1 {

    public static void main(String[] args) {
        Apple apple = new Apple(160, "Red");
        Apple apple1 = new Apple(140, "Green");
        List<Apple> appleList = new ArrayList<>();
        appleList.add(apple);
        appleList.add(apple1);
        prettyPrintApple(appleList, new AppleFancyFormatter());
        prettyPrintApple(appleList, new AppleSimpleFormatter());
    }

    private static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
        for(Apple apple : inventory){
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

}
