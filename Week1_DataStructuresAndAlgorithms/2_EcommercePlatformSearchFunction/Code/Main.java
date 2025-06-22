public class Main {
    public static void main(String[] args){
        Product[] products={
            new Product(101,"Shoes","Footwear"),
            new Product(205,"T-Shirt","Clothing"),
            new Product(309,"Laptop","Electronics"),
            new Product(402,"Watch","Accessories"),
            new Product(520,"Phone","Accessories"),
            new Product(601,"Table Lamp","Home Decor"),
            new Product(715,"Book","Education")
        };
        Product foundLinear = LinearSearch.linearSearch(products, 309);
        System.out.println(foundLinear != null ? "Found (Linear): " + foundLinear.productName : "Not Found");

        Product foundBinary = BinarySearch.binarySearch(products, 309);
        System.out.println(foundBinary != null ? "Found (Binary): " + foundBinary.productName : "Not Found");
    }
}