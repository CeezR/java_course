package chapter9d;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake("Chocolate");
        System.out.println(cake.getFlavor());
        System.out.println(cake.getPrice());
        BirthdayCake birthdayCake = new BirthdayCake("Vanilla");
        System.out.println(birthdayCake.getFlavor());
        System.out.println(birthdayCake.getPrice());
        System.out.println(birthdayCake.getCandles());
        WeddingCake weddingCake = new WeddingCake("Strawberry");
        System.out.println(weddingCake.getFlavor());
        System.out.println(weddingCake.getPrice());
        System.out.println(weddingCake.getTiers());

    }
}
