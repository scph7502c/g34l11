package task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CurrencyCalculatorTest {

    @Test
    void testConvertCurrency() {

        CurrencyRateService rateService = mock(CurrencyRateService.class);

        when(rateService.getExchangeRate(Currency.PLN, Currency.EUR)).thenReturn(0.22);
        when(rateService.getExchangeRate(Currency.PLN, Currency.USD)).thenReturn(0.25);
        when(rateService.getExchangeRate(Currency.PLN, Currency.GBP)).thenReturn(0.19);

        CurrencyCalculator calculator = new CurrencyCalculator(rateService);

        double result = calculator.convertCurrency(100, Currency.PLN, Currency.EUR);
        double expected = 22.0;
        assertEquals(expected, result);
    }
}