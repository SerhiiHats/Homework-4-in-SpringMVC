package testcase.services.servisImpl;

import org.springframework.stereotype.Service;
import testcase.models.ExchangeRateEntity;
import testcase.utils.parser.JacksonParser;
import testcase.services.CurrenciesService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CurrenciesServiceImpl implements CurrenciesService {
    @Override
    public List<ExchangeRateEntity> getAllCurrencies() {
        final String PATH_URL_NBU = "https://bank.gov.ua/NBU_Exchange/exchange?json";
        List<ExchangeRateEntity> list = new ArrayList<>();
        try {
            list = JacksonParser.parseJson(PATH_URL_NBU);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
