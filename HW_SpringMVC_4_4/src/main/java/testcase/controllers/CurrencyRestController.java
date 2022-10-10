package testcase.controllers;

import org.springframework.web.bind.annotation.*;
import testcase.models.Currency;
import testcase.services.servisImpl.CurrencyRandomServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/exchange")
public class CurrencyRestController {
    private final CurrencyRandomServiceImpl currencyRandomService;

    public CurrencyRestController(CurrencyRandomServiceImpl currencyRandomService) {
        this.currencyRandomService = currencyRandomService;
    }

    @GetMapping
    public @ResponseBody List<Currency> getRandomCurrencyList() {
        return currencyRandomService.getCurrencyRandom();
    }

    @GetMapping("/{currency}")
    public @ResponseBody Currency getRandomCurrency(@PathVariable("currency") Integer idCurrency) {
        return currencyRandomService.getCurrencyRandom().get(idCurrency);
    }



}
