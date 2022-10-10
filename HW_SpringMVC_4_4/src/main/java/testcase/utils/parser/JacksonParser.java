package testcase.utils.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import testcase.models.ExchangeRateEntity;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class JacksonParser {

    public static List<ExchangeRateEntity> parseJson(String urlNBUExchange) throws IOException {
        //создали mapper Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        ExchangeRateEntity[] exchangeRateEntities = objectMapper.readValue(new URL(urlNBUExchange), ExchangeRateEntity[].class);
        List<ExchangeRateEntity> exchangeRateEntityList = Arrays.asList(exchangeRateEntities);

        // вызываем метод - writerWithDefaultPrettyPrinter() - (он создает более читабельный файл)- и по нему вызываем метод - writeValueAsString(exchangeRateEntities);
        String jsonStringCurrency = objectMapper.writeValueAsString(exchangeRateEntities);
        Files.write(Paths.get("src/main/resources/ExchangeCurrency.json"),
                jsonStringCurrency.getBytes(), StandardOpenOption.CREATE);

        return exchangeRateEntityList;
    }
}
