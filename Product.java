/**
 * @program: homework_assignment_2
 * @filename: Product
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public final class Product {
    private final  String productName;
    private final  String productDescription;
    private final  double productPrice;
    private final  double maximumQuantity;

    public Product(String productName, String productDescription, double productPrice, double maximumQuantity) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.maximumQuantity = maximumQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getMaximumQuantity() {
        return maximumQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                ", maximumQuantity=" + maximumQuantity +
                '}';
    }
}
