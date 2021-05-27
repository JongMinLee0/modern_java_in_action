package quiz2.quiz2_2;

public class Quiz2_2 {

    public final int value = 4;
    public void doIt(){
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        Quiz2_2 quiz2_2 = new Quiz2_2();
        quiz2_2.doIt(); // 여기서의 출력 결과는???
        // code에서 this는 Quiz2_2가 아니라 Runnable을 참조하므로 5가 정답이다.
    }

}
