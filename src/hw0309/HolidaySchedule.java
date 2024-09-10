package hw0309;

//DateTime API
//Распечатать график праздников на текущий год используя форматирование
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class HolidaySchedule {
    public static void main(String[] args) {

        List<LocalDate> holidays = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // Новый год
                LocalDate.of(2024, 5, 9),  // День Победы
                LocalDate.of(2024, 7, 3),  // День Независимости Республики Беларусь
                LocalDate.of(2024, 11, 7), // День Октябрьской революции
                LocalDate.of(2024, 12, 25) // Рождество Христово (католическое)
        );


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.println("График праздников на 2024 год:");
        holidays.forEach(holiday -> System.out.println(holiday.format(formatter)));
    }
}