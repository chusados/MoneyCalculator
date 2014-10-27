package persistance;

import model.Currency;
import model.CurrencySet;
import persistance.CurrencySetLoader;

public class MockCurrencySetLoader implements CurrencySetLoader {

    private CurrencySet instance;

    @Override
    public CurrencySet load() {
        instance = CurrencySet.getInstance();
        instance.add(new Currency("Dolar Americano", "USD", "$"));
        instance.add(new Currency("Dolar Canadiense", "CND", "$"));
        instance.add(new Currency("Euro", "EUR", "€"));
        instance.add(new Currency("Libra", "LIB", "£"));
        instance.add(new Currency("Yen", "JPY", "¥"));
        instance.add(new Currency("Peso Mexicano", "MXN", "$"));
        return instance;
    }
}
