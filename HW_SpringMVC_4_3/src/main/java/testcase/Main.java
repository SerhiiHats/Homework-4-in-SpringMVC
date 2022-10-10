package testcase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Домашнее задание 4
 * Задание 3
 * Добавьте на форму, реализованную во втором задании,
 * кнопку, после нажатия на которую все записи из файла будут выведены на страницу.
 */

@SpringBootApplication(scanBasePackages = "testcase")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
}
