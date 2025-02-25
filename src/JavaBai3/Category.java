package JavaBai3;

public class Category implements Comparable<Category> {
    private String name;
    private String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " - " + description;
    }

    @Override
    public int compareTo(Category other) {
        return this.name.compareTo(other.name); // Sắp xếp theo tên
    }

}
