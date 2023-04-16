package chapter11b;

public class Farm {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Duck();
        animals[1] = new Pig();
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
        }
    }
}
