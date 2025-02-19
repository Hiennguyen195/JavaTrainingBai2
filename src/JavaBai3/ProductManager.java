package JavaBai3;

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
}
