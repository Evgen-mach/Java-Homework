package hw2307;

//Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
//где K — значение из массива, а Integer — количество вхождений в массив.
//Сигнатура метода: <K> Map<K, Integer> arrayToMap(K[] ks)
import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (int i = 0; i < ks.length; i++) {
            K key = ks[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String[] array = {"dog", "cat", "dog", "bird", "cat", "dog"};
        Map<String, Integer> result = arrayToMap(array);
        System.out.println(result);
    }
}