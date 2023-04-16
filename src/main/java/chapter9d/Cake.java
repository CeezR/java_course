package chapter9d;

public class Cake {
    private String flavor;
    private String price;
    public Cake (String flavor) {
        setFlavor(flavor);
        setPrice("20.00");
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
