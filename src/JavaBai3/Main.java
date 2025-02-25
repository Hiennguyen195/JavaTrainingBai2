package JavaBai3;

public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");//Ngăn cách dòng

        Product p1 = new Product("Product1",17000, "Category1");
        Product p2 = new Product("Product2",13000, "Category1");
        Product p3 = new Product("Product3",19000, "Category2");
        Product p4 = new Product("Product4",36000, "Category3");
        Product p5 = new Product("Product5",25000, "Category2");
        Product p6 = new Product("Product6",20000, "Category4");

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

        //Xóa một sản phẩm ra khỏi productsList
//        pm.removeProduct(p1);
        //In ra danh sách sau khi xóa
//        pm.showProducts();

//        System.out.println("========================================");//Ngăn cách dòng
//
        //In ra sản phẩm có giá cao nhất trong productsList
//        pm.highestPriceProduct();
//
//        System.out.println("========================================");//Ngăn cách dòng

        //Lọc sản phẩm theo Category
//        pm.filterByCategory("Category1");
//
//        System.out.println("========================================");//Ngăn cách dòng

        //Sắp xếp sản phẩm theo giá tăng dần
//        pm.sortProductsByPrice();

//        System.out.println("========================================");//Ngăn cách dòng

        User u1 = new User(1, "user1", "password1");
        User u2 = new User(2, "user2", "password2");
        User u3 = new User(3, "user3", "password3");
        User u4 = new User(4, "user4", "password4");
        User u5 = new User(5, "user5", "password5");
        User u6 = new User(6, "user6", "password6");
        User u7 = new User(7, "user7", "password7");
        User u8 = new User(8, "user8", "password8");
        User u9 = new User(9, "user9", "password9");

        UserManager userManager = new UserManager();
        userManager.addUser(u1);
        userManager.addUser(u2);
        userManager.addUser(u3);
        userManager.addUser(u4);
        userManager.addUser(u5);
        userManager.addUser(u6);
        userManager.addUser(u7);
        userManager.addUser(u8);
        userManager.addUser(u9);

        userManager.showUsersInfo();

        System.out.println("========================================");//Ngăn cách dòng

        //Check email trùng lặp
//        userManager.checkDuplicateEmail();

        Category c1 = new Category("category1","Category1_Description");
        Category c3 = new Category("category3","Category3_Description");
        Category c5 = new Category("category5","Category5_Description");
        Category c2 = new Category("category2","Category2_Description");
        Category c9 = new Category("category9","Category9_Description");

        CategoryManager cm = new CategoryManager();
        cm.addCategory(c1);
        cm.addCategory(c3);
        cm.addCategory(c5);
        cm.addCategory(c2);
        cm.addCategory(c9);

        cm.showCategories();

        System.out.println("========================================");//Ngăn cách dòng



    }
}
