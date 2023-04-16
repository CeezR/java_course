package chapter9d;

public class WeddingCake extends Cake{
    private String tiers;
    public WeddingCake(String flavor) {
        super(flavor);
        setPrice("40.00");
    }
    public String getTiers() {
        return tiers;
    }
    public void setTiers(String tiers) {
        this.tiers = tiers;
    }
}
