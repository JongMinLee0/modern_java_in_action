package quiz2.quiz2_1.impl;

import quiz2.quiz2_1.Apple;
import quiz2.quiz2_1.AppleFormatter;

public class AppleSimpleFormatter implements AppleFormatter {
    @Override
    public String accept(Apple a) {
        return "An apple of " + a.getWeight() + "g";
    }
}
