package JavaBai3;

import java.util.LinkedList;

public class CartManager {
    LinkedList<Product> productsInCart = new LinkedList<Product>();

    //Thêm sản phẩm vào giỏ hàng
    public void addProductToCart(Product p) {
        productsInCart.add(p);
    }
    //Xóa sản phẩm ra khỏi giỏ hàng
    public void removeProductFromCart(Product p) {
        productsInCart.remove(p);
    }
    //Hiển thị thông tin giỏ hàng
    public void showCartInfo() {
        for (Product p : productsInCart) {
            System.out.println(p);
        }
    }


}
