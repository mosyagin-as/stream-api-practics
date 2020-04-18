package ru.education.stream;

import ru.education.stream.CollectionExample;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class CreateMethods {

    public static void main(String[] args) {

        // Пустой стрим:
        Stream<String> emptyStream = Stream.empty();

        // Стрим из List
        Stream<Integer> listOfIntStream = CollectionExample.listOfInt.stream();

        // Стрим из Map
        Stream<Map.Entry<Integer, String>> mapStream = CollectionExample.authorsMap.entrySet().stream();

        // Стрим из массива
        Stream<String> authorsStream = Arrays.stream(CollectionExample.authorsArray);

        // Стрим из указанных элементов
        Stream<String> stringStream = Stream.of("a", "b", "c", "d");

        // Параллельные стримы
        Stream<String> emptyParallelStream = emptyStream.parallel();
        Stream<Integer> listOfIntParallelStream = CollectionExample.listOfInt.parallelStream();

        // Создание стрима с проверкой элемента на null
        String str = Math.random() > 0.5 ? "I'm feeling lucky" : null;
        Stream.ofNullable(str)
                .forEach(System.out::println);

        // Создание бесконечного стрима из генерируемой последовательности
        Stream.generate(() -> Math.random() * 10)
                .limit(6)
                .forEach(System.out::println);

        // Создание бесконечного стрима с элементами,
        // которые образуются в результате последовательного применения функции f к итерируемому значению
        Stream.iterate(2, x -> x + 6)
                .limit(6)
                .forEach(System.out::println);

        // Java 9 к методу Iterate добавлен аргумент hasNext. Таким образом можно создать конечный стрим
        Stream.iterate(2, x -> x < 40, x -> x + 7)
                .forEach(System.out::println);

        // Объединение двух стримов. Из каждого берем по 3 первых элемента
        Stream.concat(authorsStream.limit(3), stringStream.limit(3))
                .forEach(System.out::println);

        // Использование билдера
        Stream<Object> buildStream = Stream.builder()
                .add("Hello")
                .add("World")
                .add(123)
                .add(LocalDateTime.now())
                .build();

        Stream<Integer> buildIntegerStream = Stream.<Integer>builder()
                .add(123)
                .add(456)
                .add(789)
                .build();

        // Стримы для примитивов
        IntStream intStream = Arrays.stream(CollectionExample.intArray);
        DoubleStream doubleStream = DoubleStream.of(12.1, 11233.1123, 1232333.44, 6784.3);
        LongStream longStream = LongStream.of(1, 2, 43, 34, 12, 31, 23, 3);

        IntStream.range(2, 5)
                .forEach(System.out::println);

        LongStream.rangeClosed(-8, -5)
                .forEach(System.out::println);

    }
}
