package quiz11;

import java.util.Optional;

public class Quiz11_1 {

    // map과 flatMap을 이용해서 기존의 NullSafeFindCheapestInsurance() 메서드를 한줄의 코드로 재구현 하시오

    // 정답
    public Optional<Insurance> myAnswer(Optional<Person> person, Optional<Car> car){
        return person.flatMap(p -> car.map(c -> findCheapestInsurance(p, c)));
    }
    /*
        [정답에 대한 해설]
        첫 번째 Optional에 flatMap을 호출 했으므로 첫 번째 Optional이 비어 있다면 인수로 전달한 람다 표현식이 실행되지 않고
        그대로 빈 Optional을 반환한다. 반면 Person에 값이 있으면 flatMap 메서드에 필요한 Optional<Insurance>를 반환하는 Function의
        입력으로 person을 사용한다. 이 함수의 바디에서는 두 번째 Optional에 map을 호출하므로 Optional이 Car 값을 포함하지 않으면
        Function은 빈 Optional을 반환하므로 결국 nullSafeFindCheapestInsurance는 빈 Optional을 반환한다.
     */




    // 기존 코드
    public Optional<Insurance> nullSafeFindCheapestInsurance(Optional<Person> person, Optional<Car> car){
        if(person.isPresent() && car.isPresent()){
            return Optional.of(findCheapestInsurance(person.get(), car.get()));
        }else{
            return Optional.empty();
        }
    }

    // Ex code
    public Insurance findCheapestInsurance(Person person, Car car){
        // 다양항 보험회사가 제공하는 서비스 조회
        // 모든 결과 데이터 비교
        return new Insurance();
    }

    private class Insurance{
        private String name;
        public String getName(){
            return name;
        }
    }

    private class Car{
        private Optional<Insurance> insurance;
        public Optional<Insurance> getInsurance(){
            return insurance;
        }
    }

    private class Person{
        private Optional<Car> car;
        public Optional<Car> getCar(){
            return car;
        }
    }
}
