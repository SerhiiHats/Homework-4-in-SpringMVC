package testcase.services.servisImpl;

import org.springframework.stereotype.Service;
import testcase.models.Currency;
import testcase.services.CurrencyRandomService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CurrencyRandomServiceImpl implements CurrencyRandomService {
    private final String[] nameCarrencyArray = {"AUD", "BGN", "USD", "EUR", "PLN", "CAD", "CNY", "AED", "EGP"};
    private final Random rnd = new Random();

    @Override
    public List<Currency> getCurrencyRandom() {
        List<Currency> listCurrency = new ArrayList<>();
        for (String carrencyName : nameCarrencyArray) {
            int rndUnit = Math.max(1, rnd.nextInt(10));
            double rndAmound = Math.ceil(rnd.nextDouble() * 1000000) / 10000D;
            Currency currency = new Currency(LocalDate.now(), carrencyName, rndUnit, rndAmound);
            listCurrency.add(currency);
        }
        return listCurrency;
    }
}
