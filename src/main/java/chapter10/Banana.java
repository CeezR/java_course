package chapter10;

public class Banana extends Fruit{

        public Banana(int calories) {
            super(calories);
        }
        public void Peel() {
            System.out.println("Peel is removed");
        }
        @Override
        public void MakeJuice() {
            System.out.println("Banana juice is made");
        }
}
