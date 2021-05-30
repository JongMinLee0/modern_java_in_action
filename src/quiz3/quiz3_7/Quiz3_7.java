package quiz3.quiz3_7;

import java.util.function.Function;

public class Quiz3_7 {

    /**
     * 인수가 세개인 생성자를 참조하는 생성자 참조를 만들어봐라.
     *
     */
    static class TempClass{

        private int a;
        private int b;
        private int c;

        TempClass(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public interface TriFunction<T, U, V, R>{
        R apply(T t, U u, V v);
    }

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, TempClass> tempFunction = TempClass::new;
    }
}
