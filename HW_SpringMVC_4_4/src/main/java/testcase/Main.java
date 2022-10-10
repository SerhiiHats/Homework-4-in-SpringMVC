package testcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Домашнее задание 4
 * Задание 4
 * Создать новый контроллер с отличающимся маппингом, который будет принимать только Get запросы
 * и отдавать случайно сгенерированную информацию в JSON формате.
 * Например, для маппинга “/uuid” выводить случайно сгенерированный uuid,
 * для маппинга “/exchange” выводить случайное значение курса валют,
 * или для “/exchange/{currency} - выводить значение курса валюты, переданной в переменной пути “currency”.
 * Для реализации задания вам нужно будет воспользоваться аннотацией @ResponseBody.
 */

@SpringBootApplication(scanBasePackages = "testcase")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
