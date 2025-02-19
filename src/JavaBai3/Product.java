package JavaBai3;

public class Product {
    private String productName;
    private double productPrice;
    private int productStock;
    private String productCategory;

    public Product(String productName, double productPrice, int productStock, String productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
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
    public int getProductStock() {
        return productStock;
    }
    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Tên sản phẩm: " + productName + ", Giá sản phẩm: " + productPrice + "vnđ" + ", Số lượng trong kho: "
                + productStock + ", Danh mục sản phẩm: " + productCategory;
    }
    public void showInfo() {
        System.out.println(toString());
    }
}
