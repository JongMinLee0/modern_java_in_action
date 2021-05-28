package quiz3.quiz3_1;

public class Quiz3_1 {

    /**
     * 규칙에 맞지 않는 람다 표현식을 고르라
     * 1. () -> {}
     * 2. () -> "Raoul"
     * 3. () -> {return "Mario";}
     * 4. (Integer i) -> retrun "Alan" + i
     * 5. (String s) -> {"Iron Man";}
     */


    /**
     * -> 4, 5
     *
     * 1. 파라미터가 없으며 void를 반환하는 람다 표현식이다. 이는 public void run(){} 처럼 바디가 없는 메서드와 같다.
     * 2. 파라미터가 없으며 문자열을 반환하는 표현식이다.
     * 3. 파라미터가 없으며(명시적으로 return 문을 이용해서) 문자열을 반환하는 표현식이다.
     * 4. return 은 흐름 제어문이다. (Integer i) -> {return "Alan" + i;} 처럼 되어야 올바른 람다 표현식이다.
     * 5. "Iron Man"은 구문(statement)이 아니라 표현식(expression)이다. (String s) -> "Iron Man" 처럼 되어야 올바른 표현식이다.
     *      또는 (String s) -> {return "Iron Man";} 처럼 명시적으로 return 문을 사용해야 한다.
     */
}
