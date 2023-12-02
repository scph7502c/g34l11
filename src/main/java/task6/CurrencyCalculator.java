package task6;

public class CurrencyCalculator {
    private final CurrencyRateService rateService;

    public CurrencyCalculator(CurrencyRateService rateService) {
        this.rateService = rateService;
    }

    public double convertCurrency(double amount, Currency fromCurrency, Currency toCurrency) {
        double exchangeRate = rateService.getExchangeRate(fromCurrency, toCurrency);
        return amount * exchangeRate;
    }
}