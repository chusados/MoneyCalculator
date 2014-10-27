package persistance;

import java.util.Date;
import model.Number;
import model.Currency;
import model.ExchangeRate;
import persistance.ExchangeRateLoader;

public class MockExchangeRateLoader implements ExchangeRateLoader {

    @Override
    public ExchangeRate load(Date date, Currency from, Currency to) {
        return new ExchangeRate(date, from, to, new Number(4, 9));
    }

    @Override
    public ExchangeRate load(Currency from, Currency to) {
        return load(new Date(), from, to);
    }
}
