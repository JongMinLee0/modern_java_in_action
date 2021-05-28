package quiz3.quiz3_2;

public class Quiz3_2 {

    /**
     * 다음 중 함수형 인터페이스는 무엇인가
     *
     * 1.
     * public interface Adder{
     *     int add(int a, int b);
     * }
     *
     * 2.
     * public interface SmartAdder extends Adder{
     *     int add(double a, double b);
     * }
     *
     * 3.
     * public interface Nothing{
     *
     * }
     */


    /**
     * 1. 번 Adder만이 함수형 인터페이스 이다.
     *
     * SmartAdder는 두 추상 add메서드(하나는 Adder에서 상속받음)를 포함하므로 함수명 인터페이스가 아니다.
     *
     * Nothing은 추상 메서드가 없으므로 함수형 인터페이스가 아니다.
     */
}
