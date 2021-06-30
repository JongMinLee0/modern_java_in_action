package quiz5.quiz5_2;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz5_2 {

    public static void main(String[] args) {
        question1();
        question2();
        question3();
    }


    // 숫자 리스트가 주어졌을 때 각 숫자의 제곱근으로 이루어진 리스트를 반환하십시오
    // 예를들어 [1,2,3,4,5] 가 주어지면 [1,4,9,16,25]를 반환해야 한다
    private static void question1(){
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> answer = numberList.stream()
                .map(x->x*x)
                .collect(Collectors.toList());

        for(int element : answer)
            System.out.print(element + ", ");
        System.out.println();
    }

    // 두 개의 숫자 리스트가 있을 때 모든 숫자 쌍의 리스트를 반환 하시오
    // 예를 들어 [1,2,3]과 [3,4]가 주어지면 [(1,3), (1,4), (2,3), (2,4), (3,3), (3,4)]
    private static void question2(){
        List<Integer> firstList = Arrays.asList(1,2,3);
        List<Integer> secondList = Arrays.asList(3,4);

        List<int[]> answerList = firstList.stream()
                                    .flatMap(i -> secondList.stream()
                                            .map(j -> new int[]{i, j}))
                                    .collect(Collectors.toList());

        for(int[] innerArray : answerList){
            System.out.print("[" + innerArray[0] + "," + innerArray[1] + "] ");
        }
        System.out.println();
    }

    // question2()에서 합이 3으로 나누어 떨어지는 애들만 반환하라
    private static void question3(){
        List<Integer> firstList = Arrays.asList(1, 2, 3);
        List<Integer> secondList = Arrays.asList(3, 4);

        List<int[]> answerList = firstList.stream()
                                    .flatMap(i -> secondList.stream()
                                                    .filter(j -> (i + j) % 3 == 0)
                                                    .map(j -> new int[]{i, j}))
                                    .collect(Collectors.toList());

        for(int[] innerArray : answerList){
            System.out.print("[" + innerArray[0] + "," + innerArray[1] + "] ");
        }
        System.out.println();
    }
}
