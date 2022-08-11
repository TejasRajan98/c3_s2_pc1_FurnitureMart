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
        System.out.println("Enter furniture price: ");
        furnitureItem.price =  sc.nextDouble();
        if(furnitureItem.furnitureUsage == "outdoor")
            System.out.println("Discounted price: " + furnitureItem.calculateDiscount());
    }
}
