package quiz2.quiz2_1.impl;

import quiz2.quiz2_1.Apple;
import quiz2.quiz2_1.AppleFormatter;

public class AppleFancyFormatter implements AppleFormatter {

    @Override
    public String accept(Apple a) {
        String characteristic = a.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + a.getColor() + " apple";
    }

}
