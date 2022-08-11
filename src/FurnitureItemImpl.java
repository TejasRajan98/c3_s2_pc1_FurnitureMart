import java.util.Scanner;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter furniture code: ");
        furnitureItem.furnitureCode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter furniture type: ");
        furnitureItem.furnitureType =  sc.nextLine();
        System.out.println("Enter grade of furniture: ");
        furnitureItem.gradeOfFurniture =  sc.nextLine();
        System.out.println("Enter furniture usage: ");
        furnitureItem.furnitureUsage =  sc.nextLine();
        furnitureItem.price =  10;

        System.out.println("\nFurniture code: " + furnitureItem.furnitureCode);
        System.out.println("Furniture type: " + furnitureItem.furnitureType);
        System.out.println("Furniture grade: " + furnitureItem.gradeOfFurniture);
        System.out.println("Furniture usage: " + furnitureItem.furnitureUsage);
        System.out.println("Price: $" + furnitureItem.price);

        if(furnitureItem.furnitureUsage.equals("outdoor"))
            System.out.println("\nDiscounted price: $" + furnitureItem.calculateDiscount());
    }
}
