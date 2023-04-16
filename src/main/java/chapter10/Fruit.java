package chapter10;

public class Fruit {
    private int calories;
    public Fruit(int calories) {
        setCalories(calories);
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void MakeJuice() {
        System.out.println("Juice is made");
    }

}
