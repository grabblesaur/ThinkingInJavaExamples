package initialization.enums;

/**
 * Created by qqq on 23.04.2016.
 */
public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
        System.out.println(howHot.name());

        for (Spiciness howSpicy : Spiciness.values()) {
            System.out.println(howSpicy +
                    " ordinal: " + howSpicy.ordinal());
        }
    }
}
