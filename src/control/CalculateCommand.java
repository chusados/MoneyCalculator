package control;

import model.ExchangeRate;
import model.Money;
import model.MoneyExchanger;
import persistance.ExchangeRateLoader;
import ui.CurrencyDialog;
import ui.DateDialog;
import ui.MoneyDialog;
import ui.MoneyViewer;

public class CalculateCommand implements Command {

    private final ExchangeRateLoader exchangeloader;
    private final CurrencyDialog currencyDialog;
    private final MoneyDialog moneyDialog;
    private final DateDialog dateDialog;
    private final MoneyViewer moneyViewer;

    public CalculateCommand(ExchangeRateLoader exchangeloader, MoneyDialog moneyDialog, CurrencyDialog currencyDialog, DateDialog dateDialog, MoneyViewer moneyViewer) {
        this.exchangeloader = exchangeloader;
        this.currencyDialog = currencyDialog;
        this.moneyDialog = moneyDialog;
        this.dateDialog = dateDialog;
        this.moneyViewer = moneyViewer;
    }

    @Override
    public void execute() {
        ExchangeRate exchangeRate = exchangeloader.load(dateDialog.getDate(),moneyDialog.getMoney().getCurrency(), currencyDialog.getCurrency());
        Money money = MoneyExchanger.exchange(moneyDialog.getMoney(), exchangeRate);
        moneyViewer.setMoney(money);
    }
}
