package ru.education.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExample {

    public static int[] intArray = {120, 410, 85, 32, 314, 12, 343};

    public static String[] authorsArray = {
            "Уильям Шекспир",
            "Артур Конан Дойл",
            "Агата Кристи",
            "Чарльз Диккенс",
            "Редьярд Киплинг",
            "Оскар Уайльд",
            "Джоан Роулинг",
            "Джон Толкин",
            "Герберт Уэллс",
            "Роберт Люис Стивенсон",
            "Даниэль Дефо",
            "Джонатан Свифт",
            "Джордж Байрон",
            "Льюис Кэррол",
            "Сомерсет Моэм"};

    public static List<Integer> listOfInt = Arrays.asList(1, 2, 4, 6, 7, 23, 112, 3245234, 22, 1, 4232, 4);

    public static Map<Integer, String> authorsMap = new HashMap<>() {
        {
            put(1, "Уильям Шекспир");
            put(2, "Артур Конан Дойл");
            put(3, "Агата Кристи");
            put(4, "Чарльз Диккенс");
            put(5, "Редьярд Киплинг");
            put(6, "Оскар Уайльд");
            put(7, "Джоан Роулинг");
            put(8, "Джон Толкин");
            put(9, "Герберт Уэллс");
            put(10, "Роберт Люис Стивенсон");
            put(11, "Даниэль Дефо");
            put(12, "Джонатан Свифт");
            put(13, "Джордж Байрон");
            put(14, "Льюис Кэррол");
            put(15, "Сомерсет Моэм");
        }
    };

}
