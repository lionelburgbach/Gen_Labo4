package heig_vd.labo4;

public class Product {
    public static final int SIZE_NOT_APPLICABLE = -1;
    private String code;
    private Color color;
    private int size;
    private double price;
    private String currency;

    public Product(String code, Color color, int size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public String getColorFor() {
        switch (color.getColor()) {
            case 1:
                return "blue";
            case 2:
                return "red";
            case 3:
                return "yellow";
            default:
                return "no color";
        }
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}