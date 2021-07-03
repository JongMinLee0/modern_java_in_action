package quiz5.quiz5_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

// 5.6 실전 연습
public class Quiz5_6 {

    public static void main(String[] args) {
        // 문제 데이터
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // 1. 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정리하시오
        List<Transaction> quiz1 = transactions.stream()
                                            .filter(t -> t.getYear() == 2011)
                                            .sorted(Comparator.comparing(Transaction::getValue))
                                            .collect(toList());
        for(Transaction transaction : quiz1)
            System.out.println(transaction.toString());

        System.out.println();
        // 2. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.
        List<String> quiz2 = transactions.stream()
                                                .map(t -> t.getTrader().getCity())
                                                .distinct()
                                                .collect(toList());
        for(String city : quiz2)
            System.out.println(city);

        System.out.println();
        // 3. 케임브릿지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        List<Trader> quiz3 = transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> trader.getCity().equals("Cambridge"))
                        .distinct()
                        .sorted(Comparator.comparing(Trader::getName))
                        .collect(toList());
        for(Trader trader : quiz3)
            System.out.println(trader.toString());


        System.out.println();
        // 4. 모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오
        List<Trader> quiz4 = transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .distinct()
                .collect(toList());
        for(Trader trader : quiz4)
            System.out.println(trader.getName());

        // 4번 정답
        String tradeStr = transactions.stream()
                            .map(transaction -> transaction.getTrader().getName())
                            .distinct()
                            .sorted()
                            .reduce("", (n1, n2) -> n1 + n2);


        System.out.println();
        // 5. 밀라노에 거래자가 있습니까?
        Optional<Trader> quiz5 = transactions.stream()
                    .map(Transaction::getTrader)
                    .filter(trader -> trader.getCity().equals("Milan"))
                    .findAny();
        System.out.println(quiz5.isPresent() ? "거래자 있습니다." : "거래자 없습니다.");

        // 5. 정답
        boolean milanBased = transactions.stream()
                                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Mailan"));


        System.out.println();
        // 6. 케임브릿지에 거주하는 거래자의 모든 트랜잭션 값을 출력하시오.
        List<Transaction> quiz6 = transactions.stream()
                    .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                    .collect(toList());
        for(Transaction transaction : quiz6)
            System.out.println(transaction.getValue());

        // 6. 정답
        transactions.stream()
                    .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                    .map(Transaction::getValue)
                    .forEach(System.out::println);

        System.out.println();
        // 7. 전체 트랜잭션 중 최댓값은 얼마인가?
        Optional<Transaction> quiz7 = transactions.stream()
                    .max(Comparator.comparing(Transaction::getValue));
        System.out.println("최댓값 : " + quiz7.get().getValue());


        System.out.println();
        // 8. 전체 트랜잭션중 최솟값은 얼마인가?
        Optional<Transaction> quiz8 = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println("최솟값 : " + quiz8.get().getValue());



    }
}
