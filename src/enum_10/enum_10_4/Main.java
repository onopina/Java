package enum_10.enum_10_4;

/**
 * 4.	Описать класс Clothes (одежда).
 *  Определить поля: для кого предназначена (мужчина / женщина), размер, цвет.
 */
public class Main {
    public static void main(String[] args) {
        Clothes clothes = new Clothes("Shorts", Sex.WOMENS, Size.SMALL, Color.GREEN);
        System.out.println("Your clothes: " + clothes);
    }
}
