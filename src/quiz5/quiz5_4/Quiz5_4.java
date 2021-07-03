package quiz5.quiz5_4;

import java.util.stream.Stream;

public class Quiz5_4 {

    // 피보나치 수열 집합 만들기
    public static void main(String[] args) {
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .forEach(t -> System.out.println("[" + t[0] + "," + t[1] + "]"));

    }
}
