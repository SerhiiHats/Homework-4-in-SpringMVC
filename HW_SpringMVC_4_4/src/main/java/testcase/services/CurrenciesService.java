package testcase.services;

import testcase.models.ExchangeRateEntity;

import java.util.List;


public interface CurrenciesService {

    List<ExchangeRateEntity> getAllCurrencies();

}
