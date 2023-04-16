package chapter10;

public class Apple extends Fruit{

    public Apple(int calories) {
        super(calories);
    }
    public void RevomeSeed() {
        System.out.println("Seed is removed");
    }
    @Override
    public void MakeJuice() {
        System.out.println("Apple juice is made");
    }
}
