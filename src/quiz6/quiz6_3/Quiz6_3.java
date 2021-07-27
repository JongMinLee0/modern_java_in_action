package quiz6.quiz6_3;


import java.util.List;
import java.util.function.Predicate;

public class Quiz6_3 {

    // java9에서 지원하는 takewhile을 java8에서 구현하라
    public static <A> List<A> takeWhile(List<A> list, Predicate<A> p){
        int i=0;
        for(A item : list){
            if(!p.test(item)){
                return list.subList(0, i); // 만족하지 않으면 현재 검사한 항목의 이전 항목 하위 리스트를 반환
            }
            i++;
        }
        return list; // 리스트의 모든 항목이 Predicate를 만족하므로 리스트 자체를 반환한다
    }



}
