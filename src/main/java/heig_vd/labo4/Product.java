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

    public void productAttribute(StringBuffer sb, Product product) {
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(product.getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(product.getColorFor());
        sb.append("\", ");

        if (!product.getSize().equals(Product.SIZE_NOT_APPLICABLE)) {
            sb.append("\"size\": \"");
            sb.append(product.getSize());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(product.getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(product.getCurrency());
        sb.append("\"}, ");
    }
}