package testcase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Домашнее задание 4
 * Задание 2
 * Создайте контроллер и HTML форму, данные из которой будут записываться в файл,
 * а после отправки формы будет выводиться сообщение об успешной операции
 * и количестве записей за все время работы приложения.
 */

@SpringBootApplication(scanBasePackages = "testcase")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
}
