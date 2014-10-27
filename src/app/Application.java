package app;

import java.util.Map;
import control.Command;
import persistance.CurrencySetLoader;
import persistance.MockCurrencySetLoader;


public class Application {
    
   
   
    private Map<String, Command> commands;

    public static void main(String[] args) {
        new Application().execute();
    }

   
   

    private void loadCurrencySet() {
        CurrencySetLoader loader = new MockCurrencySetLoader();
        loader.load();
    }

    private void execute() {
        
    };
}
