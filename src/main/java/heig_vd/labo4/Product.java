package heig_vd.labo4;

public class Product {
    public static final String SIZE_NOT_APPLICABLE = "Invalid Size";
    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
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
        return color.getColor();
    }

    public String getSize() {
        return size.getSize();
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}