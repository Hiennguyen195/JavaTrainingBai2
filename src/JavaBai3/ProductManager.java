package JavaBai3;

import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ProductManager {
    List<Product> productsList = new ArrayList<>(); //Tạo ArrayList quản lý Product

    //Phương thức thêm sản phẩm vào productsList
    public void addProduct(Product product) {
        productsList.add(product);
    }
    //Phương thức in ra danh sách các sản phẩm co trong productsList
    public void showProducts() {
        for (Product product : productsList) {
            System.out.println(product.toString());
        }
    }
    //Phương thức xóa sản phẩm ra khỏi productsList
    public void removeProduct(Product product) {
        productsList.remove(product);
    }
    //Phương thức trả về sản phẩm có giá cao nhất
    public void highestPriceProduct() {
        double highestPrice = 0;
        int x = 0;

        for (int i = 0; i<productsList.size(); i++) {
            Product prd = productsList.get(i);
            if (prd.getProductPrice() > highestPrice) {
                highestPrice = prd.getProductPrice();
                x = i;
            }
        }
        System.out.println("Sản phẩm có giá cao nhất trong danh sách là: " +"\n"+ productsList.get(x).toString());
    }
    //Phương thức lọc product theo một Category cụ thể
    public void filterByCategory(String category) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getProductCategory().equals(category)) {
                filteredProducts.add(product);
            }
        }
        System.out.format("Sản phẩm thuộc %s là: \n", category);
        for (Product product : filteredProducts) {
            System.out.println(product.toString());
        }
    }
}
