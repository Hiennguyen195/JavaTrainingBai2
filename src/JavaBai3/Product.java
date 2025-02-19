package JavaBai3;

public class Product {
    private String productName;
    private double productPrice;
    private String productCategory;

    public Product(String productName, double productPrice, String productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Tên sản phẩm: " + productName + ", Giá sản phẩm: " + productPrice + "vnđ" + ", " +
                "Danh mục sản phẩm: " + productCategory;
    }
    public void showInfo() {
        System.out.println(toString());
    }
}
