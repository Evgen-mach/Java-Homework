package hw0907;

//RegEx. IP адрес. 4 группы цифр (от 1 до 3 цифр в каждой) разделены точками. Группа содержит число в диапазоне от 1 до 255
//Пример: 127.0.0.1  255.255.255.253   100.99.44.2
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IPValidator {
    public static void main(String[] args) {
        String[] ipAddresses = {"127.0.0.1", "255.255.255.253", "100.99.44.2", "256.256.256.256", "-1.256.256.256", "255.255.1"};
        String regex = "\\b((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\b";

        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < ipAddresses.length; i++) {
            String ip = ipAddresses[i];
            Matcher matcher = pattern.matcher(ip);
            if (matcher.matches()) {
                System.out.println(ip + " is a valid IP address.");
            } else {
                System.out.println(ip + " is not a valid IP address.");
            }
        }
    }
}