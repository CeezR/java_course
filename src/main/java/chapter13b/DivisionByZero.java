package chapter13b;

public class DivisionByZero {
    public static void main(String[] args) {
        try
        {
            int c = 30 / 0;
            System.out.println(c);
        }catch (ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed");
        }finally {
            System.out.println("This is the finally block");
        }

    }
}
