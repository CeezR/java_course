package chapter10;

public class FruitMarket {
    public static void main(String[] args) {
        Apple apple = new Apple(100);
        Banana banana = new Banana(200);
        apple.RevomeSeed();
        banana.Peel();
        apple.MakeJuice();
        banana.MakeJuice();
    }
}
