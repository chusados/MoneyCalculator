package model;

import java.util.ArrayList;
import java.util.List;

public class CurrencySet {

    private final List<Currency> list = new ArrayList<Currency>();

    public boolean add(Currency currency) {
        return list.add(currency);
    }

    public Currency get(int index) {
        return list.get(index);
    }

    public Currency[] toArray() {
        return list.toArray(new Currency[list.size()]);
    }
}

   /* public Currency[] search(String token) {
        ArrayList<Currency> list = new ArrayList<>();
        for (Currency currency : this) {
            if (currency.getCode().equalsIgnoreCase(token)) {
                list.add(currency);
            } else if (currency.getName().toLowerCase().contains(token.toLowerCase())) {
                list.add(currency);
            } else if (currency.getSymbol().equalsIgnoreCase(token)) {
                list.add(currency);
            }
        }
        return list.toArray(new Currency[0]);
    }*/

