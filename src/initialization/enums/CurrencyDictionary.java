package initialization.enums;

/**
 * Created by qqq on 23.04.2016.
 */
public class CurrencyDictionary {
    Currency mGuess;

    public CurrencyDictionary(Currency guess) {
        mGuess = guess;
    }

    public static void main(String[] args) {
        CurrencyDictionary cd = new CurrencyDictionary(Currency.POUND);
        cd.findCurrency(cd.mGuess);
    }

    public void findCurrency(Currency guess) {
        switch (guess) {
            case DOLLAR:
                System.out.println("USA, Australia, Canada");
                break;
            case VON:
                System.out.println("South Korea");
                break;
            case RUBLE:
                System.out.println("Russia");
                break;
            case EURO:
                System.out.println("Countries of European Union");
                break;
            case POUND:
                System.out.println("United Kingdom");
                break;
            case YEN:
                System.out.println("Japan");
                break;
            default:
                System.out.println("Sorry. No Information");
        }// end switch
    }// end findCurrency
}
