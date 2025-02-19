package JavaBai3;

public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");//Ngăn cách dòng

        Product p1 = new Product("Product1",12000, 500, "Category1");
        Product p2 = new Product("Product2",13000, 600, "Category1");
        Product p3 = new Product("Product3",14000, 300, "Category2");
        Product p4 = new Product("Product4",15000, 400, "Category3");
        Product p5 = new Product("Product5",16000, 100, "Category2");
        Product p6 = new Product("Product6",20000, 100, "Category4");

        ProductManager pm = new ProductManager();
        //Thêm sản phẩm vào productsList
        pm.addProduct(p1);
        pm.addProduct(p2);
        pm.addProduct(p3);
        pm.addProduct(p4);
        pm.addProduct(p5);
        pm.addProduct(p6);
        //In ra danh sách các sản phẩm
        pm.showProducts();

        System.out.println("========================================");//Ngăn cách dòng

//        //Xóa một sản phẩm ra khỏi productsList
//        pm.removeProduct(p1);
//        //In ra danh sách sau khi xóa
//        pm.showProducts();
//
//        System.out.println("========================================");//Ngăn cách dòng
//
//        //In ra sản phẩm có giá cao nhất trong productsList
//        pm.highestPriceProduct();
//
//        System.out.println("========================================");//Ngăn cách dòng

        //Lọc sản phẩm theo Category
        pm.filterByCategory("Category1");
    }
}
