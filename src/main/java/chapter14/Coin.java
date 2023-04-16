package chapter14;

public class Coin {
    public static final String HEADS = "Heads";
    public static final String TAILS = "Tails";
    private String side;
    public void setSide(String side) {
        this.side = side;
    }
    public String getSide() {
        return side;
    }
    public void flip() {
        if (Math.random() < 0.5) {
            setSide(HEADS);
        } else {
            setSide(TAILS);
        }
    }
    public static String getOpposite(String side) {
        if (side.equalsIgnoreCase(HEADS)) {
            return TAILS;
        } else {
            return HEADS;
        }
    }
}
