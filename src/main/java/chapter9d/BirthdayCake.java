package chapter9d;

public class BirthdayCake extends Cake{
    private String candles;
    public BirthdayCake(String flavor) {
        super(flavor);
        setPrice("30.00");
    }
    public String getCandles() {
        return candles;
    }
    public void setCandles(String candles) {
        this.candles = candles;
    }
}
