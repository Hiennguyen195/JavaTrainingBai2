package JavaBai3;

import java.util.TreeSet;

public class CategoryManager {
    TreeSet<Category> productsCategories = new TreeSet<>();

    // Thêm vào Category List
    public void addCategory(Category category) {
        productsCategories.add(category);
    }
    // Hiện thông tin của Category
    public void showCategories() {
        for (Category category : productsCategories) {
            System.out.println(category);
        }
    }
}
