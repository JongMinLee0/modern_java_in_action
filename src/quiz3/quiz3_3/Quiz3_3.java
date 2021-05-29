package quiz3.quiz3_3;


public class Quiz3_3 {

    /**
     * 다음 중 람다 표현식을 올바르게 사용한 코드는?
     * 1. execute(() -> {});
     * public void execute(Runnable r){
     *     r.run();
     * }
     *
     * 2. public Callable<String> fetch(){
     *     return () -> "Trickey example ;-)";
     * }
     *
     * 3. Predicate<Apple> p = (Apple a) -> a.getWeight();
     *
     */

    /**
     * 정답은 1, 2번이다. (난 1,2 번중 2번을 선택했다. 답이 하나라고 생각하는 고정관념을 없애자)
     * 첫 번째 예제에서 람다 표현식 () -> {} 의 시그니쳐는 () -> void 며 Runnable의 추상메서드 run의 시그니처와
     * 일치하므로 유효한 람다 표현식이다.
     *
     * 두 번쩨 예제도 유효한 람도 표현식이다. fetch 메서드의 반환 형식은 Callable<String>이다. T를 String으로 대치 했을 때
     * Callable<String> 메서드의 시그니처는 () -> String이 된다. () -> "Tricky..." 는 ()->String 시그니처 이므로 유효한 람다 표현식이다.
     *
     * 세 번째 예제에서 람다 표현식 (Apple a) -> a.get-Weight()의 시그니처는 (Apple) -> Integer 이므로
     * Predicate<Apple> : (Apple) -> boolean의 test 메서드와 일치하지 않는다.
     *
     */




}
