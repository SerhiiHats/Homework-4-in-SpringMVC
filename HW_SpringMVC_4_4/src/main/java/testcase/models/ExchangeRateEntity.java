package testcase.models;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeRateEntity {
    @JsonProperty("StartDate")
    private String startDate;       // StartDate":"23.09.2022"
    @JsonProperty("TimeSign")
    private String timeSign;        // TimeSign":"0000"
    @JsonProperty("CurrencyCode")
    private String currencyCode;       // CurrencyCode":"036"
    @JsonProperty("CurrencyCodeL")
    private String currencyCodeL;      //  CurrencyCodeL":"AUD"
    @JsonProperty("Units")
    private int unit;                  //  Units":1
    @JsonProperty("Amount")
    private double amount;             // Amount":24.3199

    //String nameCurrency;
    //"StartDate":"23.09.2022","TimeSign":"0000","CurrencyCode":"036","CurrencyCodeL":"AUD","Units":1,"Amount":24.3199
    // https://bank.gov.ua/NBU_Exchange/exchange?json


    public ExchangeRateEntity() {
    }

    public ExchangeRateEntity(String startDate, String timeSign, String currencyCode, String currencyCodeL, int unit, double amount) {
        this.startDate = startDate;
        this.timeSign = timeSign;
        this.currencyCode = currencyCode;
        this.currencyCodeL = currencyCodeL;
        this.unit = unit;
        this.amount = amount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTimeSign() {
        return timeSign;
    }

    public void setTimeSign(String timeSign) {
        this.timeSign = timeSign;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCodeL() {
        return currencyCodeL;
    }

    public void setCurrencyCodeL(String currencyCodeL) {
        this.currencyCodeL = currencyCodeL;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ExchangeRateEntity{" +
                "startDate='" + startDate + '\'' +
                ", timeSign='" + timeSign + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", currencyCodeL='" + currencyCodeL + '\'' +
                ", unit=" + unit +
                ", amount=" + amount +
                '}';
    }
}
