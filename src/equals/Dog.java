package equals;

/**
 * Created by qqq on 28.03.2016.
 */
public class Dog {
    private String mName;
    private String mSays;

    public Dog (String name, String says) {
        mName = name;
        mSays = says;
    }

    public static void main(String[] args) {
        Dog spot = new Dog("Spot", "bark!");
        Dog scruffy = new Dog("Scruffy", "bark! bark!");
        Dog tuzik = spot;//объект tuzik ссылается на объект spot

        System.out.println(spot.mName + ": " + spot.mSays);
        System.out.println(scruffy.mName + ": " + scruffy.mSays);

        System.out.println(spot == tuzik);//сравнение по ссылке
        System.out.println(spot.equals(tuzik));//если метод equals не переопределен, то он сравнивает по ссылке

    }

}
