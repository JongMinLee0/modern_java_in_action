package quiz3.quiz3_5;

public class Quiz3_5 {

    /**
     *  다음 코드를 컴파일할 수 없는 이유는?
     *
     *  다음 코드의 문제를 해결하시오
     *
     *  Object o = () -> { System.out.println("Tricky example"); };
     *
     * --------------------------------------------------------------------------
     *
     *  람다 표현식의 콘테스트는 Object(대상 형식)이다. 하지만 Object는 함수형 인터페이스가 아니다.
     *  따라서 () -> void 형식의 함수 디스크립터를 갖는 Runnable로 대상 형식을 빠궈서 문제를 해결할 수 있다.
     *
     *  Runnable r = () -> { System.out.println("Tricky example"); };
     *
     *  람다 표현식을 명시적으로 대상 형식을 제공하는 Runnable로 캐스팅해서 문제를 해결할 수도 았다.
     *
     *  Object o = (Runnable) () -> { System.out.println("Tricky example"); };
     *
     *  같은 함수형 디스크립터를 가진 두 함수형 인터페이스를 갖는 메소드를 오버로딩할 때 이와 같은 기법을 활용할 수 있다.
     *  어떤 메소드의 시그니처가 사용되어야 하는지를 명시적으로 구분하도록 람다를 캐스트할 수 있다.
     *
     *  예를 들어 execute(() -> {}) 라는 람다 표현식이 있다면 Runnable과 Action의 함수 디스크립터가 같으므로 누구를
     *  가리키는지가 명확하지 않다.
     *
     *  public void execute(Runnable runnable){
     *      runnable.run();
     *  }
     *
     *  public void execute(Action<T> action){
     *      action.act();
     *  }
     *
     * @FunctionalInterface
     * interface Action{
     *     void act();
     * }
     *
     * 하지만 다음처럼 캐스트를 하면 누구를 호출할 것인지가 명확해진다.
     * execute((Action) () -> {});
     */

}
