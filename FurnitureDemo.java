
package Bai1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vudangkhoa
 */
public class FurnitureDemo {
    public static void main(String[] args) {
        // Tạo danh sách Furniture
        List<Furniture> furnitureList = new ArrayList<>();

        // Thêm các đối tượng vào danh sách
        furnitureList.add(new Chair("Wood", 50.0, 4));
        furnitureList.add(new Table("Glass", 120.0, new Shape("Rectangle")));
        furnitureList.add(new Chair("Metal", 35.0, 3));

        // In ra danh sách
        System.out.println("Danh sách Furniture:");
        for (Furniture furniture : furnitureList) {
            if (furniture instanceof Chair) {
                Chair chair = (Chair) furniture;
                System.out.println("Chair - Material: " + chair.getMaterial() + ", Price: " + chair.getPrice() +
                        ", Legs: " + chair.getNumOfLegs());
            } else if (furniture instanceof Table) {
                Table table = (Table) furniture;
                System.out.println("Table - Material: " + table.getMaterial() + ", Price: " + table.getPrice() +
                        ", Shape: " + table.getShape().getShapeName());
            }
        }

        // Tìm kiếm phần tử trong danh sách
        double searchPrice = 50.0;
        System.out.println("\nTìm kiếm Furniture với giá " + searchPrice + ":");
        for (Furniture furniture : furnitureList) {
            if (furniture.getPrice() == searchPrice) {
                System.out.println("Tìm thấy - Material: " + furniture.getMaterial() + ", Price: " + furniture.getPrice());
            }
        }

        // Xóa phần tử theo từ khóa trong danh sách
        String keyword = "Glass";
        System.out.println("\nXóa Furniture với vật liệu " + keyword + ":");
        Iterator<Furniture> iterator = furnitureList.iterator();
        while (iterator.hasNext()) {
            Furniture furniture = iterator.next();
            if (furniture.getMaterial().equalsIgnoreCase(keyword)) {
                iterator.remove();
                System.out.println("Đã xóa - Material: " + furniture.getMaterial() + ", Price: " + furniture.getPrice());
            }
        }

        // In ra danh sách sau khi xóa
        System.out.println("\nDanh sách Furniture sau khi xóa:");
        for (Furniture furniture : furnitureList) {
            if (furniture instanceof Chair) {
                Chair chair = (Chair) furniture;
                System.out.println("Chair - Material: " + chair.getMaterial() + ", Price: " + chair.getPrice() +
                        ", Legs: " + chair.getNumOfLegs());
            } else if (furniture instanceof Table) {
                Table table = (Table) furniture;
                System.out.println("Table - Material: " + table.getMaterial() + ", Price: " + table.getPrice() +
                        ", Shape: " + table.getShape().getShapeName());
            }
        }
    }
}

