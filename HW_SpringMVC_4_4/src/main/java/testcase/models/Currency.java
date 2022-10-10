package testcase.models;


import java.time.LocalDate;

public class Currency {
    private LocalDate date;
    private String currencyName;
    private int unit;
    private double amount;

    public Currency() {
    }

    public Currency(LocalDate date, String currencyName, int unit, double amount) {
        this.date = date;
        this.currencyName = currencyName;
        this.unit = unit;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
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
        return "Currency{" +
                "date=" + date +
                ", currencyName='" + currencyName + '\'' +
                ", unit=" + unit +
                ", amount=" + amount +
                '}';
    }
}


