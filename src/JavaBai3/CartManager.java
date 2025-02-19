package JavaBai3;

import java.util.LinkedList;

public class CartManager {
    LinkedList<Product> productsInCart = new LinkedList<Product>();

    //Thêm sản phẩm vào giỏ hàng
    public void addProduct(Product p) {
        productsInCart.add(p);
    }
}
