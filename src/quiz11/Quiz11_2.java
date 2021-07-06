package quiz11;

import java.util.Optional;

public class Quiz11_2 {

    /**
     * Person / Car / Insurance 모델을 구현하는 Person 클래스에는 사람의 나이 정보를 가져오는
     * getAge라는 메서드도 있었다. 다음 시그니처를 이용해서 [예제 11-5] 의 getCarInusranceName 메서드를 고치시오
     *
     * public String getCarInsuranceName(Optional<Person> person, int minAge)
     * 즉, 인수 person이 minAge 이상의 나이일 때만 보험회사 이름을 반환한다.
     */
    // 예제 11-5
//    public String getCarInsuranceName(Optional<Person> person){
//        return person.flatMap(Person::getCar)
//                    .flatMap(Car::getInsurance)
//                    .map(Insurance::getName)
//                    .orElse("Unknown");
//    }
    public String getInsuranceName(Optional<Person> person, int minAge){
        return person.filter(p -> p.getAge() >= minAge)
                        .flatMap(Person::getCar)
                        .flatMap(Car::getInsurance)
                        .map(Insurance::getName)
                        .orElse("unknown");
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
        private int age;

        public Optional<Car> getCar(){
            return car;
        }

        public int getAge() {
            return age;
        }
    }
}
