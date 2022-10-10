package testcase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import testcase.models.ExchangeRateEntity;
import testcase.services.servisImpl.CurrenciesServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/currencies-official")
public class CurrencyController {

    CurrenciesServiceImpl currenciesService;

    public CurrencyController(CurrenciesServiceImpl currenciesService) {
        this.currenciesService = currenciesService;
    }

    @GetMapping
    public ModelAndView getCurrencyNBU(ModelAndView model){
        List<ExchangeRateEntity> list = currenciesService.getAllCurrencies();
        model.addObject("listCurrency", list);
        model.setViewName("form-currency");
        return model;
    }

}
