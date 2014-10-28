package model;

public class Exchanger {

    public static Money exchange(Money money, ExchangeRate exchangeRate) {
        return new Money(money.getAmount(), exchangeRate.getTo());
    }
}
