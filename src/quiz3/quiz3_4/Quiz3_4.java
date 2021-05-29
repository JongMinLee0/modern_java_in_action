package quiz3.quiz3_4;

import java.util.function.IntFunction;

public class Quiz3_4 {

    /**
     * 다음과 같은 함수형 디스크립터(즉, 람다 표현식의 시그니처)가 있을 때 어떤 함수형 인터페이스를 사용할 수 있는가?
     * 또한 이들 함수형 인터페이스에 사용할 수 있는 유효한 람다 표현식을 제시하시오.
     *
     * 1. T -> R
     * 2. (int, int) -> int
     * 3. T -> void
     * 4. () -> T
     * 5. (T, U) -> R
     *
     */

    /**
     * 1. Function<T, R>이 대표적인 예이다. T 형식의 객체를 R형식의 객체로 변환할 때 사용한다.
     * 2. IntBinaryOperator는 (int, int) -> int 형식의 시그니처를 갖는 추상 메서드 applyAsInt를 정의한다.
     * 3. Consumer<T>는 T -> void 형식의 시그니처를 갖는 추상 메서드 accept를 정의한다.
     * 4. Supplier<T> 는 () -> T 형식을 갖는 추상 메서드 get을 정의한다.
     * 5. BiFunction<T, U, R>은 (T, U) -> R 형식의 시그니처를 갖는 추상 메서드 apply를 정의한다.
     */
}
