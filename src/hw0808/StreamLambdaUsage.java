package hw0808;

//Создать список строк List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
//Используя stream и lambda выполнить следующие действия:
//Удалить все содержащие “3”
//Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)
//Отбросить первый и последний элемент
//Привести в uppercase
//Выдать на печать результат
//Напечатать количество оставшихся элементов

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLambdaUsage {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

// Удалить все содержащие “3”
        List<String> without3 = myList.stream()
                .filter(s -> !s.contains("3"))
                .collect(Collectors.toList());

// Отсортировать по числу (по возрастанию)
        List<String> sortedByNumber = without3.stream()
                .sorted((s1, s2) -> {
                    int num1 = Integer.parseInt(s1.substring(1));
                    int num2 = Integer.parseInt(s2.substring(1));
                    return Integer.compare(num1, num2);
                })
                .collect(Collectors.toList());

// Отсортировать по букве (по убыванию)
        List<String> sortedByLetter = sortedByNumber.stream()
                .sorted((s1, s2) -> Character.compare(s2.charAt(0), s1.charAt(0)))
                .collect(Collectors.toList());

// Отбросить первый и последний элемент
        List<String> withoutFirstAndLast = sortedByLetter.stream()
                .skip(1)
                .limit(sortedByLetter.size() - 2)
                .collect(Collectors.toList());

// Привести в uppercase
        List<String> uppercased = withoutFirstAndLast.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

// Выдать на печать результат
        uppercased.forEach(s -> System.out.println(s));

// Напечатать количество оставшихся элементов
        System.out.println("Количество оставшихся элементов: " + uppercased.size());
    }
}