public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String furnitureUsage;
    double price;

    FurnitureItem(){
        furnitureCode = 0;
        furnitureType = null;
        gradeOfFurniture = null;
        furnitureUsage = null;
        price = 0;
    }
    double calculateDiscount(){
            return price - price * 5 / 100;
    }
}
