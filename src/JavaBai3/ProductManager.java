package JavaBai3;

import java.util.*;

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
    //Phương thức sắp xếp sản phẩm theo giá
    public void sortProductsByPrice() {
        //CÁCH 1: Cơ bản
        Collections.sort(productsList, new Comparator<Product>() { //Tạo một comparator so sánh giá hai sản phẩm
            @Override
            public int compare(Product p1, Product p2) { //Nếu muốn xếp theo giảm dần chỉ cần đổi chỗ p1 và p2
                return Double.compare(p1.getProductPrice(), p2.getProductPrice());
            }
        });
        //CÁCH 2: Nhanh nhất, gọn nhất, dễ đọc nhất, sử dụng reversed() cho hiệu suất nhanh nhất
//        productsList.sort(Comparator.comparing(Product::getProductPrice));//Tăng dần
//        productsList.sort(Comparator.comparing(Product::getProductPrice).reversed());//Giảm dần

        System.out.println("Danh sách sản phẩm theo giá tăng dần là: ");//In ra danh sách đã sắp xếp
        for (Product product : productsList) {
            System.out.println(product.toString());
        }
    }
}
