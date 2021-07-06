package quiz11;

import java.util.Optional;
import java.util.Properties;

public class Quiz11_3 {

    // 다음의 코드를 개선하여라
    public int readDuration(Properties props, String name){
        String value = props.getProperty(name);
        if(value != null){
            try{
                int i = Integer.parseInt(value);
                if(i > 0)
                    return i;
            }catch (NumberFormatException nfe){

            }
        }
        return 0;
    }

    // null일 때와 양수의 처리를 하지 않았다
    public int readDurationAnswer(Properties props, String name){
        return Optional.of(props).map(p -> Integer.parseInt(p.getProperty(name))).orElse(0);
    }

    public int answer(Properties props, String name){
        return Optional.ofNullable(props.getProperty(name))
                    .flatMap(Quiz11_3::stringToInt)
                    .filter(i -> i > 0)
                    .orElse(0);
    }

    public static Optional<Integer> stringToInt(String s){
        try{
            return Optional.of(Integer.parseInt(s));
        }catch (NumberFormatException e){
            return Optional.empty();
        }
    }
}
